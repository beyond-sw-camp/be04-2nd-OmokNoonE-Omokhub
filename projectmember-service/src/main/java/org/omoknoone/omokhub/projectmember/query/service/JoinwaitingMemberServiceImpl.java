package org.omoknoone.omokhub.projectmember.query.service;

import org.omoknoone.omokhub.client.MemberServiceClient;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.query.dto.WaitingAndMemberDTO;
import org.omoknoone.omokhub.projectmember.query.repository.JoinwaitingMemberMapper;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QueryJoinwaitingMemberServiceImpl")
public class JoinwaitingMemberServiceImpl implements JoinwaitingMemberService {

    private final JoinwaitingMemberMapper joinwaitingMemberMapper;
    private final MemberServiceClient memberServiceClient;

    Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    public JoinwaitingMemberServiceImpl(JoinwaitingMemberMapper joinwaitingMemberMapper, MemberServiceClient memberServiceClient) {
        this.joinwaitingMemberMapper = joinwaitingMemberMapper;
        this.memberServiceClient = memberServiceClient;
    }

    @Override
    public List<WaitingAndMemberDTO> searchWaitingMember(int findprojectId) {

        List<WaitingAndMemberDTO> memberList = joinwaitingMemberMapper.selectWaitingMember(findprojectId);


        return memberList;
    }

    @Override
    public void searchInviteOrApplyMember() {
        List<MemberDTO> members = joinwaitingMemberMapper.selectInviteOrApplyMember();
    }

    @Override
    public void sesarchMyCurrentApplyStatus() {
        List<JoinwaitingMemberDTO> waitingstatus = joinwaitingMemberMapper.myCurrentApplyStatus();
    }
}
