package org.omoknoone.omokhub.projectmember.query;

public class ProjectMember {
    private int projectMemberId;
    private String userId;
    private int projectTeamId;
    private String memberCategory;

    public ProjectMember() {
    }

    public ProjectMember(int projectMemberId, String userId, int projectTeamId, String memberCategory) {
        this.projectMemberId = projectMemberId;
        this.userId = userId;
        this.projectTeamId = projectTeamId;
        this.memberCategory = memberCategory;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public String getUserId() {
        return userId;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public String getMemberCategory() {
        return memberCategory;
    }

    @Override
    public String toString() {
        return "ProjectMember{" +
                "projectMemberId=" + projectMemberId +
                ", userId='" + userId + '\'' +
                ", projectTeamId=" + projectTeamId +
                ", memberCategory='" + memberCategory + '\'' +
                '}';
    }
}
