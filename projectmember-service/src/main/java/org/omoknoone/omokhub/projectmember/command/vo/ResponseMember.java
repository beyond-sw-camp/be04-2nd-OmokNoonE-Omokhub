package org.omoknoone.omokhub.projectmember.command.vo;

public class ResponseMember {
    private String memberId;
    private String nickname;

    public ResponseMember() {
    }

    public ResponseMember(String memberId, String nickname) {
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
