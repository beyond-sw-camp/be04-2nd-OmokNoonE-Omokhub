package org.omoknoone.omokhub.user.query;

public class Profile {
    private int profileId;
    private String title;
    private String content;
    private String techStack;
    private String userId;
    private boolean isDeleted;

    public Profile() {
    }

    public Profile(int profileId, String title, String content, String techStack, String userId, boolean isDeleted) {
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

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isDeleted() {
        return isDeleted;
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
