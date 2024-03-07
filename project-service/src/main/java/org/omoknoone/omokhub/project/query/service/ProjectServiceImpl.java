package org.omoknoone.omokhub.project.query.service;

import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;
import org.omoknoone.omokhub.project.query.repository.ProjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QueryProjectServiceImpl")
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    public ProjectServiceImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    private final ProjectMapper projectMapper;
    Logger logger = LoggerFactory.getLogger(getClass());


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
}

