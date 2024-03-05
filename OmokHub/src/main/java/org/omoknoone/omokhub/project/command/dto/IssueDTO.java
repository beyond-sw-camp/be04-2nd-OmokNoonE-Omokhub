package org.omoknoone.omokhub.project.command.dto;


import java.time.LocalDateTime;

public class IssueDTO {
    private int issueId;
    private String title;
    private String content;
    private boolean isClosed;
    private LocalDateTime postedDate;
    private LocalDateTime closedDate;
    private LocalDateTime lastModifiedDate;
    private int projectMemberId;
    private int projectId;

    public IssueDTO() {
    }

    public IssueDTO(int issueId, String title, String content, boolean isClosed, LocalDateTime postedDate, LocalDateTime closedDate, LocalDateTime lastModifiedDate, int projectMemberId, int projectId) {
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

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public LocalDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public void setProjectMemberId(int projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "IssueDTO{" +
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
