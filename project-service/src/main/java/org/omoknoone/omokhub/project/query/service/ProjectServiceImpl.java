package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;
import org.omoknoone.omokhub.project.query.repository.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        List<String> statusList = Arrays.asList(statusString.split("-"));
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByStatusList(statusList);

        return projects;
    }

    @Override
    public List<ProjectAndTeamAndMemberDTO> searchProjectByOptions(String options) {
        /*
         * 설명. 예시 주소값
         *   http://localhost:58000/project-service/project/projects/search-list/title=프로젝트&projectTeam=오목눈이&startDate=2022-05-08&statusList=중단-완료
         * */


        /* 설명. '&'를 기준으로 파라미터를 분리, 키-값 쌍으로 만듦 */
        Map<String, Object> params = Arrays.stream(options.split("&"))

                /* 설명. '='을 기준으로 파라미터의 키와 값을 나누어 map 형태로 저장 */
                .map(option -> option.split("="))

                /* 설명. 그 중, 키와 값이 각각 하나씩은 있는 것들만 처리 */
                .filter(keyValue -> keyValue.length == 2)
                .collect(Collectors.toMap(
                        /* 설명. 키 값 처리 (키는 '=' 앞의 문자열) */
                        keyValue -> keyValue[0],

                        /* 설명. value 값 처리 (status인 경우 여러 값이 들어올 수 있기에 구분자(-)를 활용하여  List<String> 형태로 저장) */
                        keyValue -> keyValue[0].equals("statusList") ?
                                Arrays.asList(keyValue[1].split("-")) : keyValue[1]
                ));
        if (params.isEmpty()) {
            throw new IllegalArgumentException("options 문자열이 잘못되었습니다.");
        }
        List<ProjectAndTeamAndMemberDTO> projects = projectMapper.searchProjectByOptions(params);
        return projects;
    }


}

