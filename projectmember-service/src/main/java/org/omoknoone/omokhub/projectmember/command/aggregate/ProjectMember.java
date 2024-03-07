package org.omoknoone.omokhub.projectmember.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECT_MEMBER")
public class ProjectMember {

    @Id
    @Column(name = "PROJECT_MEMBER_ID")
    private int projectMemberId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "PROJECT_TEAM_ID")
    private int projectTeamId;

    @Column(name = "MEMBER_CATEGORY")
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
