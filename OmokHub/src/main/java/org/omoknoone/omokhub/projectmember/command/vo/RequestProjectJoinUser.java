package org.omoknoone.omokhub.projectmember.command.vo;

public class RequestProjectJoinUser {

    private String memberId;
    private int projectTeamId;
    private String category;

    public RequestProjectJoinUser() {
    }

    public RequestProjectJoinUser(String memberId, int projectTeamId, String category) {
        this.memberId = memberId;
        this.projectTeamId = projectTeamId;
        this.category = category;
    }

    public String getMemberId() {
        return memberId;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public String getCategory() {
        return category;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "RequestProjectJoinUser{" +
                "memberId='" + memberId + '\'' +
                ", projectTeamId=" + projectTeamId +
                ", category='" + category + '\'' +
                '}';
    }
}
