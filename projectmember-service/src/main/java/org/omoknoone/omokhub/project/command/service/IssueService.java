package org.omoknoone.omokhub.project.command.service;

import org.omoknoone.omokhub.project.command.dto.IssueDTO;

public interface IssueService {
    void registIssue(IssueDTO issueDTO);

    void modifyIssue(IssueDTO issueDTO);

    void deleteIssue(int issueId);
}
