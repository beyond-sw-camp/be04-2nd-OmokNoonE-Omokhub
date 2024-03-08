package org.omoknoone.omokhub.projectmember.command.service;

public interface ProjectMemberService {

    void changeLeader(Integer projectTeamId, Integer newLeaderId);

    void deleteProjectMember(Integer projectMemberId);
}
