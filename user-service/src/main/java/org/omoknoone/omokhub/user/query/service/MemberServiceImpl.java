package org.omoknoone.omokhub.user.query.service;


import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;
import org.omoknoone.omokhub.user.query.entity.Member;
import org.omoknoone.omokhub.user.query.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QueryMemberServiceImpl")
public class MemberServiceImpl implements MemberService {

    private MemberMapper memberMapper;

    public MemberServiceImpl() {
    }

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public MemberDTO searchMemberInfoByMemberId(String memberId) {

        return memberMapper.selectMemberInfoByMemberId(memberId);
    }

    @Override
    public MemberNicknameDTO getMemberIdAndNickname(String attribute) {

        MemberNicknameDTO memberNicknameDTO = new MemberNicknameDTO();
        memberNicknameDTO.setMemberId(attribute);

        Member member = memberMapper.selectMemberNicknameById(memberNicknameDTO);

        return new MemberNicknameDTO(member.getMemberId(), member.getNickname());
    }

    @Override
    public List<MemberNicknameDTO> getMemberIdAndNicknameByMemberList(List<String> memberList) {

        return memberMapper.selectMemberIdAndNicknameByMemberList(memberList);
    }
}
