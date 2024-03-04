package org.omoknoone.omokhub.projectmember.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.omoknoone.omokhub.projectmember.query.service.ProjectTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectTeamMapperTest {

    @Autowired
    private ProjectTeamService projectTeamService;

    @DisplayName("프로젝트 팀 정보 조회")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void testSearchProjectInfo(int args){
        Assertions.assertDoesNotThrow(
                () -> projectTeamService.searchProjectInfo(args)
        );
    }

}