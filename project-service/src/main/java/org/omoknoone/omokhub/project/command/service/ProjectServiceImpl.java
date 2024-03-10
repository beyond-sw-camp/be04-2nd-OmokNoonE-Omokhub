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
        newProject.setLastModifiedDate(LocalDateTime.now());
        newProject.setIsPublic(true);
        Project project = modelMapper.map(newProject, Project.class);
        projectRepository.save(project);
    }

    @Transactional
    @Override
    public void modifyProject(ProjectDTO modifyProject) {
        Project findproject = projectRepository.findById(modifyProject.getProjectId()).orElseThrow(IllegalArgumentException::new);

        findproject.setStartDate(modifyProject.getStartDate());
        findproject.setEndDate(modifyProject.getEndDate());

        /* 설명. 수정 시, 자동으로 현재 시간으로 작성되도록 설계 */
        findproject.setLastModifiedDate(LocalDateTime.now());

        /* 설명. 프로젝트 진행상태가 완료로 변경될 경우, 현재 시간으로 완료날짜가 기록되도록 설계 */
        findproject.setStatus(modifyProject.getStatus());
        if (findproject.getStatus().equals("완료")) {
            findproject.setEndDate(LocalDateTime.now());
        }

        findproject.setIsPublic(modifyProject.getIsPublic());

        projectRepository.flush();
    }

    @Transactional
    @Override
    public void deleteProject(ProjectDTO deleteProject) {
        projectRepository.deleteById(deleteProject.getProjectId());
    }
}
