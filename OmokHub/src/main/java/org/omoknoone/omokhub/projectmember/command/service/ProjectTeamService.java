package org.omoknoone.omokhub.projectmember.command.service;

import org.omoknoone.omokhub.projectmember.command.dto.ProjectTeamDTO;

public interface ProjectTeamService {
    void registTeam(ProjectTeamDTO projectTeamDTO);

    void deleteTeam(ProjectTeamDTO projectTeamDTO);
}
