package org.omoknoone.omokhub.user.query.service;

import org.omoknoone.omokhub.user.query.entity.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private MemberMapper memberMapper;

    public MemberService() {
    }

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public MemberDTO searchMemberInfoByMemberId(String memberId) {

        return memberMapper.selectMemberInfoByMemberId(memberId);
    }

    public MemberDTO searchMemberIdByNickname(String nickname) {

        return memberMapper.selectMemberIdByNickname(nickname);
    }

    public Integer searchProfileCountByMemberId(String memberId) {

        return memberMapper.selectProfileCountByMemberId(memberId);
    }
}
