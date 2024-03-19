package org.omoknoone.omokhub.projectmember.query.service;

import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.projectmember.query.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.query.entity.ProjectTeam;
import org.omoknoone.omokhub.projectmember.query.repository.ProjectTeamMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("QueryProjectTeamServiceImpl")
@Slf4j
public class ProjectTeamServiceImpl implements ProjectTeamService {

//    Logger logger = LoggerFactory.getLogger(getClass());

    private final ProjectTeamMapper projectTeamMapper;

    @Autowired
    public ProjectTeamServiceImpl(ProjectTeamMapper projectTeamMapper) {
        this.projectTeamMapper = projectTeamMapper;
    }

    @Override
    public List<ProjectTeamDTO> searchProjectTeam(int projectTeamId) {

//        logger.info("서비스 넘어온 후 {}", projectTeamId);
        List<ProjectTeam> projectTeamList = projectTeamMapper.selectProjectTeamByProjectTeamId(projectTeamId);
        for (ProjectTeam projectTeam : projectTeamList) {
//            logger.info("projectTeamMapper에 넣은 후 {}", projectTeam);
        }

        List<ProjectTeamDTO> projectTeamDTOList = projectTeamToProjectTeamDTO(projectTeamList);
        for (ProjectTeamDTO projectTeamDTO : projectTeamDTOList) {
//            logger.info("projectTeamDTOList 넣은 후 {}", projectTeamDTO);
        }
        return projectTeamToProjectTeamDTO(projectTeamList);
    }

    private List<ProjectTeamDTO> projectTeamToProjectTeamDTO(List<ProjectTeam> projectTeamList) {
        List<ProjectTeamDTO> projectTeamDTOList = new ArrayList<>();

        for (ProjectTeam projectTeam : projectTeamList) {
            ProjectTeamDTO projectTeamDTO = new ProjectTeamDTO();
//                projectTeamDTO.setProjectTeamId(projectTeam.getProjectTeamId());
                projectTeamDTO.setTeamName(projectTeam.getTeamName());
                projectTeamDTO.setCurrentMember(projectTeam.getCurrentMember());
                projectTeamDTO.setMaxMember(projectTeam.getMaxMember());
                projectTeamDTO.setAddedDate(projectTeam.getAddedDate());
                projectTeamDTO.setActive(projectTeam.isActive());

            projectTeamDTOList.add(projectTeamDTO);
        }

        return projectTeamDTOList;
    }
}