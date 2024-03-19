package org.omoknoone.omokhub.auth.dto;

public class AuthDTO {
    private String token;
    private String memberId;
    private boolean isExpired;
    private boolean isRevoked;

    public AuthDTO() {
    }

    public AuthDTO(String token, String memberId, boolean isExpired, boolean isRevoked) {
        this.token = token;
        this.memberId = memberId;
        this.isExpired = isExpired;
        this.isRevoked = isRevoked;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
                "token='" + token + '\'' +
                ", memberId='" + memberId + '\'' +
                ", isExpired=" + isExpired +
                ", isRevoked=" + isRevoked +
                '}';
    }
}
