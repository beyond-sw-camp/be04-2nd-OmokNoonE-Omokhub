package org.omoknoone.omokhub.auth.service;

public interface AuthService {
    void logout(String ownerId, String refreshToken);
}
