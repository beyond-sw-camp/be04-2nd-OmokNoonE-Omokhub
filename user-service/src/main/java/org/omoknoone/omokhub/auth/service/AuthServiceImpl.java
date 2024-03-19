package org.omoknoone.omokhub.auth.service;

import org.omoknoone.omokhub.auth.aggregate.BlackList;
import org.omoknoone.omokhub.auth.exception.UnAuthorizationException;
import org.omoknoone.omokhub.auth.repository.BlackListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthServiceImpl implements AuthService{

    private final BlackListRepository blackListRepository;

    @Autowired
    public AuthServiceImpl(BlackListRepository blackListRepository) {
        this.blackListRepository = blackListRepository;
    }

    @Override
    @Transactional
    public void logout(String ownerId, String refreshToken) {

//        refreshTokenValidator.validateToken(refreshToken);              // 유효성 검사 (JwtUtil.validateToken)
//        refreshTokenValidator.validateTokenOwnerId(refreshToken, id);   // 로그인한 사용자인지 검사 (JwtUtil.getUserId와 ownerId 비교)
//        refreshTokenValidator.validateLogoutToken(refreshToken);        // 이미 로그아웃 된 사용자 검사
        boolean isExist = blackListRepository.existsByInvalidRefreshToken(refreshToken);
        if(isExist) {
            throw new UnAuthorizationException("[ERROR] 이미 로그아웃된 사용자입니다!");
        }
        blackListRepository.save(new BlackList(refreshToken));
    }
}
