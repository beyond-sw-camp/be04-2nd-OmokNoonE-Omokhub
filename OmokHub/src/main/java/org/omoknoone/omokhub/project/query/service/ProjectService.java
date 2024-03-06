package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;
import org.omoknoone.omokhub.project.query.repository.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private ProjectMapper projectMapper;

    @Autowired
    public ProjectService(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    /* 설명. 프로젝트 id 기준 조회 */
    public List<ProjectAndTeamAndMemberDTO> searchProjectByProjectId(int projectId){
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByProjectId(projectId);
//        projects.forEach(System.out::println);

        return projects;
    }

    /* 설명. 진행상태 별 프로젝트 목록 보기 */
    public List<ProjectAndTeamAndMemberDTO> searchProjectByStatus(String status){
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByStatus(status);
//        projects.forEach(System.out::println);

        return projects;
    }

    /* 설명. 특정 팀이 속한 모든 프로젝트를 팀 이름으로 조회 */
    public List<ProjectAndTeamAndMemberDTO> searchProjectByTeamName(String teamName){
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByTeamName(teamName);
//        projects.forEach(System.out::println);

        return projects;
    }

    /* 설명. 내가 참여한 프로젝트 목록 */
    public List<ProjectAndTeamAndMemberDTO> searchMyProjects(String memberId){
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchMyProjects(memberId);
//        projects.forEach(System.out::println);

        return projects;
    }
}
