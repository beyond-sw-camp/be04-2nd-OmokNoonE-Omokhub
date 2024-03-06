package org.omoknoone.omokhub.project.query.entity;

import java.time.LocalTime;

public class Issue {

    private int issueId;
    private String title;
    private String content;
    private boolean isClosed;
    private LocalTime postedDate;
    private LocalTime closedDate;
    private LocalTime lastModifiedDate;
    private int projectMemberId;
    private int projectId;

    public Issue() {
    }

    public Issue(int issueId, String title, String content, boolean isClosed, LocalTime postedDate, LocalTime closedDate, LocalTime lastModifiedDate, int projectMemberId, int projectId) {
        this.issueId = issueId;
        this.title = title;
        this.content = content;
        this.isClosed = isClosed;
        this.postedDate = postedDate;
        this.closedDate = closedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.projectMemberId = projectMemberId;
        this.projectId = projectId;
    }

    public int getIssueId() {
        return issueId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public LocalTime getPostedDate() {
        return postedDate;
    }

    public LocalTime getClosedDate() {
        return closedDate;
    }

    public LocalTime getLastModifiedDate() {
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
        return "Issue{" +
                "issueId=" + issueId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isClosed=" + isClosed +
                ", postedDate=" + postedDate +
                ", closedDate=" + closedDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", projectMemberId=" + projectMemberId +
                ", projectId=" + projectId +
                '}';
    }
}
