package org.omoknoone.omokhub.project.query;

import org.omoknoone.omokhub.project.query.repository.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private ScheduleMapper scheduleMapper;

    @Autowired
    public ScheduleService(ScheduleMapper scheduleMapper) {
        this.scheduleMapper = scheduleMapper;
    }

    public void scheduleInProject(int projectId){
        List<ScheduleDTO> schedules = scheduleMapper.selectScheduleByProject(projectId);
        schedules.forEach(System.out::print);
        System.out.println("scheduleInProject 테스트완료");
    }

    public void mySchedule(String memberId){
        List<ScheduleDTO> scheduleDTOs = scheduleMapper.selectScheduleByUser(memberId);
        scheduleDTOs.forEach(System.out::print);
        System.out.println("mySchedule 테스트 완료");
    }
}
