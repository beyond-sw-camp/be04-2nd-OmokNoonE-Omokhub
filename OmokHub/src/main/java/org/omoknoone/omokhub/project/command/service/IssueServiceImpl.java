package org.omoknoone.omokhub.project.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.project.command.aggregate.Issue;
import org.omoknoone.omokhub.project.command.dto.IssueDTO;
import org.omoknoone.omokhub.project.command.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class IssueServiceImpl implements IssueService{

    private final ModelMapper modelMapper;
    private final IssueRepository issueRepository;

    @Autowired
    public IssueServiceImpl(ModelMapper modelMapper, IssueRepository issueRepository) {
        this.modelMapper = modelMapper;
        this.issueRepository = issueRepository;
    }

    @Transactional
    @Override
    public void registIssue(IssueDTO issueDTO) {

        /* 설명. default값 설정 */
//        issueDTO.setClosed(false);
//        issueDTO.setPostedDate(LocalDateTime.now());
//        issueDTO.setLastModifiedDate(LocalDateTime.now());


        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Issue issue = modelMapper.map(issueDTO,Issue.class);

        issueRepository.save(issue);
    }

    @Override
    public void modifyIssue(IssueDTO issueDTO) {

        Issue foundIssue = issueRepository.findById(issueDTO.getIssueId()).orElseThrow(IllegalArgumentException::new);
        foundIssue.setTitle(issueDTO.getTitle());
        foundIssue.setContent(issueDTO.getContent());
        foundIssue.setClosed(issueDTO.isClosed());
        foundIssue.setPostedDate(issueDTO.getPostedDate());
        foundIssue.setClosedDate(issueDTO.getClosedDate());
        foundIssue.setLastModifiedDate(issueDTO.getLastModifiedDate());
        foundIssue.setProjectMemberId(issueDTO.getProjectMemberId());
        foundIssue.setProjectId(issueDTO.getProjectId());

        issueRepository.save(foundIssue);
    }

    @Override
    public void deleteIssue(int issueId) {
        issueRepository.deleteById(issueId);
    }
}
