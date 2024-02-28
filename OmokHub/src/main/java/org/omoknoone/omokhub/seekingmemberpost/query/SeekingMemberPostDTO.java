package org.omoknoone.omokhub.seekingmemberpost.query;

import java.time.LocalDate;
import java.time.LocalTime;

public class SeekingMemberPostDTO {
    private String title;
    private int seekingMember;
    private LocalDate startDate;
    private LocalDate endDate;
    private String techStack;
    private String Content;
    private LocalTime lastModifiedDate;
    private String memberId;
    private int maxMember;
    private int currentMember;

    public SeekingMemberPostDTO() {
    }

    public SeekingMemberPostDTO(String title, int seekingMember, LocalDate startDate, LocalDate endDate, String techStack, String content, LocalTime lastModifiedDate, String memberId, int maxMember, int currentMember) {
        this.title = title;
        this.seekingMember = seekingMember;
        this.startDate = startDate;
        this.endDate = endDate;
        this.techStack = techStack;
        Content = content;
        this.lastModifiedDate = lastModifiedDate;
        this.memberId = memberId;
        this.maxMember = maxMember;
        this.currentMember = currentMember;
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
        return Content;
    }

    public void setContent(String content) {
        Content = content;
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

    public int getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public int getCurrentMember() {
        return currentMember;
    }

    public void setCurrentMember(int currentMember) {
        this.currentMember = currentMember;
    }

    @Override
    public String toString() {
        return "SeekingMemberPostDTO{" +
                "title='" + title + '\'' +
                ", seekingMember=" + seekingMember +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", techStack='" + techStack + '\'' +
                ", Content='" + Content + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", memberId='" + memberId + '\'' +
                ", maxMember=" + maxMember +
                ", currentMember=" + currentMember +
                '}';
    }
}
