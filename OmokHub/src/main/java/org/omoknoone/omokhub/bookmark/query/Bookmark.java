package org.omoknoone.omokhub.bookmark.query;

import java.time.LocalTime;

public class Bookmark {
    private int bookmark_id;
    private boolean is_like;
    private boolean is_bookmark;
    private LocalTime added_date;
    private int seeking_member_post_id;
    private int user_id;

    public Bookmark() {
    }

    public Bookmark(int bookmark_id, boolean is_like, boolean is_bookmark, LocalTime added_date, int seeking_member_post_id, int user_id) {
        this.bookmark_id = bookmark_id;
        this.is_like = is_like;
        this.is_bookmark = is_bookmark;
        this.added_date = added_date;
        this.seeking_member_post_id = seeking_member_post_id;
        this.user_id = user_id;
    }

    public int getBookmark_id() {
        return bookmark_id;
    }

    public boolean isIs_like() {
        return is_like;
    }

    public boolean isIs_bookmark() {
        return is_bookmark;
    }

    public LocalTime getAdded_date() {
        return added_date;
    }

    public int getSeeking_member_post_id() {
        return seeking_member_post_id;
    }

    public int getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "bookmark_id=" + bookmark_id +
                ", is_like=" + is_like +
                ", is_bookmark=" + is_bookmark +
                ", added_date=" + added_date +
                ", seeking_member_post_id=" + seeking_member_post_id +
                ", user_id=" + user_id +
                '}';
    }
}
