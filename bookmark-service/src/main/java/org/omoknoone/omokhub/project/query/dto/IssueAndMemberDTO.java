package org.omoknoone.omokhub.project.query.dto;

import org.omoknoone.omokhub.user.query.dto.MemberDTO;

import java.time.LocalTime;
import java.util.List;

public class IssueAndMemberDTO {

    private int issueId;
    private String title;
    private String content;
    private boolean isClosed;
    private LocalTime postedDate;
    private LocalTime closedDate;
    private LocalTime lastModifiedDate;
    private int projectMemberId;
    private int projectId;

    /* 설명. MemberDTO에 다음 속성을 추가할 것
        private String memberId;
     */
    private List<MemberDTO> members;

    public IssueAndMemberDTO() {
    }

    public IssueAndMemberDTO(int issueId, String title, String content, boolean isClosed, LocalTime postedDate, LocalTime closedDate, LocalTime lastModifiedDate, int projectMemberId, int projectId, List<MemberDTO> members) {
        this.issueId = issueId;
        this.title = title;
        this.content = content;
        this.isClosed = isClosed;
        this.postedDate = postedDate;
        this.closedDate = closedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.projectMemberId = projectMemberId;
        this.projectId = projectId;
        this.members = members;
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

    public LocalTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalTime postedDate) {
        this.postedDate = postedDate;
    }

    public LocalTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalTime closedDate) {
        this.closedDate = closedDate;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalTime lastModifiedDate) {
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

    public List<MemberDTO> getMembers() {
        return members;
    }

    public void setMembers(List<MemberDTO> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "IssueAndMemberDTO{" +
                "issueId=" + issueId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isClosed=" + isClosed +
                ", postedDate=" + postedDate +
                ", closedDate=" + closedDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", projectMemberId=" + projectMemberId +
                ", projectId=" + projectId +
                ", members=" + members +
                '}';
    }
}
