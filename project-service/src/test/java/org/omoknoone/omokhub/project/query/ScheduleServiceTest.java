package org.omoknoone.omokhub.project.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.project.query.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ScheduleServiceTest {

    @Autowired
    private ScheduleServiceImpl scheduleService;
    @Test
    @DisplayName("프로젝트아이디로 프로젝트일정 조회")
    void scheduleInProject(){
        Assertions.assertDoesNotThrow(
                () -> scheduleService.scheduleInProject(1)
        );
    }

    @Test
    @DisplayName("회원아이디로 회원별 프로젝트일정 조회")
    void mySchedule(){
        Assertions.assertDoesNotThrow(
                () -> scheduleService.mySchedule("user1")
        );
    }
}
