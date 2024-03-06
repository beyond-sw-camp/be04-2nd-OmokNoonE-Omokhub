package org.omoknoone.omokhub.projectmember.command.service;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectTeam;
import org.omoknoone.omokhub.projectmember.command.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.command.repository.ProjectTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectTeamServiceImpl implements ProjectTeamService {

    private ProjectTeamRepository projectTeamRepository;
    private ModelMapper modelMapper;

    public ProjectTeamServiceImpl() {
    }

    @Autowired
    public ProjectTeamServiceImpl(ProjectTeamRepository projectTeamRepository, ModelMapper modelMapper) {
        this.projectTeamRepository = projectTeamRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public void registTeam(ProjectTeamDTO projectTeamDTO) {

        ProjectTeam projectTeam = modelMapper.map(projectTeamDTO, ProjectTeam.class);
        projectTeamRepository.save(projectTeam);
        projectTeam.getAddedDate();
    }

    @Override
    @Transactional
    public void deleteTeam(ProjectTeamDTO projectTeamDTO) {

        projectTeamRepository.deleteById(projectTeamDTO.getProjectTeamId());
    }
}
