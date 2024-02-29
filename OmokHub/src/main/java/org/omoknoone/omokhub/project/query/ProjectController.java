package org.omoknoone.omokhub.project.query;

import org.omoknoone.omokhub.project.query.repository.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    /* 설명. 프로젝트 id 기준 조회 */
    public void searchProjectByProjectId(int projectId){
        List<ProjectAndTeamAndMemberDTO> projects = projectService.searchProjectByProjectId(projectId);
        projects.forEach(System.out::println);
    }

    /* 설명. 진행상태 별 프로젝트 목록 보기 */
    public void searchProjectByStatus(String status){
        List<ProjectAndTeamAndMemberDTO> projects = projectService.searchProjectByStatus(status);
        projects.forEach(System.out::println);
    }

    /* 설명. 특정 팀이 속한 모든 프로젝트를 팀 이름으로 조회 */
    public void searchProjectByTeamName(String teamName){
        List<ProjectAndTeamAndMemberDTO> projects = projectService.searchProjectByTeamName(teamName);
        projects.forEach(System.out::println);
    }

    /* 설명. 내가 참여한 프로젝트 목록 */
    public void searchMyProjects(String memberId){
        List<ProjectAndTeamAndMemberDTO> projects = projectService.searchMyProjects(memberId);
        projects.forEach(System.out::println);
    }
}
