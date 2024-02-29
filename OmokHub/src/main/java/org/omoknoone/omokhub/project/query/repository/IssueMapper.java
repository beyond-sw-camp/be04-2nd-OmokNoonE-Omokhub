package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.IssueAndMemberDTO;

import java.util.List;

@Mapper
public interface IssueMapper {

    List<IssueAndMemberDTO> searchProjectIssues(int projectId);

    List<IssueAndMemberDTO> searchProjectMemberIssues(String memberId);
}
