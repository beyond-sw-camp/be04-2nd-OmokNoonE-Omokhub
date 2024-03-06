package org.omoknoone.omokhub.projectmember.command.repository;

import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectTeamRepository extends JpaRepository<ProjectTeam, Integer> {
}
