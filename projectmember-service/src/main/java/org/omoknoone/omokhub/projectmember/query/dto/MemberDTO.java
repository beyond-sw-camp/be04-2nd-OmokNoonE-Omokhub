package org.omoknoone.omokhub.projectmember.query.dto;

public class MemberDTO {
    private String memberId;
    private String nickname;

    public MemberDTO() {
    }

    public MemberDTO(String memberId, String nickname) {
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
        return "MemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
