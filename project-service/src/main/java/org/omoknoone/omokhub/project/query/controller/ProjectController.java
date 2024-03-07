package org.omoknoone.omokhub.project.query.controller;

import jakarta.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;
import org.omoknoone.omokhub.project.query.dto.ProjectDTO;
import org.omoknoone.omokhub.project.query.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("QueryProjectController")
@RequestMapping("/project/projects")
//@Slf4j
public class ProjectController {
    private final ProjectService projectService;
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/project-id/{projectId}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProject(@PathVariable("projectId") int projectId){
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.projectByProjectId(projectId);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByStatus(@PathVariable("status") String status){
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchProjectByStatus(status);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }
    @GetMapping("/team-name/{teamName}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByTeam(@PathVariable("teamName") String teamName){
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchProjectByTeamName(teamName);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }
    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<List<ProjectAndTeamAndMemberDTO>> getProjectByMember(@PathVariable("memberId") String memberId){
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectService.searchMyProjects(memberId);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndTeamAndMemberDTOList);
    }


}
