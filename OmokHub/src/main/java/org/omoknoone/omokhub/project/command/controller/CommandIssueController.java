package org.omoknoone.omokhub.project.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.dto.IssueDTO;
import org.omoknoone.omokhub.project.command.service.IssueService;
import org.omoknoone.omokhub.project.command.vo.RequestIssue;
import org.omoknoone.omokhub.project.command.vo.ResponseIssue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project/issue")
public class CommandIssueController {

    private final IssueService issueService;
    private final ModelMapper modelMapper;

    @Autowired
    public CommandIssueController(IssueService issueService, ModelMapper modelMapper) {
        this.issueService = issueService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/regist")
    public ResponseEntity<ResponseIssue> registIssue(@RequestBody RequestIssue issue){

        IssueDTO issueDTO = modelMapper.map(issue, IssueDTO.class);
        Logger logger = LoggerFactory.getLogger(getClass());

        issueService.registIssue(issueDTO);

        ResponseIssue responseIssue = modelMapper.map(issueDTO, ResponseIssue.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseIssue);

    }

    @PostMapping("/modify")
    public ResponseEntity<ResponseIssue> modifyIssue(@RequestBody RequestIssue issue){

        IssueDTO issueDTO = modelMapper.map(issue, IssueDTO.class);

        issueService.modifyIssue(issueDTO);

        ResponseIssue responseIssue = modelMapper.map(issueDTO, ResponseIssue.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseIssue);

    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseIssue> deleteIssue(@RequestBody RequestIssue issue){
        IssueDTO issueDTO = modelMapper.map(issue, IssueDTO.class);

        issueService.deleteIssue(issueDTO.getIssueId());

        ResponseIssue responseIssue = modelMapper.map(issueDTO, ResponseIssue.class);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(responseIssue);
    }
}
