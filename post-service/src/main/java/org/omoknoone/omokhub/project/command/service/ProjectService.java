package org.omoknoone.omokhub.project.command.service;

import org.omoknoone.omokhub.project.command.dto.ProjectDTO;

public interface ProjectService {
    void registProject(ProjectDTO newProject);

    void modifyProject(ProjectDTO modifyProject);

    void deleteProject(ProjectDTO deleteProject);
}
