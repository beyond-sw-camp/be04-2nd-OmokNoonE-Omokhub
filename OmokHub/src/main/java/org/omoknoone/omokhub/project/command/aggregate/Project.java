package org.omoknoone.omokhub.project.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @Column(name = "PROJECT_ID")
    private int projectId;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    @Column(name = "LAST_MODIFIED_DATE")
    private LocalDateTime lastModifiedDate;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PROJECT_TEAM_ID")
    private int projectTeamId;
    @Column(name = "PROJECT_MEMBER_ID")
    private int projectMemberId;
    @Column(name = "IS_PUBLIC")
    private boolean isPublic;

    public Project() {
    }

    public Project(int projectId, String title, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime lastModifiedDate, String status, int projectTeamId, int projectMemberId, boolean isPublic) {
        this.projectId = projectId;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.projectTeamId = projectTeamId;
        this.projectMemberId = projectMemberId;
        this.isPublic = isPublic;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public void setProjectMemberId(int projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", status='" + status + '\'' +
                ", projectTeamId=" + projectTeamId +
                ", projectMemberId=" + projectMemberId +
                ", isPublic=" + isPublic +
                '}';
    }
}
