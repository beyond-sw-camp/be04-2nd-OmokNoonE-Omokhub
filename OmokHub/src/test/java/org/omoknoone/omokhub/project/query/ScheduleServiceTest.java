package org.omoknoone.omokhub.project.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.project.query.ScheduleDTO;
import org.omoknoone.omokhub.project.query.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class ScheduleServiceTest {

    @Autowired
    private ScheduleService scheduleService;
    @Test
    void scheduleInProject(){
        Assertions.assertDoesNotThrow(
                () -> scheduleService.scheduleInProject(1)
        );
    }

    @Test
    void mySchedule(){
        Assertions.assertDoesNotThrow(
                () -> scheduleService.mySchedule("user1")
        );
    }
}
