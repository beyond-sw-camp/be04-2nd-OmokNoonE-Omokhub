package org.omoknoone.omokhub.projectmember.query.entity;

import java.time.LocalTime;

public class Joinwaitingmember {
    private int joinWaitingMemberId;
    private int projectTeamId;
    private String memberId;
    private String category;
    private LocalTime joinDate;

    public Joinwaitingmember() {
    }

    public Joinwaitingmember(int joinWaitingMemberId, int projectTeamId, String memberId, String category, LocalTime joinDate) {
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

    public LocalTime getJoinDate() {
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
