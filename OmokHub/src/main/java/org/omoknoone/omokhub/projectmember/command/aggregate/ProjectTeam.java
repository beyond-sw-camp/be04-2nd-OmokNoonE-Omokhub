package org.omoknoone.omokhub.projectmember.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECT_TEAM")
public class ProjectTeam {

    @Id
    @Column(name = "PROJECT_TEAM_ID")
    private int projectTeamId;

    @Column(name = "MAX_MEMBER")
    private int maxMember;

    @Column(name = "CURRENT_MEMBER")
    private int currentMember;

    @Column(name = "TEAM_NAME")
    private String teamName;

    @Column(name = "ADDED_DATE")
    private String addedDate;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    public ProjectTeam() {
    }

    public ProjectTeam(int projectTeamId, int maxMember, int currentMember, String teamName, String addedDate, boolean isActive) {
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

    public String getAddedDate() {
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
                ", addedDate='" + addedDate + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
