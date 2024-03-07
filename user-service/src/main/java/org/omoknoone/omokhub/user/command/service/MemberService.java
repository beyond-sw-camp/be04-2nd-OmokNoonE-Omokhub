package org.omoknoone.omokhub.user.command.service;

import org.omoknoone.omokhub.user.command.dto.MemberDTO;

public interface MemberService {

    void signUp(MemberDTO memberDTO);

    void withdraw(MemberDTO memberDTO);
}
