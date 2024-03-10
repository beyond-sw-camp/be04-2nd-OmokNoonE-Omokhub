package org.omoknoone.omokhub.project.command.service;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.aggregate.Schedule;
import org.omoknoone.omokhub.project.command.dto.ScheduleDTO;
import org.omoknoone.omokhub.project.command.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class ScheduleServiceImpl implements ScheduleService{
    private final ModelMapper modelMapper;
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleServiceImpl(ModelMapper mapper, ScheduleRepository scheduleRepository) {
        this.modelMapper = mapper;
        this.scheduleRepository = scheduleRepository;
    }

    @Transactional
    @Override
    public void registSchedule(ScheduleDTO newSchedule) {
        newSchedule.setProgress(0);
        newSchedule.setLastModifiedDate(LocalDateTime.now());
        Schedule schedule = modelMapper.map(newSchedule, Schedule.class);
        scheduleRepository.save(schedule);
    }

    @Transactional
    @Override
    public void modifySchedule(ScheduleDTO modifySchedule){
        Schedule findschedule = scheduleRepository.findById(modifySchedule.getScheduleId()).orElseThrow(IllegalArgumentException::new);

        findschedule.setTitle(modifySchedule.getTitle());
        findschedule.setContent(modifySchedule.getContent());
        findschedule.setProgress(modifySchedule.getProgress());
        findschedule.setEndDate(modifySchedule.getEndDate());
        findschedule.setLastModifiedDate(LocalDateTime.now());

        scheduleRepository.flush();
    }

    @Transactional
    @Override
    public void deleteSchedule(ScheduleDTO deleteSchedule){
        scheduleRepository.deleteById(deleteSchedule.getScheduleId());
    }

}
