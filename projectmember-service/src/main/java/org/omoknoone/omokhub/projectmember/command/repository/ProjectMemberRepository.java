package org.omoknoone.omokhub.projectmember.command.repository;

import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Object> {

    @Query("select m from ProjectMember m where m.projectTeamId = :projectTeamId and m.memberCategory = \"팀장\"")
    ProjectMember findLeader(@Param("projectTeamId")int projectTeamId);
}
