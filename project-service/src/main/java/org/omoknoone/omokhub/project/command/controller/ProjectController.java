package org.omoknoone.omokhub.project.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.dto.ProjectDTO;
import org.omoknoone.omokhub.project.command.service.ProjectService;
import org.omoknoone.omokhub.project.command.vo.RequestProject;
import org.omoknoone.omokhub.project.command.vo.ResponseProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project/projects")
public class ProjectController {
    private final ModelMapper modelMapper;
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ModelMapper modelMapper, ProjectService projectService) {
        this.modelMapper = modelMapper;
        this.projectService = projectService;
    }

    @PostMapping("/regist")
    public ResponseEntity<ResponseProject> registProject(@RequestBody RequestProject requestProject){
        ProjectDTO newProject = modelMapper.map(requestProject, ProjectDTO.class);

        projectService.registProject(newProject);

        ResponseProject responseProject = modelMapper.map(newProject, ResponseProject.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseProject);
    }

    @PostMapping("/modify")
    public ResponseEntity<ResponseProject> modifyProject(@RequestBody RequestProject requestProject){
        ProjectDTO modifyProject = modelMapper.map(requestProject, ProjectDTO.class);

        projectService.modifyProject(modifyProject);

        ResponseProject responseProject = modelMapper.map(modifyProject, ResponseProject.class);
        return ResponseEntity.status(HttpStatus.OK).body(responseProject);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseProject> deleteProject(@RequestBody RequestProject requestProject){
        ProjectDTO deleteProject = modelMapper.map(requestProject, ProjectDTO.class);

        projectService.deleteProject(deleteProject);

        ResponseProject responseProject = modelMapper.map(deleteProject, ResponseProject.class);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(responseProject);
    }
}
