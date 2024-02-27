package org.omoknoone.omokhub.projectmember.query;

import java.time.LocalTime;

public class Joinwaitingmember {
    private int joinWaitingMemberId;
    private int projectTeamId;
    private String userId;
    private String category;
    private LocalTime joinDate;

    public Joinwaitingmember() {
    }

    public Joinwaitingmember(int joinWaitingMemberId, int projectTeamId, String userId, String category, LocalTime joinDate) {
        this.joinWaitingMemberId = joinWaitingMemberId;
        this.projectTeamId = projectTeamId;
        this.userId = userId;
        this.category = category;
        this.joinDate = joinDate;
    }

    public int getJoinWaitingMemberId() {
        return joinWaitingMemberId;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public String getUserId() {
        return userId;
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
                ", userId='" + userId + '\'' +
                ", category='" + category + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
