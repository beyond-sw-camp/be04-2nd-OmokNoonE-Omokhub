package org.omoknoone.omokhub.projectmember.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalTime;

@Entity
@Table(name = "JOIN_WAITING_MEMBER")
public class JoinwaitingMember {

    @Id
    @Column(name = "JOIN_WAITING_MEMBER")
    private int joinwaitingMember;

    @Column(name = "PROJECT_TEAM_ID")
    private int projectTeamId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "JOIN_DATE")
    private LocalTime joinDate;

    public JoinwaitingMember() {
    }

    public JoinwaitingMember(int joinwaitingMember, int projectTeamId, String memberId, String category, LocalTime joinDate) {
        this.joinwaitingMember = joinwaitingMember;
        this.projectTeamId = projectTeamId;
        this.memberId = memberId;
        this.category = category;
        this.joinDate = joinDate;
    }

    public int getJoinwaitingMember() {
        return joinwaitingMember;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getCategory() {
        return category;
    }

    public LocalTime getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "JoinwaitingMember{" +
                "joinwaitingMember=" + joinwaitingMember +
                ", projectTeamId=" + projectTeamId +
                ", memberId='" + memberId + '\'' +
                ", category='" + category + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
