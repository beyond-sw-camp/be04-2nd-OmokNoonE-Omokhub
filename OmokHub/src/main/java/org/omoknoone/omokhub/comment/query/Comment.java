package org.omoknoone.omokhub.comment.query;

import java.time.LocalTime;

public class Comment {
    private int commentId;
    private String content;
    private LocalTime postedDate;
    private LocalTime last_modifiedDate;
    private String userId;
    private boolean isDeleted;
    private String commentCategory;
    private int postingId;
    private int seekingMemberPostId;
    private int issueId;

    public Comment() {
    }

    public Comment(int commentId, String content, LocalTime postedDate, LocalTime last_modifiedDate, String userId, boolean isDeleted, String commentCategory, int postingId, int seekingMemberPostId, int issueId) {
        this.commentId = commentId;
        this.content = content;
        this.postedDate = postedDate;
        this.last_modifiedDate = last_modifiedDate;
        this.userId = userId;
        this.isDeleted = isDeleted;
        this.commentCategory = commentCategory;
        this.postingId = postingId;
        this.seekingMemberPostId = seekingMemberPostId;
        this.issueId = issueId;
    }

    public int getCommentId() {
        return commentId;
    }

    public String getContent() {
        return content;
    }

    public LocalTime getPostedDate() {
        return postedDate;
    }

    public LocalTime getLast_modifiedDate() {
        return last_modifiedDate;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getCommentCategory() {
        return commentCategory;
    }

    public int getPostingId() {
        return postingId;
    }

    public int getSeekingMemberPostId() {
        return seekingMemberPostId;
    }

    public int getIssueId() {
        return issueId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", content='" + content + '\'' +
                ", postedDate=" + postedDate +
                ", last_modifiedDate=" + last_modifiedDate +
                ", userId='" + userId + '\'' +
                ", isDeleted=" + isDeleted +
                ", commentCategory='" + commentCategory + '\'' +
                ", postingId=" + postingId +
                ", seekingMemberPostId=" + seekingMemberPostId +
                ", issueId=" + issueId +
                '}';
    }
}
