package org.omoknoone.omokhub.projectmember.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

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
    @CreationTimestamp
    private LocalDate addedDate;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    public ProjectTeam() {
    }

    public ProjectTeam(int projectTeamId, int maxMember, int currentMember,
                       String teamName, LocalDate addedDate, boolean isActive) {
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

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
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
