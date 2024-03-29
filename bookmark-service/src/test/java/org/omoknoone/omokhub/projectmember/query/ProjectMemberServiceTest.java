package org.omoknoone.omokhub.projectmember.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.omoknoone.omokhub.projectmember.query.service.ProjectMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class ProjectMemberServiceTest {

    @Autowired
    private ProjectMemberService projectMemberService;

//        @Test
    @DisplayName("해당 팀의 팀원 정보 조회")
    @ParameterizedTest
    @ValueSource(strings = {"QA Team"})
    void testGetTeamMemberInfo(String putTeamName) {
        Assertions.assertDoesNotThrow(
                () -> projectMemberService.TeamMemberInfo(putTeamName)
        );
    }
}