package org.omoknoone.omokhub.project.query.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class SeekingMemberPostDTO {
    private int seekingMemberPostId;
    private String title;
    private int seekingMember;
    private LocalDate startDate;
    private LocalDate endDate;
    private String techStack;
    private String content;
    private LocalDateTime lastModifiedDate;
    private String memberId;
    private ProjectTeamDTO projectTeam;

    public SeekingMemberPostDTO() {
    }

    public SeekingMemberPostDTO(int seekingMemberPostId, String title, int seekingMember, LocalDate startDate, LocalDate endDate, String techStack, String content, LocalDateTime lastModifiedDate, String memberId, ProjectTeamDTO projectTeam) {
        this.seekingMemberPostId = seekingMemberPostId;
        this.title = title;
        this.seekingMember = seekingMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.techStack = techStack;
        this.content = content;
        this.lastModifiedDate = lastModifiedDate;
        this.memberId = memberId;
        this.projectTeam = projectTeam;
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

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
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
                "seekingMemberPostId=" + seekingMemberPostId +
                ", title='" + title + '\'' +
                ", seekingMember=" + seekingMember +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", techStack='" + techStack + '\'' +
                ", content='" + content + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", memberId='" + memberId + '\'' +
                ", projectTeam=" + projectTeam +
                '}';
    }
}
