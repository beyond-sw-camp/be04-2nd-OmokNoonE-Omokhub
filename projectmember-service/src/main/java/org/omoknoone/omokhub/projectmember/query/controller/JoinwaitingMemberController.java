package org.omoknoone.omokhub.projectmember.query.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.query.dto.WaitingAndMemberDTO;
import org.omoknoone.omokhub.projectmember.query.service.JoinwaitingMemberService;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("QueryJoinwaitingMemberController")
@RequestMapping("/")
public class JoinwaitingMemberController {

    private final JoinwaitingMemberService joinwaitingMemberService;
    private final ModelMapper mapper;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public JoinwaitingMemberController(JoinwaitingMemberService joinwaitingMemberService, ModelMapper mapper) {
        this.joinwaitingMemberService = joinwaitingMemberService;
        this.mapper = mapper;
    }

    @GetMapping("/project-member/join-waiting-members/get-waiting-members/project-team-id/{projectTeamId}")
    public ResponseEntity<List<WaitingAndMemberDTO>> getWaitingMembers(@PathVariable("projectTeamId") int projectTeamId){

        List<WaitingAndMemberDTO> waitingMemberList = joinwaitingMemberService.searchWaitingMember(projectTeamId);
        logger.info("waitingMember 컨트롤러 전 {} : ", waitingMemberList);

//        List<WaitingAndMemberDTO> resultList = waitingMemberList.stream()
//                .map(data->mapper.map(data, WaitingAndMemberDTO.class))
//                .collect(Collectors.toList());
        logger.info("waitingMember 컨트롤러 후 {} : ", waitingMemberList);


        return ResponseEntity.status(HttpStatus.OK).body(waitingMemberList);
    }

//    @GetMapping("/projectmember/joinwaitingmembers/my_current_apply_status/member-id/{memberId}")
//    public ResponseEntity<List<MemberDTO>>


}
