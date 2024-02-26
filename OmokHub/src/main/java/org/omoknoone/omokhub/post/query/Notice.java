package org.omoknoone.omokhub.post.query;

import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public class Notice {

    private int notice_id;
    private String title;
    private String content;
    private LocalTime posted_date;
    private LocalTime last_modified_date;
    private boolean is_deleted;

    public Notice() {
    }

    public Notice(int notice_id, String title, String content, LocalTime posted_date, LocalTime last_modified_date, boolean is_deleted) {
        this.notice_id = notice_id;
        this.title = title;
        this.content = content;
        this.posted_date = posted_date;
        this.last_modified_date = last_modified_date;
        this.is_deleted = is_deleted;
    }

    public int getNotice_id() {
        return notice_id;
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

    public LocalTime getLast_modified_date() {
        return last_modified_date;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "notice_id=" + notice_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", posted_date=" + posted_date +
                ", last_modified_date=" + last_modified_date +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
