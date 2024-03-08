package org.omoknoone.omokhub.projectmember.command.service;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectMember;
import org.omoknoone.omokhub.projectmember.command.repository.ProjectMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    private final ModelMapper mapper;
    private final ProjectMemberRepository projectMemberRepository;

    @Autowired
    public ProjectMemberServiceImpl(ModelMapper mapper, ProjectMemberRepository projectMemberRepository) {
        this.mapper = mapper;
        this.projectMemberRepository = projectMemberRepository;
    }

    @Override
    @Transactional
    public void changeLeader(Integer projectTeamId, Integer newLeaderId) {
        // 기존 팀장을 팀원으로 변경
        ProjectMember currentLeader = projectMemberRepository.findLeader(projectTeamId);
        if (currentLeader != null) {
            currentLeader.setMemberCategory("팀원");
            projectMemberRepository.save(currentLeader);
        }

        // 새로운 팀장을 지정
        ProjectMember newLeader = projectMemberRepository.findById(newLeaderId)
                .orElseThrow(() -> new RuntimeException("멤버를 찾을 수 없습니다."));

        newLeader.setMemberCategory("팀장");
        projectMemberRepository.save(newLeader);
    }
}
