package org.omoknoone.omokhub.project.command.service;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.aggregate.Project;
import org.omoknoone.omokhub.project.command.dto.ProjectDTO;
import org.omoknoone.omokhub.project.command.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class ProjectServiceImpl implements ProjectService{

    private final ModelMapper modelMapper;
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ModelMapper modelMapper, ProjectRepository projectRepository) {
        this.modelMapper = modelMapper;
        this.projectRepository = projectRepository;
    }

    @Transactional
    @Override
    public void registProject(ProjectDTO newProject) {
        newProject.setStartDate(LocalDateTime.now());
        newProject.setEndDate(LocalDateTime.now());
        newProject.setLastModifiedDate(LocalDateTime.now());
        newProject.setIsPublic(true);
        Project project = modelMapper.map(newProject, Project.class);
        projectRepository.save(project);
    }

    @Transactional
    @Override
    public void modifyProject(ProjectDTO modifyProject) {
        Project findproject = projectRepository.findById(modifyProject.getProjectId()).orElseThrow(IllegalArgumentException::new);

        findproject.setTitle(modifyProject.getTitle());
        findproject.setStartDate(modifyProject.getStartDate());
        findproject.setEndDate(modifyProject.getEndDate());
        findproject.setLastModifiedDate(LocalDateTime.now());
        findproject.setStatus(modifyProject.getStatus());
        findproject.setProjectTeamId(modifyProject.getProjectTeamId());
        findproject.setProjectMemberId(modifyProject.getProjectMemberId());
        findproject.setIsPublic(modifyProject.getIsPublic());

        projectRepository.save(modelMapper.map(findproject, Project.class));
    }

    @Transactional
    @Override
    public void deleteProject(ProjectDTO deleteProject) {
        projectRepository.deleteById(deleteProject.getProjectId());
    }
}
