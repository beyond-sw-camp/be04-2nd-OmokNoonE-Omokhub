package org.omoknoone.omokhub.project.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.project.query.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
class ProjectServiceTest {

    @Autowired
    private ProjectServiceImpl projectService;

    @DisplayName("searchProjectByProjectId")
    @Test
    void searchProjectByProjectId() {
        Assertions.assertDoesNotThrow(
                () -> projectService.searchProjectByProjectId(1)
        );
    }

    @DisplayName("searchProjectByStatus")
    @Test
    void searchProjectByStatus() {
        Assertions.assertDoesNotThrow(
                () -> projectService.searchProjectByStatus("진행중")
        );
    }

    @Test
    void searchProjectByTeamName() {
        Assertions.assertDoesNotThrow(
                () -> projectService.searchProjectByTeamName("Support Team")
        );
    }

    @Test
    void searchMyProjects() {
        Assertions.assertDoesNotThrow(
                () -> projectService.searchMyProjects("user1")
        );
    }
}