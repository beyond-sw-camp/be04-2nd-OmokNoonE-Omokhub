package org.omoknoone.omokhub.project.query.dto;

public class SeekingMemberPostCriteriaDTO {
    private String startDate;
    private String title;
    private String techStack;

    public SeekingMemberPostCriteriaDTO() {
    }

    public SeekingMemberPostCriteriaDTO(String startDate, String title, String techStack) {
        this.startDate = startDate;
        this.title = title;
        this.techStack = techStack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "SeekingMemberPostCriteriaDTO{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", techStack='" + techStack + '\'' +
                '}';
    }
}
