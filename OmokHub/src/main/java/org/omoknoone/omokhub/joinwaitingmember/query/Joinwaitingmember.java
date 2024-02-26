package org.omoknoone.omokhub.joinwaitingmember.query;

import java.time.LocalTime;

public class Joinwaitingmember {
    private int join_waiting_member_id;
    private int project_team_id;
    private String user_id;
    private String category;
    private LocalTime join_date;

    public Joinwaitingmember() {
    }

    public Joinwaitingmember(int join_waiting_member_id, int project_team_id, String user_id, String category, LocalTime join_date) {
        this.join_waiting_member_id = join_waiting_member_id;
        this.project_team_id = project_team_id;
        this.user_id = user_id;
        this.category = category;
        this.join_date = join_date;
    }

    public int getJoin_waiting_member_id() {
        return join_waiting_member_id;
    }

    public int getProject_team_id() {
        return project_team_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getCategory() {
        return category;
    }

    public LocalTime getJoin_date() {
        return join_date;
    }

    @Override
    public String toString() {
        return "Joinwaitingmember{" +
                "join_waiting_member_id=" + join_waiting_member_id +
                ", project_team_id=" + project_team_id +
                ", user_id='" + user_id + '\'' +
                ", category='" + category + '\'' +
                ", join_date=" + join_date +
                '}';
    }
}
