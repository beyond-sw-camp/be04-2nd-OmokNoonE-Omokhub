package org.omoknoone.omokhub.seekingmemberpost.command.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class SeekingMemberPostDTO {
    private int seekingMemberPostId;
    private String title;
    private int seekingMember;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> techStack;
    private String content;
    private LocalDateTime lastModifiedDate;
    private boolean isSeeking;
    private String memberId;
    private boolean isDeleted;
    private int projectId;

    public SeekingMemberPostDTO() {
    }

    public SeekingMemberPostDTO(int seekingMemberPostId, String title, int seekingMember, LocalDate startDate, LocalDate endDate, List<String> techStack, String content, LocalDateTime lastModifiedDate, boolean isSeeking, String memberId, boolean isDeleted, int projectId) {
        this.seekingMemberPostId = seekingMemberPostId;
        this.title = title;
        this.seekingMember = seekingMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.techStack = techStack;
        this.content = content;
        this.lastModifiedDate = lastModifiedDate;
        this.isSeeking = isSeeking;
        this.memberId = memberId;
        this.isDeleted = isDeleted;
        this.projectId = projectId;
    }

    public int getSeekingMemberPostId() {
        return seekingMemberPostId;
    }

    public void setSeekingMemberPostId(int seekingMemberPostId) {
        this.seekingMemberPostId = seekingMemberPostId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeekingMember() {
        return seekingMember;
    }

    public void setSeekingMember(int seekingMember) {
        this.seekingMember = seekingMember;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean isSeeking() {
        return isSeeking;
    }

    public void setSeeking(boolean seeking) {
        isSeeking = seeking;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "SeekingMemberPostDTO{" +
                "seekingMemberPostId=" + seekingMemberPostId +
                ", title='" + title + '\'' +
                ", seekingMember=" + seekingMember +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", techStack=" + techStack +
                ", content='" + content + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", isSeeking=" + isSeeking +
                ", memberId='" + memberId + '\'' +
                ", isDeleted=" + isDeleted +
                ", projectId=" + projectId +
                '}';
    }
}
