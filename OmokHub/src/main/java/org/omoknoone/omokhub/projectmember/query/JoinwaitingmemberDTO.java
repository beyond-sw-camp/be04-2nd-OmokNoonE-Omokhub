package org.omoknoone.omokhub.projectmember.query;

import java.time.LocalTime;

public class JoinwaitingmemberDTO {

    private String category;
    private LocalTime joinDate;
    private int joinWaitingMemberId;
    private int projectId;
    private String teamName;

    public JoinwaitingmemberDTO() {
    }

    public JoinwaitingmemberDTO(String category, LocalTime joinDate, int joinWaitingMemberId, int projectId, String teamName) {
        this.category = category;
        this.joinDate = joinDate;
        this.joinWaitingMemberId = joinWaitingMemberId;
        this.projectId = projectId;
        this.teamName = teamName;
    }

    public JoinwaitingmemberDTO(String category, LocalTime joinDate) {
        this.category = category;
        this.joinDate = joinDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalTime joinDate) {
        this.joinDate = joinDate;
    }

    public int getJoinWaitingMemberId() {
        return joinWaitingMemberId;
    }

    public void setJoinWaitingMemberId(int joinWaitingMemberId) {
        this.joinWaitingMemberId = joinWaitingMemberId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "JoinwaitingmemberDTO{" +
                "category='" + category + '\'' +
                ", joinDate=" + joinDate +
                ", joinWaitingMemberId=" + joinWaitingMemberId +
                ", projectId=" + projectId +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
