package org.omoknoone.omokhub.projectmember.command.vo;

public class ResponseProjectJoinUser {

    private String memberId;
    private int projectTeamId;

    public ResponseProjectJoinUser() {
    }

    public ResponseProjectJoinUser(String memberId, int projectTeamId) {
        this.memberId = memberId;
        this.projectTeamId = projectTeamId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    @Override
    public String toString() {
        return "ResponseProjectJoinUser{" +
                "memberId='" + memberId + '\'' +
                ", projectTeamId=" + projectTeamId +
                '}';
    }
}
