package org.omoknoone.omokhub.auth.service;

import org.omoknoone.omokhub.auth.aggregate.Auth;
import org.omoknoone.omokhub.auth.repository.AuthRepository;
import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.naming.AuthenticationException;

@Service
public class AuthServiceImpl implements AuthService{

    private final AuthRepository authRepository;

    @Autowired
    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    /* 설명. 로그인 성공 시 redis에 token 값 저장 후 Id 반환 */
    @Override
    @Transactional
    public String successLogin(String memberId, String refreshToken) {

        Auth auth = new Auth(
                refreshToken,
                memberId,
                false,
                false
        );

        return authRepository.save(auth).getId();
    }

    @Override
    @Transactional
    public void logout(String refreshTokenId) throws AuthenticationException {
//        refreshTokenValidator.validateToken(refreshToken);              // 유효성 검사 (JwtUtil.validateToken)
//        refreshTokenValidator.validateTokenOwnerId(refreshToken, id);   // 로그인한 사용자인지 검사 (JwtUtil.getUserId와 ownerId 비교)
//        refreshTokenValidator.validateLogoutToken(refreshToken);        // 이미 로그아웃 된 사용자 검사
        Auth auth = authRepository.findById(refreshTokenId).orElseThrow(AuthenticationException::new);
        auth.setExpired(true);
        auth.setRevoked(true);

        authRepository.save(auth);
    }

    @Override
    public boolean checkRefreshToken(String refreshTokenId) {
        Auth auth = null;

        try {
            auth = authRepository.findById(refreshTokenId).orElseThrow(AuthenticationException::new);
        } catch (AuthenticationException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 파기됐거나 취소된 경우 false */
        return !auth.isExpired() && !auth.isRevoked();
    }
}
