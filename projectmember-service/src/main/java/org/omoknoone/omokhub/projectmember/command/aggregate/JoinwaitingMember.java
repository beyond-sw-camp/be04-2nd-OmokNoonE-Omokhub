package org.omoknoone.omokhub.projectmember.command.aggregate;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "JOIN_WAITING_MEMBER")
public class JoinwaitingMember {

    @Id
    @Column(name = "JOIN_WAITING_MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int joinwaitingMemberId;

    @Column(name = "PROJECT_TEAM_ID")
    private int projectTeamId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "JOIN_DATE")
    @CreationTimestamp
    private LocalDateTime joinDate;

    public JoinwaitingMember() {
    }

    public JoinwaitingMember(int joinwaitingMemberId, int projectTeamId, String memberId, String category, LocalDateTime joinDate) {
        this.joinwaitingMemberId = joinwaitingMemberId;
        this.projectTeamId = projectTeamId;
        this.memberId = memberId;
        this.category = category;
        this.joinDate = joinDate;
    }

    public int getJoinwaitingMemberId() {
        return joinwaitingMemberId;
    }

    public void setJoinwaitingMemberId(int joinwaitingMemberId) {
        this.joinwaitingMemberId = joinwaitingMemberId;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "JoinwaitingMember{" +
                "joinwaitingMemberId=" + joinwaitingMemberId +
                ", projectTeamId=" + projectTeamId +
                ", memberId='" + memberId + '\'' +
                ", category='" + category + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
