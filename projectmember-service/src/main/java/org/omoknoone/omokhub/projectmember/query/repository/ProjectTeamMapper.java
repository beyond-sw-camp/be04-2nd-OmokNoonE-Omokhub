package org.omoknoone.omokhub.projectmember.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.projectmember.query.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.query.entity.ProjectTeam;

import java.util.List;

@Mapper
public interface ProjectTeamMapper {
    List<ProjectTeamDTO> selectProjectTeamInfo(int projectTeamId);

    List<ProjectTeamDTO> selectProjectByLeftMember();

    List<ProjectTeam> selectProjectTeamByProjectTeamId(int projectTeamId);
}