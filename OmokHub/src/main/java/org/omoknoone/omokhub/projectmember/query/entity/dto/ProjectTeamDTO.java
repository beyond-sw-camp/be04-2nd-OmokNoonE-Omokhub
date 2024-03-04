package org.omoknoone.omokhub.projectmember.query.entity.dto;

import java.time.LocalTime;

public class ProjectTeamDTO {

    private int projectId;
    private String teamName;
    private int maxMember;
    private int currentMember;
    private LocalTime addedDate;

    public ProjectTeamDTO() {
    }

    public ProjectTeamDTO(String teamName, int maxMember, int currentMember, LocalTime addedDate) {
        this.teamName = teamName;
        this.maxMember = maxMember;
        this.currentMember = currentMember;
        this.addedDate = addedDate;
    }

    public ProjectTeamDTO(int projectId, String teamName, int maxMember, int currentMember, LocalTime addedDate) {
        this.projectId = projectId;
        this.teamName = teamName;
        this.maxMember = maxMember;
        this.currentMember = currentMember;
        this.addedDate = addedDate;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getMaxMember() {
        return maxMember;
    }

    public int getCurrentMember() {
        return currentMember;
    }

    public LocalTime getAddedDate() {
        return addedDate;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public void setCurrentMember(int currentMember) {
        this.currentMember = currentMember;
    }

    public void setAddedDate(LocalTime addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "ProjectTeamDTO{" +
                "projectId=" + projectId +
                ", teamName='" + teamName + '\'' +
                ", maxMember=" + maxMember +
                ", currentMember=" + currentMember +
                ", addedDate=" + addedDate +
                '}';
    }
}

