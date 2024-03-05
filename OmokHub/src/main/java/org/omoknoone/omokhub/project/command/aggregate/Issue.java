package org.omoknoone.omokhub.project.command.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "ISSUE")
public class Issue {

    @Id
    @Column
    private int issueId;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private boolean isClosed;
    @Column
    private LocalDateTime postedDate;
    @Column
    private LocalDateTime closedDate;
    @Column
    private LocalDateTime lastModifiedDate;
    @Column
    private int projectMemberId;
    @Column
    private int projectId;

    public Issue() {
    }

    public Issue(int issueId, String title, String content, boolean isClosed, LocalDateTime postedDate, LocalDateTime closedDate, LocalDateTime lastModifiedDate, int projectMemberId, int projectId) {
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
