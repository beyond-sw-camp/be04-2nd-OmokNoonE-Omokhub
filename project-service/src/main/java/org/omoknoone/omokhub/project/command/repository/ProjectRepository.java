package org.omoknoone.omokhub.project.command.repository;

import org.omoknoone.omokhub.project.command.aggregate.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Object>{
}
