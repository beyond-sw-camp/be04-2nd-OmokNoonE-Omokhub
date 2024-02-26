package org.omoknoone.omokhub.post.query;

import java.time.LocalTime;

public class Post {
    private int posting_id;
    private String title;
    private String content;
    private LocalTime posted_date;
    private int hits;
    private LocalTime last_modified_date;
    private String user_id;
    private boolean is_deleted;

    public Post() {
    }

    public Post(int posting_id, String title, String content, LocalTime posted_date, int hits, LocalTime last_modified_date, String user_id, boolean is_deleted) {
        this.posting_id = posting_id;
        this.title = title;
        this.content = content;
        this.posted_date = posted_date;
        this.hits = hits;
        this.last_modified_date = last_modified_date;
        this.user_id = user_id;
        this.is_deleted = is_deleted;
    }

    public int getPosting_id() {
        return posting_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalTime getPosted_date() {
        return posted_date;
    }

    public int getHits() {
        return hits;
    }

    public LocalTime getLast_modified_date() {
        return last_modified_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    @Override
    public String toString() {
        return "Post{" +
                "posting_id=" + posting_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", posted_date=" + posted_date +
                ", hits=" + hits +
                ", last_modified_date=" + last_modified_date +
                ", user_id='" + user_id + '\'' +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
