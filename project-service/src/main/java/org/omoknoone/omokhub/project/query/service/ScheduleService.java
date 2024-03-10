package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.UserAndScheduleDTO;

import java.util.List;

public interface ScheduleService {
    List<ProjectAndScheduleDTO> scheduleInProject(int projectId);

    List<UserAndScheduleDTO> mySchedule(String memberId);
}
