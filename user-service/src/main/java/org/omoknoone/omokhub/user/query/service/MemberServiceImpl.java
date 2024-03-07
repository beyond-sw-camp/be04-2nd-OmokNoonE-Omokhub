package org.omoknoone.omokhub.user.query.service;


import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;
import org.omoknoone.omokhub.user.query.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public MemberNicknameDTO searchMemberIdByNickname(String nickname) {

        return memberMapper.selectMemberIdByNickname(nickname);
    }

    @Override
    public Integer searchProfileCountByMemberId(String memberId) {

        return memberMapper.selectProfileCountByMemberId(memberId);
    }
}
