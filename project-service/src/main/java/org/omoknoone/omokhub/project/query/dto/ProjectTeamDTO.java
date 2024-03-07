package org.omoknoone.omokhub.project.query.dto;

public class ProjectTeamDTO {

    private int projectTeamId;
    private int maxMember;
    private int currentMember;
    private int remainMember;

    public ProjectTeamDTO() {
    }

    public ProjectTeamDTO(int projectTeamId, int maxMember, int currentMember, int remainMember) {
        this.projectTeamId = projectTeamId;
        this.maxMember = maxMember;
        this.currentMember = currentMember;
        this.remainMember = remainMember;
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

    public int getRemainMember() {
        return remainMember;
    }

    public void setRemainMember(int remainMember) {
        this.remainMember = remainMember;
    }

    @Override
    public String toString() {
        return "ProjectTeamDTO{" +
                "projectTeamId=" + projectTeamId +
                ", maxMember=" + maxMember +
                ", currentMember=" + currentMember +
                ", remainMember=" + remainMember +
                '}';
    }
}