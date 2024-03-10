package org.omoknoone.omokhub.project.query.controller;

import org.omoknoone.omokhub.project.query.dto.IssueAndMemberDTO;
import org.omoknoone.omokhub.project.query.service.IssueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("QueryIssueController")
@RequestMapping("project/issues")
public class IssueController {

    private IssueServiceImpl issueServiceImpl;

    @Autowired
    public IssueController(IssueServiceImpl issueServiceImpl) {
        this.issueServiceImpl = issueServiceImpl;
    }


    @GetMapping("/project-id/{projectId}")
    public ResponseEntity<List<IssueAndMemberDTO>> searchProjectIssuesById (@PathVariable int projectId){
        List<IssueAndMemberDTO> issues = issueServiceImpl.searchProjectIssuesById(projectId);

        return ResponseEntity.status(HttpStatus.OK).body(issues);
    }

    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<List<IssueAndMemberDTO>> searchProjectIssuesByMemberId(@PathVariable String memberId){
        List<IssueAndMemberDTO> issues = issueServiceImpl.searchProjectIssuesByMemberId(memberId);

        return ResponseEntity.status(HttpStatus.OK).body(issues);
    }
}
