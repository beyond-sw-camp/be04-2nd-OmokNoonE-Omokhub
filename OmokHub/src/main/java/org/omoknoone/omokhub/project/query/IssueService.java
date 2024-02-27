package org.omoknoone.omokhub.project.query;

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

    public void searchProjectIssues(int projectId){
        List<IssueDTO> issues = issueMapper.searchProjectIssues(projectId);
        issues.forEach(System.out::println);
    }

    public void searchProjectMemberIssues(String memberId){
        List<IssueDTO> issues = issueMapper.searchProjectMemberIssues(memberId);
        issues.forEach(System.out::println);
    }
}
