package org.omoknoone.omokhub.post.query;

import java.time.LocalTime;

public class Post {
    private int postingId;
    private String title;
    private String content;
    private LocalTime postedDate;
    private int hits;
    private LocalTime lastModifiedDate;
    private String userId;
    private boolean isDeleted;

    public Post() {
    }

    public Post(int postingId, String title, String content, LocalTime postedDate, int hits, LocalTime lastModifiedDate, String userId, boolean isDeleted) {
        this.postingId = postingId;
        this.title = title;
        this.content = content;
        this.postedDate = postedDate;
        this.hits = hits;
        this.lastModifiedDate = lastModifiedDate;
        this.userId = userId;
        this.isDeleted = isDeleted;
    }

    public int getPostingId() {
        return postingId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalTime getPostedDate() {
        return postedDate;
    }

    public int getHits() {
        return hits;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postingId=" + postingId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postedDate=" + postedDate +
                ", hits=" + hits +
                ", lastModifiedDate=" + lastModifiedDate +
                ", userId='" + userId + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
