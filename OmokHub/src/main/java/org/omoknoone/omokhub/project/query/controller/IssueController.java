package org.omoknoone.omokhub.project.query.controller;

import org.omoknoone.omokhub.project.query.dto.IssueAndMemberDTO;
import org.omoknoone.omokhub.project.query.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class IssueController {

    private IssueService issueService;

    @Autowired
    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }


    public void searchProjectIssues(int projectId){
        List<IssueAndMemberDTO> issues = issueService.searchProjectIssues(projectId);
    }

    public void searchProjectMemberIssues(String memberId){
        List<IssueAndMemberDTO> issues = issueService.searchProjectMemberIssues(memberId);
    }
}
