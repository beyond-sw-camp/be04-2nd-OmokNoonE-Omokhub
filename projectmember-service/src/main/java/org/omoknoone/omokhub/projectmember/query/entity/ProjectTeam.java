package org.omoknoone.omokhub.projectmember.query.entity;

import java.time.LocalDateTime;

public class ProjectTeam {
    private int projectTeamId;
    private int maxMember;
    private int currentMember;
    private String teamName;
    private LocalDateTime addedDate;
    private boolean isActive;

    public ProjectTeam() {
    }

    public ProjectTeam(int projectTeamId, int maxMember, int currentMember,
                       String teamName, LocalDateTime addedDate, boolean isActive) {
        this.projectTeamId = projectTeamId;
        this.maxMember = maxMember;
        this.currentMember = currentMember;
        this.teamName = teamName;
        this.addedDate = addedDate;
        this.isActive = isActive;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    public int getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public int getCurrentMember() {
        return currentMember;
    }

    public void setCurrentMember(int currentMember) {
        this.currentMember = currentMember;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "ProjectTeam{" +
                "projectTeamId=" + projectTeamId +
                ", maxMember=" + maxMember +
                ", currentMember=" + currentMember +
                ", teamName='" + teamName + '\'' +
                ", addedDate=" + addedDate +
                ", isActive=" + isActive +
                '}';
    }
}