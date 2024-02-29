package org.omoknoone.omokhub.projectmember.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.projectmember.query.ProjectTeamDTO;

import java.util.List;

@Mapper
public interface ProjectTeamMapper {
    List<ProjectTeamDTO> selectProjectTeamInfo(int projectTeamId);

    List<ProjectTeamDTO> selectProjectByLeftMember();
}
