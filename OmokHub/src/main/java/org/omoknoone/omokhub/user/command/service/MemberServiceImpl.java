package org.omoknoone.omokhub.user.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.user.command.aggregate.Member;
import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
public class MemberServiceImpl implements MemberService {

    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    public MemberServiceImpl(ModelMapper modelMapper, MemberRepository memberRepository) {
        this.modelMapper = modelMapper;
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void signUp(MemberDTO newMember) {
        logger.info("[LOGGER] newMember: {}", newMember);

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        memberRepository.save(modelMapper.map(newMember, Member.class));
    }
}
