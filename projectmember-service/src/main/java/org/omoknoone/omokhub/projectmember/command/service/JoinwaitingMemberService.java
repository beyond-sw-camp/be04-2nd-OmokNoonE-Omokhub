package org.omoknoone.omokhub.projectmember.command.service;

import org.omoknoone.omokhub.projectmember.command.dto.JoinwaitingMemberDTO;

public interface JoinwaitingMemberService {

    void addJoinWaiting(JoinwaitingMemberDTO joinwaitingMemberDTO);
    void deleteWaiting(int joinwaitingMemberId);
}
