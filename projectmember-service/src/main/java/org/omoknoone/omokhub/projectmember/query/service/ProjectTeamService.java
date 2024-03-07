package org.omoknoone.omokhub.projectmember.query.service;

import org.omoknoone.omokhub.projectmember.query.dto.ProjectTeamDTO;

import java.util.List;

public interface ProjectTeamService {
    List<ProjectTeamDTO> searchProjectTeam(int projectTeamId);

}
