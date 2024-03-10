package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;

import java.util.List;

@Mapper
public interface ProjectMapper {


    List<ProjectAndTeamAndMemberDTO> searchProjectByProjectId(int projectId);

    List<ProjectAndTeamAndMemberDTO> searchProjectByStatus(String status);

    List<ProjectAndTeamAndMemberDTO> searchProjectByTeamName(String teamName);

    List<ProjectAndTeamAndMemberDTO> searchMyProjects(String memberId);
}
