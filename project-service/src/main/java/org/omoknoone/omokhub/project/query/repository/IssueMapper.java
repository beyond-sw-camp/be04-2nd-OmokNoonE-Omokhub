package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.dto.IssueAndMemberDTO;

import java.util.List;

@Mapper
public interface IssueMapper {

    List<IssueAndMemberDTO> searchProjectIssuesById(int projectId);

    List<IssueAndMemberDTO> searchProjectIssuesByMemberId(String memberId);
}
