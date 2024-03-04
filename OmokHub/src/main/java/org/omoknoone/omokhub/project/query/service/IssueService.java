package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.entity.dto.IssueAndMemberDTO;
import org.omoknoone.omokhub.project.query.repository.IssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class IssueService {

    private IssueMapper issueMapper;

    @Autowired
    public IssueService(IssueMapper issueMapper) {
        this.issueMapper = issueMapper;
    }

    public List<IssueAndMemberDTO> searchProjectIssues(int projectId){
        return issueMapper.searchProjectIssues(projectId);
    }

    public List<IssueAndMemberDTO> searchProjectMemberIssues(String memberId){
        return issueMapper.searchProjectMemberIssues(memberId);
    }
}
