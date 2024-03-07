package org.omoknoone.omokhub.projectmember.query.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class JoinwaitingMember {

    private int joinWaitingMemberId;
    private int projectTeamId;
    private String memberId;
    private String category;
    private LocalDateTime joinDate;

    public JoinwaitingMember() {
    }

    public JoinwaitingMember(int joinWaitingMemberId, int projectTeamId, String memberId, String category, LocalDateTime joinDate) {
        this.joinWaitingMemberId = joinWaitingMemberId;
        this.projectTeamId = projectTeamId;
        this.memberId = memberId;
        this.category = category;
        this.joinDate = joinDate;
    }

    public int getJoinWaitingMemberId() {
        return joinWaitingMemberId;
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

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "Joinwaitingmember{" +
                "joinWaitingMemberId=" + joinWaitingMemberId +
                ", projectTeamId=" + projectTeamId +
                ", memberId='" + memberId + '\'' +
                ", category='" + category + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
