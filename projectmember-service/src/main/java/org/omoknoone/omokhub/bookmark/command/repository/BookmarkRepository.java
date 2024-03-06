package org.omoknoone.omokhub.bookmark.command.repository;

import org.omoknoone.omokhub.bookmark.command.aggregate.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Object> {
}
