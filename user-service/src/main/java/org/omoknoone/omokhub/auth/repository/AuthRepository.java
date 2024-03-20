package org.omoknoone.omokhub.auth.repository;

import org.omoknoone.omokhub.auth.aggregate.Auth;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthRepository extends CrudRepository<Auth, String> {
    default boolean existsByInvalidRefreshToken(String refreshToken){
        return findByInvalidRefreshToken(refreshToken).isPresent();
    }

    Optional<Auth> findByInvalidRefreshToken(String refreshToken);
}
