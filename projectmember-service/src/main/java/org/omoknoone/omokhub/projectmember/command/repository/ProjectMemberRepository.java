package org.omoknoone.omokhub.projectmember.command.repository;

import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Object> {
}
