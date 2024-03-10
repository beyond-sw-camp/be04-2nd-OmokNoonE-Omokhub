package org.omoknoone.omokhub.user.query.dto;

import lombok.Data;

public class MemberNicknameDTO {
    private String memberId;
    private String nickname;

    public MemberNicknameDTO() {
    }

    public MemberNicknameDTO(String memberId, String nickname) {
        this.memberId = memberId;
        this.nickname = nickname;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "MemberNicknameDTO{" +
                "memberId='" + memberId + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
