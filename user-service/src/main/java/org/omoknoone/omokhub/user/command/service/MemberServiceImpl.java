package org.omoknoone.omokhub.user.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.user.command.aggregate.Member;
import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.repository.MemberRepository;
import org.omoknoone.omokhub.user.command.vo.ResponseMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public void signUp(MemberDTO newMember) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        memberRepository.save(modelMapper.map(newMember, Member.class));
    }

    @Override
    @Transactional
    public void withdraw(MemberDTO memberDTO) {

        Member member = memberRepository.findById(memberDTO.getMemberId()).orElseThrow(IllegalArgumentException::new);
        member.setIsWithdraw(true);     // 회원 탈퇴 상태값 true

        memberRepository.flush();
    }

    @Override
    @Transactional
    public ResponseMember modify(MemberDTO memberDTO) {

        Member member = memberRepository.findById(memberDTO.getMemberId()).orElseThrow(IllegalArgumentException::new);
        member.setNickname(memberDTO.getNickname());
        member.setEmail(memberDTO.getEmail());
        member.setPhoneNum(memberDTO.getPhoneNum());
        member.setAddress(memberDTO.getAddress());
        member.setBirthday(memberDTO.getBirthday().toString());
        
        memberRepository.flush();

        return modelMapper.map(member, ResponseMember.class);
    }
}
