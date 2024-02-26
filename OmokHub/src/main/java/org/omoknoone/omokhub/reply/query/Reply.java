package org.omoknoone.omokhub.reply.query;

import java.time.LocalTime;

public class Reply {
    private int replyId;
    private String content;
    private LocalTime postedDate;
    private LocalTime lastModifiedDate;
    private int commentId;
    private boolean isDeleted;
    private String userId;

    public Reply() {
    }

    public Reply(int replyId, String content, LocalTime postedDate, LocalTime lastModifiedDate, int commentId, boolean isDeleted, String userId) {
        this.replyId = replyId;
        this.content = content;
        this.postedDate = postedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.commentId = commentId;
        this.isDeleted = isDeleted;
        this.userId = userId;
    }

    public int getReplyId() {
        return replyId;
    }

    public String getContent() {
        return content;
    }

    public LocalTime getPostedDate() {
        return postedDate;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public int getCommentId() {
        return commentId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", content='" + content + '\'' +
                ", postedDate=" + postedDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", commentId=" + commentId +
                ", isDeleted=" + isDeleted +
                ", userId='" + userId + '\'' +
                '}';
    }
}
