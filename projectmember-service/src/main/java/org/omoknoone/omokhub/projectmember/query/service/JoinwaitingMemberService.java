package org.omoknoone.omokhub.projectmember.query.service;

import org.omoknoone.omokhub.projectmember.query.dto.WaitingAndMemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;

import java.util.List;

public interface JoinwaitingMemberService {
    List<WaitingAndMemberDTO> searchWaitingMember(int findprojectId);
    void searchInviteOrApplyMember();
    void sesarchMyCurrentApplyStatus();
}
