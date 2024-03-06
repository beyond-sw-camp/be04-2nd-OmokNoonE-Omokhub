package org.omoknoone.omokhub.user.command.vo;

public class ResponseMember {
    private String memberId;
    private String name;
    private String nickname;

    public ResponseMember() {
    }

    public ResponseMember(String memberId, String name, String nickname) {
        this.memberId = memberId;
        this.name = name;
        this.nickname = nickname;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "ResponseMember{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
