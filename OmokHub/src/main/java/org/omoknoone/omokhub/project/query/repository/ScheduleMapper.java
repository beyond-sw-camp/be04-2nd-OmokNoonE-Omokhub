package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.Schedule;
import org.omoknoone.omokhub.project.query.ScheduleDTO;
import org.omoknoone.omokhub.project.query.UserAndScheduleDTO;

import java.util.List;
@Mapper
public interface ScheduleMapper {
    List<ProjectAndScheduleDTO> selectScheduleByProject(Integer projectId);

    List<UserAndScheduleDTO> selectScheduleByUser(String memberId);
}
