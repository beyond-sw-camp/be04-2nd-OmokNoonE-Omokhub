package org.omoknoone.omokhub.projectmember.command.repository;
import org.omoknoone.omokhub.projectmember.command.aggregate.JoinwaitingMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinwaitingMemberRepository extends JpaRepository<JoinwaitingMember, Integer> {

}
