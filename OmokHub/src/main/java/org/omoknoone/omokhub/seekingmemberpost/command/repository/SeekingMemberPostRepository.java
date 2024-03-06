package org.omoknoone.omokhub.seekingmemberpost.command.repository;

import org.omoknoone.omokhub.seekingmemberpost.command.aggregate.SeekingMemberPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeekingMemberPostRepository extends JpaRepository<SeekingMemberPost, Integer> {

}
