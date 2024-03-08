package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.UserAndScheduleDTO;
import org.omoknoone.omokhub.project.query.repository.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QueryScheduleServiceImpl")
public class ScheduleServiceImpl implements ScheduleService{
    private ScheduleMapper scheduleMapper;

    @Autowired
    public ScheduleServiceImpl(ScheduleMapper scheduleMapper) {
        this.scheduleMapper = scheduleMapper;
    }

    @Override
    public List<ProjectAndScheduleDTO> scheduleInProject(int projectId){
        List<ProjectAndScheduleDTO> schedules = scheduleMapper.selectScheduleByProject(projectId);
        return schedules;
    }

    @Override
    public List<UserAndScheduleDTO> mySchedule(String memberId){
        List<UserAndScheduleDTO> scheduleDTOs = scheduleMapper.selectScheduleByUser(memberId);
        return scheduleDTOs;
    }
}
