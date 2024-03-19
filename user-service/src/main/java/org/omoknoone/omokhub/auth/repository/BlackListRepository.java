package org.omoknoone.omokhub.auth.repository;

import org.omoknoone.omokhub.auth.aggregate.BlackList;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BlackListRepository extends CrudRepository<BlackList, String> {
    default boolean existsByInvalidRefreshToken(String refreshToken){
        return findByInvalidRefreshToken(refreshToken).isPresent();
    }

    Optional<BlackList> findByInvalidRefreshToken(String refreshToken);
}
