package org.omoknoone.omokhub.projectmember.command.service;

import com.netflix.discovery.converters.Auto;
import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectMember;
import org.omoknoone.omokhub.projectmember.command.repository.ProjectMemberRepository;
import org.omoknoone.omokhub.user.query.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    private final ModelMapper mapper;
    private final ProjectMemberRepository projectMemberRepository;
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public ProjectMemberServiceImpl(ModelMapper mapper, ProjectMemberRepository projectMemberRepository) {
        this.mapper = mapper;
        this.projectMemberRepository = projectMemberRepository;
    }

    @Override
    @Transactional
    public void updateAuthority(int projectTeamId, int newLeaderId) {
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
