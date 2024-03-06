package org.omoknoone.omokhub.project.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.dto.ScheduleDTO;
import org.omoknoone.omokhub.project.command.service.ScheduleService;
import org.omoknoone.omokhub.project.command.vo.RequestSchedule;
import org.omoknoone.omokhub.project.command.vo.ResponseSchedule;
import org.omoknoone.omokhub.project.command.vo.ResponseSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project/schedule")
public class ScheduleController {
    private ModelMapper modelMapper;
    private ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ModelMapper modelMapper,
                              ScheduleService scheduleService) {
        this.modelMapper = modelMapper;
        this.scheduleService = scheduleService;
    }

    @PostMapping("/regist")
    public ResponseEntity<ResponseSchedule> registSchedule(@RequestBody RequestSchedule schedule){

        /* 설명. RequestUser -> UserDTO */
        ScheduleDTO newSchedule = modelMapper.map(schedule, ScheduleDTO.class);

        /* 설명. 회원가입 비즈니스 로직 시작 */
        scheduleService.registSchedule(newSchedule);

        /* 설명. UserDTO -> ResponseUser */
        ResponseSchedule responseSchedule = modelMapper.map(newSchedule, ResponseSchedule.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseSchedule);
    }

    @PostMapping("/modify")
    public ResponseEntity<ResponseSchedule> modifySchedule(@RequestBody RequestSchedule schedule){

        /* 설명. RequestUser -> UserDTO */
        ScheduleDTO modifySchedule = modelMapper.map(schedule, ScheduleDTO.class);

        /* 설명. 회원가입 비즈니스 로직 시작 */
        scheduleService.modifySchedule(modifySchedule);

        /* 설명. UserDTO -> ResponseUser */
        ResponseSchedule responseSchedule = modelMapper.map(modifySchedule, ResponseSchedule.class);
        return ResponseEntity.status(HttpStatus.OK).body(responseSchedule);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseSchedule> deleteSchedule(@RequestBody RequestSchedule schedule){

        /* 설명. RequestUser -> UserDTO */
        ScheduleDTO deleteSchedule = modelMapper.map(schedule, ScheduleDTO.class);

        /* 설명. 회원가입 비즈니스 로직 시작 */
        scheduleService.deleteSchedule(deleteSchedule);

        /* 설명. UserDTO -> ResponseUser */
        ResponseSchedule responseSchedule = modelMapper.map(deleteSchedule, ResponseSchedule.class);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(responseSchedule);
    }
}
