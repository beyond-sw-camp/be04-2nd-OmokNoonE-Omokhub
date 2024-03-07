package org.omoknoone.omokhub.projectmember.command.controller;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.command.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.command.service.ProjectTeamService;
import org.omoknoone.omokhub.projectmember.command.vo.RequestTeam;
import org.omoknoone.omokhub.projectmember.command.vo.ResponseTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("commandProjectTeamController")
@RequestMapping(("/projectmember/teams"))
@Slf4j
public class ProjectTeamController {

    private final ProjectTeamService projectTeamService;
    private final ModelMapper modelMapper;

    @Autowired
    public ProjectTeamController(ProjectTeamService projectTeamService, ModelMapper modelMapper) {
        this.projectTeamService = projectTeamService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/regist")
    public ResponseEntity<ResponseTeam> registTeam(@RequestBody RequestTeam newTeam) {
        ProjectTeamDTO projectTeamDTO = modelMapper.map(newTeam, ProjectTeamDTO.class);

        /* 설명. 비즈니스 로직 시작 */
        projectTeamService.registTeam(projectTeamDTO);

        ResponseTeam responseTeam = modelMapper.map(projectTeamDTO, ResponseTeam.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseTeam);

    }

    /* 필기. 팀이름, 최대인원, 활성화 여부 */
    @GetMapping("/modify")
    public void ModifyPage() {
    }

    @PostMapping("/modify")
    public String Teamlist() {
        return null;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseTeam> deleteTeam(@RequestBody RequestTeam selectedTeam) {
        ProjectTeamDTO projectTeamDTO = modelMapper.map(selectedTeam, ProjectTeamDTO.class);

        /* 설명. 비즈니스 로직 시작 */
        projectTeamService.deleteTeam(projectTeamDTO);

        ResponseTeam responseTeam = modelMapper.map(projectTeamDTO, ResponseTeam.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseTeam);
    }

}
