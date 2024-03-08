package org.omoknoone.omokhub.user.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.user.command.aggregate.Member;
import org.omoknoone.omokhub.user.command.client.ProjectServiceClient;
import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.repository.MemberRepository;
import org.omoknoone.omokhub.user.command.vo.ResponseMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class MemberServiceImpl implements MemberService {

    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ProjectServiceClient projectServiceClient;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    public MemberServiceImpl(ModelMapper modelMapper,
                             MemberRepository memberRepository,
                             BCryptPasswordEncoder bCryptPasswordEncoder,
                             ProjectServiceClient projectServiceClient) {
        this.modelMapper = modelMapper;
        this.memberRepository = memberRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.projectServiceClient = projectServiceClient;
    }

    @Override
    @Transactional
    public void signUp(MemberDTO newMember) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Member member = modelMapper.map(newMember, Member.class);
        member.setPassword(bCryptPasswordEncoder.encode(newMember.getPassword()));

        memberRepository.save(member);
    }

    @Override
    @Transactional
    public void withdraw(MemberDTO memberDTO) {

        Map<String, String> memberId = new HashMap<>();
        memberId.put("memberId", memberDTO.getMemberId());

        /* 설명. client를 통해 project 모듈에게 모집글 삭제 요청 */
        Boolean result = projectServiceClient.removeSeekingMemberPostByMemberId(memberId);

        if(result){
            Member member = memberRepository.findById(memberDTO.getMemberId()).orElseThrow(IllegalArgumentException::new);
            member.setIsWithdraw(true);     // 회원 탈퇴 상태값 true

            memberRepository.flush();
        }
    }

    @Override
    @Transactional
    public MemberDTO modify(MemberDTO memberDTO) {

        Member member = memberRepository.findById(memberDTO.getMemberId()).orElseThrow(IllegalArgumentException::new);
        member.setNickname(memberDTO.getNickname());
        member.setEmail(memberDTO.getEmail());
        member.setPhoneNum(memberDTO.getPhoneNum());
        member.setAddress(memberDTO.getAddress());
        member.setBirthday(memberDTO.getBirthday().toString());
        
        memberRepository.flush();

        return modelMapper.map(member, MemberDTO.class);
    }

    @Override
    public MemberDTO getMemberDetailsByMemberId(String memberId) {

        Member member = memberRepository.findByMemberId(memberId);

        if(member == null)
            throw new UsernameNotFoundException(memberId + " 아이디의 유저는 존재하지 않음");

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);

        return memberDTO;
    }

    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {

        Member member = memberRepository.findByMemberId(memberId);

        if(member == null)
            throw new UsernameNotFoundException(memberId + " 아이디의 유저는 존재하지 않습니다.");

        return new User(member.getMemberId(), member.getPassword(),
                true, true, true, true,
                new ArrayList<>());
    }
}
