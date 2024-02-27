package org.omoknoone.omokhub.bookmark.query;

import java.time.LocalTime;

public class Bookmark {
    private int bookmarkId;
    private boolean isLike;
    private boolean isBookmark;
    private LocalTime addedDate;
    private int seeking_memberPostId;
    private int userId;

    public Bookmark() {
    }

    public Bookmark(int bookmarkId, boolean isLike, boolean isBookmark, LocalTime addedDate, int seeking_memberPostId, int userId) {
        this.bookmarkId = bookmarkId;
        this.isLike = isLike;
        this.isBookmark = isBookmark;
        this.addedDate = addedDate;
        this.seeking_memberPostId = seeking_memberPostId;
        this.userId = userId;
    }

    public int getBookmarkId() {
        return bookmarkId;
    }

    public boolean isLike() {
        return isLike;
    }

    public boolean isBookmark() {
        return isBookmark;
    }

    public LocalTime getAddedDate() {
        return addedDate;
    }

    public int getSeeking_memberPostId() {
        return seeking_memberPostId;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "bookmarkId=" + bookmarkId +
                ", isLike=" + isLike +
                ", isBookmark=" + isBookmark +
                ", addedDate=" + addedDate +
                ", seeking_memberPostId=" + seeking_memberPostId +
                ", userId=" + userId +
                '}';
    }
}
