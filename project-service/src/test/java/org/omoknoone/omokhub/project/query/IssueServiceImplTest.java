package org.omoknoone.omokhub.project.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.project.query.service.IssueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class IssueServiceImplTest {

    @Autowired
    private IssueServiceImpl issueServiceImpl;

    /* 설명. searchProjectIssues */
    @Test
    void searchProjectIssues() {
        Assertions.assertDoesNotThrow(
                () -> issueServiceImpl.searchProjectIssuesById(1)
        );
    }

    /* 설명. searchProjectMemberIssues */
    @Test
    void searchProjectMyIssues() {
        Assertions.assertDoesNotThrow(
                () -> issueServiceImpl.searchProjectIssuesByMemberId("mem1")
        );
    }
}