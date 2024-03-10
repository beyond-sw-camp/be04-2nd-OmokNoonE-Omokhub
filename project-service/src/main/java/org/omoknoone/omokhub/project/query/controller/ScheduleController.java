package org.omoknoone.omokhub.project.query.controller;

import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.UserAndScheduleDTO;
import org.omoknoone.omokhub.project.query.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("QueryScheduleController")
@RequestMapping("/project/schedules")
public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/project-id/{projectId}")
    public ResponseEntity<List<ProjectAndScheduleDTO>> getProjectSchedules(@PathVariable("projectId") int projectId) {
        List<ProjectAndScheduleDTO> projectAndScheduleDTOList = scheduleService.scheduleInProject(projectId);
        return ResponseEntity.status(HttpStatus.OK).body(projectAndScheduleDTOList);
    }

    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<List<UserAndScheduleDTO>> getUserSchedules(@PathVariable("memberId") String memberId){
        List<UserAndScheduleDTO> userAndScheduleDTOList = scheduleService.mySchedule(memberId);
        return ResponseEntity.status(HttpStatus.OK).body(userAndScheduleDTOList);
    }
}
