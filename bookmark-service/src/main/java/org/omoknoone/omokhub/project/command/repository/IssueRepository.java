package org.omoknoone.omokhub.project.command.repository;

import org.omoknoone.omokhub.project.command.aggregate.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Object> {
}
