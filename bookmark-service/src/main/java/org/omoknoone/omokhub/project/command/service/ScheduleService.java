package org.omoknoone.omokhub.project.command.service;


import org.omoknoone.omokhub.project.command.dto.ScheduleDTO;

public interface ScheduleService {
    void registSchedule(ScheduleDTO scheduleDTO);

    void modifySchedule(ScheduleDTO scheduleDTO);

    void deleteSchedule(ScheduleDTO scheduleDTO);
}

