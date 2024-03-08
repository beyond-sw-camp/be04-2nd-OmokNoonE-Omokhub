package org.omoknoone.omokhub.projectmember.query.service;

import org.omoknoone.omokhub.projectmember.command.client.MemberServiceClient;
import org.omoknoone.omokhub.projectmember.query.dto.ProjectMemberDTO;
import org.omoknoone.omokhub.projectmember.query.repository.ProjectMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberService {

    private final MemberServiceClient memberServiceClient;
    private ProjectMemberMapper projectMemberMapper;

    @Autowired
    public ProjectMemberService(MemberServiceClient memberServiceClient, ProjectMemberMapper projectMemberMapper) {
        this.memberServiceClient = memberServiceClient;
        this.projectMemberMapper = projectMemberMapper;
    }

    public void TeamMemberInfo(String putTeamName) {

        /* 설명. 특정 프로젝트의 ID로 팀을 찾고 해당 팀의 팀원 정보 조회 */
        List<ProjectMemberDTO> memberInfo = projectMemberMapper.getTeamMemberInfo(putTeamName);
        memberInfo.forEach(System.out::println);

    }

    public void updateAuthority(int memberId, int projectTeamId) {

    }
}
