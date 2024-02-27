package org.omoknoone.omokhub.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.project.query.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
class ProjectServiceTest {

    @Autowired
    private ProjectService projectService;

    @Test
    void searchProjectByProjectId() {
        Assertions.assertDoesNotThrow(
                () -> projectService.searchProjectByProjectId(1)
        );
    }
//
//    @Test
//    void searchProjectByStatus() {
//    }
//
//    @Test
//    void searchProjectByTeamName() {
//    }
//
//    @Test
//    void searchMyProjects() {
//    }
}