package org.omoknoone.omokhub.auth.service;

import org.omoknoone.omokhub.user.command.dto.MemberDTO;

import javax.naming.AuthenticationException;

public interface AuthService {
    void successLogin(String memberId, String refreshToken);
    void logout(String tokenIndex) throws AuthenticationException;
}
