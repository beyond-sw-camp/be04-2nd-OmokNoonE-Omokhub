package org.omoknoone.omokhub.project.command.repository;

import org.omoknoone.omokhub.project.command.aggregate.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Object> {
}
