package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.UserAndScheduleDTO;

import java.util.List;
@Mapper
public interface ScheduleMapper {
    List<ProjectAndScheduleDTO> selectScheduleByProject(Integer projectId);

    List<UserAndScheduleDTO> selectScheduleByUser(String memberId);
}
