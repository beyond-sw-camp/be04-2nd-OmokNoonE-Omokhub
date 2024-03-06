package org.omoknoone.omokhub.project.query.entity;

import java.time.LocalTime;

public class Project {
    private int projectId;
    private String title;
    private LocalTime startDate;
    private LocalTime endDate;
    private LocalTime lastModifiedDate;
    private String status;
    private int projectTeamId;
    private int projectMemberId;
    private boolean isPublic;

    public Project() {
    }

    public Project(int projectId, String title, LocalTime startDate, LocalTime endDate, LocalTime lastModifiedDate, String status, int projectTeamId, int projectMemberId, boolean isPublic) {
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

    public String getTitle() {
        return title;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public LocalTime getEndDate() {
        return endDate;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public String getStatus() {
        return status;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public boolean isPublic() {
        return isPublic;
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
