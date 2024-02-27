package org.omoknoone.omokhub.projectmember.query;

import java.time.LocalTime;

public class ProjectTeam {
    private int projectTeamId;
    private int maxMember;
    private int currentMember;
    private String teamName;
    private LocalTime addedDate;
    private boolean isActive;

    public ProjectTeam() {
    }

    public ProjectTeam(int projectTeamId, int maxMember, int currentMember, String teamName, LocalTime addedDate, boolean isActive) {
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

    public int getMaxMember() {
        return maxMember;
    }

    public int getCurrentMember() {
        return currentMember;
    }

    public String getTeamName() {
        return teamName;
    }

    public LocalTime getAddedDate() {
        return addedDate;
    }

    public boolean isActive() {
        return isActive;
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