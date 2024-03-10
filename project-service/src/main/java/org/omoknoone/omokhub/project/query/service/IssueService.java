package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.IssueAndMemberDTO;

import java.util.List;

public interface IssueService {

    List<IssueAndMemberDTO> searchProjectIssuesById(int projectId);

    List<IssueAndMemberDTO> searchProjectIssuesByMemberId(String memberId);
}
