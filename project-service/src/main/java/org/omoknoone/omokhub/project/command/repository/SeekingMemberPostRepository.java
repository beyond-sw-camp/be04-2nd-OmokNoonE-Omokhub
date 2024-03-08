package org.omoknoone.omokhub.project.command.repository;

import org.omoknoone.omokhub.project.command.aggregate.SeekingMemberPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeekingMemberPostRepository extends JpaRepository<SeekingMemberPost, Integer> {

    List<SeekingMemberPost> findSeekingMemberPostsByMemberId(String memberId);
}
