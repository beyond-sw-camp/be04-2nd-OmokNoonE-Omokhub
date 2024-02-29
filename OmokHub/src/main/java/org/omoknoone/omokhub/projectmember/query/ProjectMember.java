package org.omoknoone.omokhub.projectmember.query;

public class ProjectMember {
    private int projectMemberId;
    private String memberId;
    private int projectTeamId;
    private String memberCategory;

    public ProjectMember() {
    }

    public ProjectMember(int projectMemberId, String memberId, int projectTeamId, String memberCategory) {
        this.projectMemberId = projectMemberId;
        this.memberId = memberId;
        this.projectTeamId = projectTeamId;
        this.memberCategory = memberCategory;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public String getMemberId() {
        return memberId;
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
                ", memberId='" + memberId + '\'' +
                ", projectTeamId=" + projectTeamId +
                ", memberCategory='" + memberCategory + '\'' +
                '}';
    }
}
