package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.IssueDTO;

import java.util.List;

@Mapper
public interface IssueMapper {

    List<IssueDTO> searchProjectIssues(int projectId);

    List<IssueDTO> searchProjectMemberIssues(String memberId);
}
