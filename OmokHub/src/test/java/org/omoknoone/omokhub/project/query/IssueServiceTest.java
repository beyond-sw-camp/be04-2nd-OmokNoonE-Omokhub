package org.omoknoone.omokhub.project.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;
import java.util.stream.Stream;

@SpringBootTest
@Transactional
class IssueServiceTest {

    @Autowired
    private IssueService issueService;

    /* 설명. searchProjectIssues */
    @Test
    void searchProjectIssues() {
        Assertions.assertDoesNotThrow(
                () -> issueService.searchProjectIssues(1)
        );
    }

    /* 설명. searchProjectMemberIssues */
    @Test
    void searchProjectMyIssues() {
        Assertions.assertDoesNotThrow(
                () -> issueService.searchProjectMemberIssues("member01")
        );
    }
}