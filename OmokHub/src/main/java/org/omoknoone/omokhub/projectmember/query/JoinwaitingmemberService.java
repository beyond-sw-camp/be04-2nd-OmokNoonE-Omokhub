package org.omoknoone.omokhub.projectmember.query;

import org.omoknoone.omokhub.projectmember.query.repository.JoinwaitingmemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@Service
public class JoinwaitingmemberService {

    private JoinwaitingmemberMapper joinwaitingmemberMapper;

    @Autowired
    public JoinwaitingmemberService(JoinwaitingmemberMapper joinwaitingmemberMapper) {
        this.joinwaitingmemberMapper = joinwaitingmemberMapper;
    }

    public void searchWaitingMember(int findprojectId){
        List<Member> members = joinwaitingmemberMapper.selectWaitingMember(findprojectId);
    }

    public void searchInviteOrApplyMember(){
        List<Member> members = joinwaitingmemberMapper.selectInviteOrApplyMember();
    }

    public void sesarchMyCurrentApplyStatus(){
        List<JoinwaitingmemberDTO> waitingstatus = joinwaitingmemberMapper.myCurrentApplyStatus();
    }
}
