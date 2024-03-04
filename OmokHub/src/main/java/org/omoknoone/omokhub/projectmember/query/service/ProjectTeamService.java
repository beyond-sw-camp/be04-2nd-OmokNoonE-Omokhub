package org.omoknoone.omokhub.projectmember.query.service;

import org.omoknoone.omokhub.projectmember.query.entity.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.query.repository.ProjectTeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectTeamService {

    private ProjectTeamMapper projectTeamMapper;

    @Autowired
    public ProjectTeamService(ProjectTeamMapper projectTeamMapper) {
        this.projectTeamMapper = projectTeamMapper;
    }

    public void searchProjectInfo(int projectTeamId) {
        List<ProjectTeamDTO> projectInfo = projectTeamMapper.selectProjectTeamInfo(projectTeamId);
    }

    public void findMemberLeft() {
        List<ProjectTeamDTO> memberLeftProject = projectTeamMapper.selectProjectByLeftMember();
    }
}