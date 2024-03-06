package org.omoknoone.omokhub.comment.query.entity;

import java.time.LocalTime;

public class Reply {
    private int replyId;
    private String content;
    private LocalTime postedDate;
    private LocalTime lastModifiedDate;
    private int commentId;
    private boolean isDeleted;
    private String memberId;

    public Reply() {
    }

    public Reply(int replyId, String content, LocalTime postedDate, LocalTime lastModifiedDate, int commentId, boolean isDeleted, String memberId) {
        this.replyId = replyId;
        this.content = content;
        this.postedDate = postedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.commentId = commentId;
        this.isDeleted = isDeleted;
        this.memberId = memberId;
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

    public String getMemberId() {
        return memberId;
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
                ", memberId='" + memberId + '\'' +
                '}';
    }
}
