package org.omoknoone.omokhub.user.command.service;

import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.vo.ResponseMember;

public interface MemberService {

    void signUp(MemberDTO memberDTO);

    void withdraw(MemberDTO memberDTO);

    ResponseMember modify(MemberDTO memberDTO);
}
