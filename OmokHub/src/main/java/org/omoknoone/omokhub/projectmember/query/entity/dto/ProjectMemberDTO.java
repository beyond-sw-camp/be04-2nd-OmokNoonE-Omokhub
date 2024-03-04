package org.omoknoone.omokhub.projectmember.query.entity.dto;

public class ProjectMemberDTO {
    private String teamName;
    private String nickname;
    private String memberId;
    private int memberCategory;

    public ProjectMemberDTO() {
    }

    public ProjectMemberDTO(String teamName, String nickname, String memberId, int memberCategory) {
        this.teamName = teamName;
        this.nickname = nickname;
        this.memberId = memberId;
        this.memberCategory = memberCategory;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getMemberCategory() {
        return memberCategory;
    }

    public void setMemberCategory(int memberCategory) {
        this.memberCategory = memberCategory;
    }

    @Override
    public String toString() {
        return "ProjectMemberDTO{" +
                "teamName='" + teamName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberCategory=" + memberCategory +
                '}';
    }

}

