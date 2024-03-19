package org.omoknoone.omokhub.auth.aggregate;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "blackList", timeToLive = 60) // 60초
public class BlackList {

    @Id
    private Long id;
    @Column
    private String invalidRefreshToken;

    public BlackList() {
    }

    public BlackList(String invalidRefreshToken) {
        this.invalidRefreshToken = invalidRefreshToken;
    }

    public BlackList(Long id, String invalidRefreshToken) {
        this.id = id;
        this.invalidRefreshToken = invalidRefreshToken;
    }

    public Long getId() {
        return id;
    }

    public String getInvalidRefreshToken() {
        return invalidRefreshToken;
    }

    @Override
    public String toString() {
        return "BlackList{" +
                "id=" + id +
                ", invalidRefreshToken='" + invalidRefreshToken + '\'' +
                '}';
    }
}
