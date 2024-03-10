package org.omoknoone.omokhub.user.query.dto;

public class ResponseMemberDTO {

    private String memberId;
    private String nickname;

    public ResponseMemberDTO() {
    }

    public ResponseMemberDTO(String memberId, String nickname) {
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
        return "ResponseMemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
