package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {


    List<ProjectAndTeamAndMemberDTO> searchProjectByProjectId(int projectId);

    List<ProjectAndTeamAndMemberDTO> searchProjectByStatus(String status);

    List<ProjectAndTeamAndMemberDTO> searchProjectByTeamName(String teamName);

    List<ProjectAndTeamAndMemberDTO> searchMyProjects(String memberId);

    List<ProjectAndScheduleDTO> searchSchedulesByProjectId(int projectId);

    List<ProjectAndTeamAndMemberDTO> searchProjectByTitle(String title);

    List<ProjectAndTeamAndMemberDTO> searchProjectByStatusList(List<String> statusList);

    List<ProjectAndTeamAndMemberDTO> searchProjectByOptions(Map<String, Object> params);
}
