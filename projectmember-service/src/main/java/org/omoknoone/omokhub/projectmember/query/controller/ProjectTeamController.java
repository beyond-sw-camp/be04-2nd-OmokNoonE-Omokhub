package org.omoknoone.omokhub.projectmember.query.controller;

import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.projectmember.query.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.query.service.ProjectTeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("queryProjectTeamController")
@Slf4j
public class ProjectTeamController {
    Logger logger = LoggerFactory.getLogger(getClass());

    private final ProjectTeamService projectTeamService;
    @Autowired
    public ProjectTeamController(ProjectTeamService projectTeamService) {
        this.projectTeamService = projectTeamService;
    }

    @GetMapping("projectmember/projectteams/projectteam-id/{projectTeamId}")
    public ResponseEntity<List<ProjectTeamDTO>> searchProjectInfo(@PathVariable("projectTeamId") int projectTeamId) {
        logger.info("컨트롤러에서 서비스 호출전 {}",projectTeamId);
        List<ProjectTeamDTO> projectTeamDTOList = projectTeamService.searchProjectTeam(projectTeamId);
        logger.info("컨트롤러에서 서비스 호출후 {}",projectTeamId);

        return ResponseEntity.status(HttpStatus.OK).body(projectTeamDTOList);
    }

}
