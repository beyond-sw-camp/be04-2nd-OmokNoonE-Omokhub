package org.omoknoone.omokhub.projectmember.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.command.service.ProjectMemberService;
import org.omoknoone.omokhub.projectmember.command.vo.ChangeLeaderResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("commandProjectMemberController")
@RequestMapping("/project-member")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;
    private final ModelMapper modelMapper;

    @Autowired
    public ProjectMemberController(ProjectMemberService projectMemberService, ModelMapper modelMapper) {
        this.projectMemberService = projectMemberService;
        this.modelMapper = modelMapper;
    }

    @PutMapping("/change-leader/{projectTeamId}/{newLeaderId}")
    public ResponseEntity<ChangeLeaderResponseVO> changeLeader(@PathVariable Integer projectTeamId, @PathVariable Integer newLeaderId) {
        projectMemberService.changeLeader(projectTeamId, newLeaderId);
        return new ResponseEntity<>(new ChangeLeaderResponseVO("팀장 변경이 성공적으로 완료되었습니다."), HttpStatus.OK);
    }
}
