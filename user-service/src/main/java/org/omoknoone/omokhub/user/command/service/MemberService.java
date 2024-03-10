package org.omoknoone.omokhub.user.command.service;

import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.vo.ResponseMember;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface MemberService extends UserDetailsService {

    void signUp(MemberDTO memberDTO);

    void withdraw(MemberDTO memberDTO);

    MemberDTO modify(MemberDTO memberDTO);

    MemberDTO getMemberDetailsByMemberId(String memberId);
}
