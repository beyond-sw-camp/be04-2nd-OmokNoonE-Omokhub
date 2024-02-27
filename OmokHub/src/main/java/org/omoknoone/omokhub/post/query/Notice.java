package org.omoknoone.omokhub.post.query;

import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public class Notice {

    private int noticeId;
    private String title;
    private String content;
    private LocalTime postedDate;
    private LocalTime lastModifiedDate;
    private boolean isDeleted;

    public Notice() {
    }

    public Notice(int noticeId, String title, String content, LocalTime postedDate, LocalTime lastModifiedDate, boolean isDeleted) {
        this.noticeId = noticeId;
        this.title = title;
        this.content = content;
        this.postedDate = postedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.isDeleted = isDeleted;
    }

    public int getNoticeId() {
        return noticeId;
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

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postedDate=" + postedDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
