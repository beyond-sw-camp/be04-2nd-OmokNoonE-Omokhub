package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;
import org.omoknoone.omokhub.project.query.repository.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("QueryProjectServiceImpl")
public class ProjectServiceImpl implements ProjectService {

    private final ProjectMapper projectMapper;

    @Autowired
    public ProjectServiceImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    /* 설명. 프로젝트 id로 프로젝트 조회 */
    @Override
    public List<ProjectAndTeamAndMemberDTO> projectByProjectId(int projectId) {
        List<ProjectAndTeamAndMemberDTO> projectAndTeamAndMemberDTOList = projectMapper.searchProjectByProjectId(projectId);

        return projectAndTeamAndMemberDTOList;
    }

    /* 설명. 진행상태 별 프로젝트 목록 보기 */
    @Override
    public List<ProjectAndTeamAndMemberDTO> searchProjectByStatus(String status) {
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByStatus(status);

        return projects;
    }

    /* 설명. 특정 팀이 속한 모든 프로젝트를 팀 이름으로 조회 */
    @Override
    public List<ProjectAndTeamAndMemberDTO> searchProjectByTeamName(String teamName) {
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByTeamName(teamName);

        return projects;
    }

    /* 설명. 내가 참여한 프로젝트 목록 */
    @Override
    public List<ProjectAndTeamAndMemberDTO> searchMyProjects(String memberId) {
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchMyProjects(memberId);
//        projects.forEach(System.out::println);

        return projects;
    }

    /* 설명. 프로젝트명이 일부 포함된 프로젝트 조회 (목록)*/
    @Override
    public List<ProjectAndTeamAndMemberDTO> searchProjectByTitle(String title) {
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByTitle(title);
        return projects;
    }

    @Override
    public List<ProjectAndTeamAndMemberDTO> searchProjectByStatusList(String statusString) {
        List<String> statusList = Arrays.asList(statusString.split("&"));
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByStatusList(statusList);

        return projects;
    }

    @Override
    public List<ProjectAndTeamAndMemberDTO> searchProjectByOptions(String options) {
        /* 설명. 예시 주소 문자열(options=) */
        List<String> optionList = Arrays.asList(options.split("&"));
        return null;
    }
}

