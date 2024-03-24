package org.omoknoone.omokhub.projectmember.command.service;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.exceptions.BusinessRuleViolationException;
import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectTeam;
import org.omoknoone.omokhub.projectmember.command.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.command.repository.ProjectTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectTeamServiceImpl implements ProjectTeamService {

    private ProjectTeamRepository projectTeamRepository;
    private ModelMapper modelMapper;

    public ProjectTeamServiceImpl() {
    }

    @Autowired
    public ProjectTeamServiceImpl(ProjectTeamRepository projectTeamRepository, ModelMapper modelMapper) {
        this.projectTeamRepository = projectTeamRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public void registTeam(ProjectTeamDTO projectTeamDTO) {

        ProjectTeam projectTeam = modelMapper.map(projectTeamDTO, ProjectTeam.class);
        projectTeamRepository.save(projectTeam);
        projectTeam.getAddedDate();

        /* 유효성 검사 */
        validateProjectTeamDTO(projectTeamDTO);
    }

    private void validateProjectTeamDTO(ProjectTeamDTO teamDTO) {
        // maxMember가 0명 초과 10명 이하인지 검사
        if (teamDTO.getMaxMember() <= 0 || teamDTO.getMaxMember() > 10) {
            throw new IllegalArgumentException("최대 정원은 1명 이상 10명 이하이어야 합니다.");
        }

        /* 팀 이름이 null 또는 공백인지 검사*/
        if (teamDTO.getTeamName() == null || teamDTO.getTeamName().trim().isEmpty()) {
            throw new IllegalArgumentException("팀명은 공백 또는 띄어 쓰기만으로 작명할 수 없습니다.");
        }

        // currentMember가 maxMember를 초과하지 않는지 검사
        if (teamDTO.getCurrentMember() > teamDTO.getMaxMember()) {
            throw new BusinessRuleViolationException("현재 인원은 최대 인원을 초과할 수 없습니다.");
        }
    }

    @Override
    @Transactional
    public void deleteTeam(ProjectTeamDTO projectTeamDTO) {

        projectTeamRepository.deleteById(projectTeamDTO.getProjectTeamId());
    }
}
