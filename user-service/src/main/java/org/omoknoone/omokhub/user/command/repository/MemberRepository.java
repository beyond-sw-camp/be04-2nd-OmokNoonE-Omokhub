package org.omoknoone.omokhub.user.command.repository;

import org.omoknoone.omokhub.user.command.aggregate.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByMemberId(String memberId);
}
