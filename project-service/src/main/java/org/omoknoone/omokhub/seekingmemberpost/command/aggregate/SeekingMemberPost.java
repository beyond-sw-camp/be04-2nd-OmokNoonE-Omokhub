package org.omoknoone.omokhub.seekingmemberpost.command.aggregate;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "SEEKING_MEMBER_POST")
public class SeekingMemberPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seekingMemberPostId;
    @Column
    private String title;
    @Column
    private int seekingMember;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private String techStack;
    @Column
    private String content;
    @Column
    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
    @Column
    private boolean isSeeking;
    @Column
    private String memberId;
    @Column
    private boolean isDeleted;
    @Column
    private int projectId;

    public SeekingMemberPost() {
    }

    public SeekingMemberPost(int seekingMemberPostId, String title, int seekingMember, LocalDate startDate, LocalDate endDate, String techStack, String content, LocalDateTime lastModifiedDate, boolean isSeeking, String memberId, boolean isDeleted, int projectId) {
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

    public String getTitle() {
        return title;
    }

    public int getSeekingMember() {
        return seekingMember;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public boolean getIsSeeking() {
        return isSeeking;
    }

    public String getMemberId() {
        return memberId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeekingMember(int seekingMember) {
        this.seekingMember = seekingMember;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setIsSeeking(boolean isSeeking) {
        this.isSeeking = isSeeking;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
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
                ", memberId='" + memberId + '\'' +
                ", isDeleted=" + isDeleted +
                ", projectId=" + projectId +
                '}';
    }
}
