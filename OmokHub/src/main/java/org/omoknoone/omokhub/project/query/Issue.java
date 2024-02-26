package org.omoknoone.omokhub.project.query;

import java.time.LocalTime;

public class Issue {

    private int issue_id;
    private String title;
    private String content;
    private boolean is_closed;
    private LocalTime posted_date;
    private LocalTime closed_date;
    private LocalTime last_modified_date;
    private int project_member_id;
    private int project_id;

    public Issue() {
    }

    public Issue(int issue_id, String title, String content, boolean is_closed, LocalTime posted_date, LocalTime closed_date, LocalTime last_modified_date, int project_member_id, int project_id) {
        this.issue_id = issue_id;
        this.title = title;
        this.content = content;
        this.is_closed = is_closed;
        this.posted_date = posted_date;
        this.closed_date = closed_date;
        this.last_modified_date = last_modified_date;
        this.project_member_id = project_member_id;
        this.project_id = project_id;
    }

    public int getIssue_id() {
        return issue_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public LocalTime getPosted_date() {
        return posted_date;
    }

    public LocalTime getClosed_date() {
        return closed_date;
    }

    public LocalTime getLast_modified_date() {
        return last_modified_date;
    }

    public int getProject_member_id() {
        return project_member_id;
    }

    public int getProject_id() {
        return project_id;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "issue_id=" + issue_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", is_closed=" + is_closed +
                ", posted_date=" + posted_date +
                ", closed_date=" + closed_date +
                ", last_modified_date=" + last_modified_date +
                ", project_member_id=" + project_member_id +
                ", project_id=" + project_id +
                '}';
    }
}
