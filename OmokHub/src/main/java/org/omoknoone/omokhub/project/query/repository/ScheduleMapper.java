package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.Schedule;
import org.omoknoone.omokhub.project.query.ScheduleDTO;

import java.util.List;
@Mapper
public interface ScheduleMapper {
    List<ScheduleDTO> selectScheduleByProject(Integer projectId);

    List<ScheduleDTO> selectScheduleByUser(String memberId);
}
