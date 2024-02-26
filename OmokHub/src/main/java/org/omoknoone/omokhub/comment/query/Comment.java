package org.omoknoone.omokhub.comment.query;

import java.time.LocalTime;

public class Comment {
    private int comment_id;
    private String content;
    private LocalTime posted_date;
    private LocalTime last_modified_date;
    private String user_id;
    private boolean is_deleted;
    private String comment_category;
    private int posting_id;
    private int seeking_member_post_id;
    private int issue_id;

    public Comment() {
    }

    public Comment(int comment_id, String content, LocalTime posted_date, LocalTime last_modified_date, String user_id, boolean is_deleted, String comment_category, int posting_id, int seeking_member_post_id, int issue_id) {
        this.comment_id = comment_id;
        this.content = content;
        this.posted_date = posted_date;
        this.last_modified_date = last_modified_date;
        this.user_id = user_id;
        this.is_deleted = is_deleted;
        this.comment_category = comment_category;
        this.posting_id = posting_id;
        this.seeking_member_post_id = seeking_member_post_id;
        this.issue_id = issue_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public String getContent() {
        return content;
    }

    public LocalTime getPosted_date() {
        return posted_date;
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

    public String getComment_category() {
        return comment_category;
    }

    public int getPosting_id() {
        return posting_id;
    }

    public int getSeeking_member_post_id() {
        return seeking_member_post_id;
    }

    public int getIssue_id() {
        return issue_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", content='" + content + '\'' +
                ", posted_date=" + posted_date +
                ", last_modified_date=" + last_modified_date +
                ", user_id='" + user_id + '\'' +
                ", is_deleted=" + is_deleted +
                ", comment_category='" + comment_category + '\'' +
                ", posting_id=" + posting_id +
                ", seeking_member_post_id=" + seeking_member_post_id +
                ", issue_id=" + issue_id +
                '}';
    }
}
