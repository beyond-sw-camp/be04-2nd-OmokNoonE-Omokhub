package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.IssueAndMemberDTO;
import org.omoknoone.omokhub.project.query.repository.IssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("QueryIssueServiceImpl")
public class IssueServiceImpl implements IssueService{

    private IssueMapper issueMapper;

    @Autowired
    public IssueServiceImpl(IssueMapper issueMapper) {
        this.issueMapper = issueMapper;
    }

    @Override
    public List<IssueAndMemberDTO> searchProjectIssuesById(int projectId){
        return issueMapper.searchProjectIssuesById(projectId);
    }

    @Override
    public List<IssueAndMemberDTO> searchProjectIssuesByMemberId(String memberId){
        return issueMapper.searchProjectIssuesByMemberId(memberId);
    }
}
