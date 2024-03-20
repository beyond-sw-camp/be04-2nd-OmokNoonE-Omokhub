package org.omoknoone.omokhub.auth.service;

import org.omoknoone.omokhub.user.command.dto.MemberDTO;

import javax.naming.AuthenticationException;

public interface AuthService {
    String successLogin(String memberId, String refreshToken);
    void logout(String refreshTokenId) throws AuthenticationException;
    boolean checkRefreshToken(String refreshTokenId);
}
