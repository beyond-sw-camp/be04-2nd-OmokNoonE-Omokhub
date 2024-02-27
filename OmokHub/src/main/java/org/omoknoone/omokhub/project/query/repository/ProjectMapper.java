package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.ProjectDTO;

import java.util.List;

@Mapper
public interface ProjectMapper {


    List<ProjectDTO> searchProjectByProjectId(int projectId);

    List<ProjectDTO> searchProjectByStatus(String status);

    List<ProjectDTO> searchProjectByTeamName(String teamName);

    List<ProjectDTO> searchMyProjects(int memberId);
}
