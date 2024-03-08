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
    public void updateAuthority(String memberId, int projectTeamId){

        ProjectMember foundLeader = projectMemberRepository.findLeader(projectTeamId);
        logger.info("팀장 찾기 {} ", foundLeader);
        foundLeader.setMemberCategory("팀원");

        ProjectMember newLeader = projectMemberRepository.findById(memberId).orElseThrow(IllegalArgumentException::new);
        logger.info("새 팀장 {} ", newLeader);
        newLeader.setMemberCategory("팀장");

    }
}
