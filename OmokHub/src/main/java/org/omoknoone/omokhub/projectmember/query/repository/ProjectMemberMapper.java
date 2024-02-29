package org.omoknoone.omokhub.projectmember.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.projectmember.query.ProjectMemberDTO;

import java.util.List;

@Mapper
public interface ProjectMemberMapper {

    List<ProjectMemberDTO> getTeamMemberInfo(int projectMemberId);
}