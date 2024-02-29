package org.omoknoone.omokhub.user.query;

public class ProfileDTO {

    private int profileId;
    private String title;
    private String content;
    private String techStack;
    private String userId;
    private boolean isDeleted;

    public ProfileDTO() {
    }

    public ProfileDTO(int profileId, String title, String content, String techStack, String userId, boolean isDeleted) {
        this.profileId = profileId;
        this.title = title;
        this.content = content;
        this.techStack = techStack;
        this.userId = userId;
        this.isDeleted = isDeleted;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
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

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileId=" + profileId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", techStack='" + techStack + '\'' +
                ", userId='" + userId + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
