package org.omoknoone.omokhub.project.query.entity;

import java.time.LocalDateTime;

public class Schedule {
    private int scheduleId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String title;
    private String content;
    private double progress;
    private LocalDateTime lastModifiedDate;
    private int projectMemberId;
    private int projectId;

    public Schedule() {
    }

    public Schedule(int scheduleId, LocalDateTime startDate, LocalDateTime endDate, String title, String content, double progress, LocalDateTime lastModifiedDate, int projectMemberId, int projectId) {
        this.scheduleId = scheduleId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.content = content;
        this.progress = progress;
        this.lastModifiedDate = lastModifiedDate;
        this.projectMemberId = projectMemberId;
        this.projectId = projectId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public double getProgress() {
        return progress;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public int getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", progress=" + progress +
                ", lastModifiedDate=" + lastModifiedDate +
                ", projectMemberId=" + projectMemberId +
                ", projectId=" + projectId +
                '}';
    }
}
