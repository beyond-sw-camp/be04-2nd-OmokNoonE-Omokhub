package org.omoknoone.omokhub.seekingmemberpost;

import java.time.LocalTime;

public class SeekingMemberPost {
    private int seekingMemberPostId;
    private String title;
    private int seekingMember;
    private LocalTime startDate;
    private LocalTime endDate;
    private String techStack;
    private String content;
    private LocalTime lastModifiedDate;
    private boolean isSeeking;
    private String userId;
    private boolean isDeleted;
    private int projectId;

    public SeekingMemberPost() {
    }

    public SeekingMemberPost(int seekingMemberPostId, String title, int seekingMember, LocalTime startDate, LocalTime endDate, String techStack, String content, LocalTime lastModifiedDate, boolean isSeeking, String userId, boolean isDeleted, int projectId) {
        this.seekingMemberPostId = seekingMemberPostId;
        this.title = title;
        this.seekingMember = seekingMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.techStack = techStack;
        this.content = content;
        this.lastModifiedDate = lastModifiedDate;
        this.isSeeking = isSeeking;
        this.userId = userId;
        this.isDeleted = isDeleted;
        this.projectId = projectId;
    }

    public int getSeekingMemberPostId() {
        return seekingMemberPostId;
    }

    public String getTitle() {
        return title;
    }

    public int getSeekingMember() {
        return seekingMember;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public LocalTime getEndDate() {
        return endDate;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getContent() {
        return content;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public boolean isSeeking() {
        return isSeeking;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public int getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "SeekingMemberPost{" +
                "seekingMemberPostId=" + seekingMemberPostId +
                ", title='" + title + '\'' +
                ", seekingMember=" + seekingMember +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", techStack='" + techStack + '\'' +
                ", content='" + content + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", isSeeking=" + isSeeking +
                ", userId='" + userId + '\'' +
                ", isDeleted=" + isDeleted +
                ", projectId=" + projectId +
                '}';
    }
}
