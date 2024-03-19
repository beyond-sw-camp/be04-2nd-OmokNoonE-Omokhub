package org.omoknoone.omokhub.projectmember.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.omoknoone.omokhub.projectmember.query.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.query.service.ProjectTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProjectTeamMapperTest {

    @Autowired
    private ProjectTeamService projectTeamService;

    @DisplayName("프로젝트 팀 ID로 팀 정보 조회")
    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5, 17, 18})
    void testSearchProjectInfo(int teamId){
        Assertions.assertDoesNotThrow(
                () ->{
                    List<ProjectTeamDTO> teams = projectTeamService.searchProjectTeam(teamId);
                    teams.forEach(System.out::println);
                }
        );
    }

}
