package org.omoknoone.omokhub.projectmember.query;

import org.omoknoone.omokhub.projectmember.query.repository.ProjectMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberService {

    private ProjectMemberMapper projectMemberMapper;

    @Autowired
    public ProjectMemberService(ProjectMemberMapper projectMemberMapper) {
        this.projectMemberMapper = projectMemberMapper;
    }

    public void TeamMemberInfo(int projectMemberId) {

        /* 설명. 특정 프로젝트의 ID로 팀을 찾고 해당 팀의 팀원 정보 조회 */
        List<ProjectMemberDTO> memberInfo = projectMemberMapper.getTeamMemberInfo(projectMemberId);
        memberInfo.forEach(System.out::println);

    }
}