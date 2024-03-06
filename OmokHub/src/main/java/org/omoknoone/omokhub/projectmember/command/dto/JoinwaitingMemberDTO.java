package org.omoknoone.omokhub.projectmember.command.dto;

import java.time.LocalTime;

public class JoinwaitingMemberDTO {

    private int projectTeamId;
    private String memberId;
    private String category;
    private LocalTime joinDate;

    public JoinwaitingMemberDTO() {
    }

    public JoinwaitingMemberDTO(int projectTeamId, String memberId, String category, LocalTime joinDate) {
        this.projectTeamId = projectTeamId;
        this.memberId = memberId;
        this.category = category;
        this.joinDate = joinDate;
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

    public LocalTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalTime joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "JoinwaitingMemberDTO{" +
                "projectTeamId=" + projectTeamId +
                ", memberId='" + memberId + '\'' +
                ", category='" + category + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
