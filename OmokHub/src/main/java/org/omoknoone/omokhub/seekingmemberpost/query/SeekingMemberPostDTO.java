package org.omoknoone.omokhub.seekingmemberpost.query;

import org.omoknoone.omokhub.projectmember.query.ProjectTeamDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class SeekingMemberPostDTO {
    private int seekingMemberPostId;
    private String title;
    private int seekingMember;
    private LocalDate startDate;
    private LocalDate endDate;
    private String techStack;
    private boolean isSeeking;
    private boolean isDeleted;
    private String content;
    private LocalTime lastModifiedDate;
    private String memberId;
    private ProjectTeamDTO projectTeam;

    public SeekingMemberPostDTO() {
    }

    public SeekingMemberPostDTO(int seekingMemberId, String title, int seekingMember, LocalDate startDate, LocalDate endDate, String techStack, boolean isSeeking, boolean isDeleted, String content, LocalTime lastModifiedDate, String memberId, ProjectTeamDTO projectTeam) {
        this.seekingMemberPostId = seekingMemberId;
        this.title = title;
        this.seekingMember = seekingMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.techStack = techStack;
        this.isSeeking = isSeeking;
        this.isDeleted = isDeleted;
        this.content = content;
        this.lastModifiedDate = lastModifiedDate;
        this.memberId = memberId;
        this.projectTeam = projectTeam;
    }

    public int getSeekingMemberId() {
        return seekingMemberPostId;
    }

    public void setSeekingMemberId(int seekingMemberId) {
        this.seekingMemberPostId = seekingMemberId;
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

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public boolean isSeeking() {
        return isSeeking;
    }

    public void setSeeking(boolean seeking) {
        isSeeking = seeking;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ProjectTeamDTO getProjectTeam() {
        return projectTeam;
    }

    public void setProjectTeam(ProjectTeamDTO projectTeam) {
        this.projectTeam = projectTeam;
    }

    @Override
    public String toString() {
        return "SeekingMemberPostDTO{" +
                "seekingMemberId=" + seekingMemberPostId +
                ", title='" + title + '\'' +
                ", seekingMember=" + seekingMember +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", techStack='" + techStack + '\'' +
                ", isSeeking=" + isSeeking +
                ", isDeleted=" + isDeleted +
                ", content='" + content + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", memberId='" + memberId + '\'' +
                ", projectTeam=" + projectTeam +
                '}';
    }
}
