package org.omoknoone.omokhub.projectmember.query.service;

import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.query.repository.JoinwaitingMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@Service("QeuryJoinwaitingMemberServiceImpl")
public class JoinwaitingMemberServiceImpl implements JoinwaitingMemberService {

    private JoinwaitingMemberMapper joinwaitingmemberMapper;

    @Autowired
    public JoinwaitingMemberServiceImpl(JoinwaitingMemberMapper joinwaitingmemberMapper) {
        this.joinwaitingmemberMapper = joinwaitingmemberMapper;
    }

    public void searchWaitingMember(int findprojectId) {
        List<Member> members = joinwaitingmemberMapper.selectWaitingMember(findprojectId);
    }

    public void searchInviteOrApplyMember() {
        List<Member> members = joinwaitingmemberMapper.selectInviteOrApplyMember();
    }

    public void sesarchMyCurrentApplyStatus() {
        List<JoinwaitingMemberDTO> waitingstatus = joinwaitingmemberMapper.myCurrentApplyStatus();
    }
}
