package org.omoknoone.omokhub.project.query.controller;

import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;
import org.omoknoone.omokhub.project.query.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("QueryProjectController")
@RequestMapping("/project/projects")
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/project-id/{projectId}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProject(@PathVariable("projectId") int projectId) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.projectByProjectId(projectId);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByStatus(@PathVariable("status") String status) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchProjectByStatus(status);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }

    @GetMapping("/team-name/{teamName}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByTeam(@PathVariable("teamName") String teamName) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchProjectByTeamName(teamName);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }

    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByMember(@PathVariable("memberId") String memberId) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchMyProjects(memberId);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByTitle(@PathVariable("title") String title) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchProjectByTitle(title);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }

    @GetMapping("/statusList/{statusList}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByStatusList(@PathVariable("statusList") String statusList) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchProjectByStatusList(statusList);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }


}
