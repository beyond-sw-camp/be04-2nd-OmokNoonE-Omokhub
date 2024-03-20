package org.omoknoone.omokhub.auth.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash(value = "auth") // 60초
public class Auth {

    @Id
    private String id;
    @Indexed
    private String refreshToken;
//    @Column
    private String memberId;
//    @Column
    private boolean isExpired;
//    @Column
    private boolean isRevoked;

    public Auth() {
    }

    public Auth(String refreshToken, String memberId, boolean isExpired, boolean isRevoked) {
        this.refreshToken = refreshToken;
        this.memberId = memberId;
        this.isExpired = isExpired;
        this.isRevoked = isRevoked;
    }

    public Auth(String id, String refreshToken, String memberId, boolean isExpired, boolean isRevoked) {
        this.id = id;
        this.refreshToken = refreshToken;
        this.memberId = memberId;
        this.isExpired = isExpired;
        this.isRevoked = isRevoked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public boolean isRevoked() {
        return isRevoked;
    }

    public void setRevoked(boolean revoked) {
        isRevoked = revoked;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "id=" + id +
                ", refreshToken='" + refreshToken + '\'' +
                ", memberId='" + memberId + '\'' +
                ", isExpired=" + isExpired +
                ", isRevoked=" + isRevoked +
                '}';
    }
}
