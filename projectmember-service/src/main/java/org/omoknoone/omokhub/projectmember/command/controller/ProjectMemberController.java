package org.omoknoone.omokhub.projectmember.command.controller;

import org.modelmapper.ModelMapper;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.omoknoone.omokhub.projectmember.query.service.ProjectMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("commandProjectMemberController")
@RequestMapping("/project_member/project_member")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;
    private final ModelMapper modelMapper;
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public ProjectMemberController(ProjectMemberService projectMemberService, ModelMapper modelMapper) {
        this.projectMemberService = projectMemberService;
        this.modelMapper = modelMapper;
    }

    @PutMapping("/change_leader/{projectTeamId}/{newLeaderId}")
    public ResponseEntity<?> changeLeader(int projectTeamId, int newLeaderId) {
        projectMemberService.updateAuthority(projectTeamId, newLeaderId);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
