package org.omoknoone.omokhub.project.query;

import java.time.LocalTime;

public class ProjectDTO {

    private int projectId;
    private String teamName;
    private String title;
    private LocalTime startDate;
    private LocalTime endDate;
    private String status;
    private boolean isPublic;
    private String memberId;
    private LocalTime lastModifiedDate;

    public ProjectDTO() {
    }

    public ProjectDTO(String teamName, String title, LocalTime startDate, LocalTime endDate, String status, boolean isPublic, String memberId, int projectId, LocalTime lastModifiedDate) {
        this.teamName = teamName;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.isPublic = isPublic;
        this.memberId = memberId;
        this.projectId = projectId;
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public LocalTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalTime endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        return "ProjectDTO{" +
                "teamName='" + teamName + '\'' +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                ", isPublic=" + isPublic +
                ", memberId='" + memberId + '\'' +
                ", projectId=" + projectId +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
