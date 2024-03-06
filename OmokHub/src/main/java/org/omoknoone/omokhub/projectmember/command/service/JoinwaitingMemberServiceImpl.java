package org.omoknoone.omokhub.projectmember.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.projectmember.command.aggregate.JoinwaitingMember;
import org.omoknoone.omokhub.projectmember.command.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.command.repository.JoinwaitingMemberRepository;
import org.omoknoone.omokhub.projectmember.command.vo.ProjectMemberVO;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingmemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JoinwaitingMemberServiceImpl implements JoinwaitingMemberService{

    private final ModelMapper modelMapper;
    private final JoinwaitingMemberRepository joinwaitingMemberRepository;

    @Autowired
    public JoinwaitingMemberServiceImpl(ModelMapper modelMapper, JoinwaitingMemberRepository joinwaitingMemberRepository) {
        this.modelMapper = modelMapper;
        this.joinwaitingMemberRepository = joinwaitingMemberRepository;
    }

    @Transactional
    @Override
    public void addJoinWaiting(JoinwaitingMemberDTO joinwaitingMemberDTO) {



        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        JoinwaitingMember joinwaitingMember = modelMapper.map(joinwaitingMemberDTO, JoinwaitingMember.class);


        joinwaitingMemberRepository.save(joinwaitingMember);
    }
}
