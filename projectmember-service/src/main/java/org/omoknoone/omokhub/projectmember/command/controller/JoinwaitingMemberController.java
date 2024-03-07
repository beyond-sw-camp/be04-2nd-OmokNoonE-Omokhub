package org.omoknoone.omokhub.projectmember.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.projectmember.command.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.command.service.JoinwaitingMemberService;
import org.omoknoone.omokhub.projectmember.command.vo.RequestProjectJoinUser;
import org.omoknoone.omokhub.projectmember.command.vo.ResponseProjectJoinUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("commandJoinwaitingMemberController")
@RequestMapping("/projectmember/joinwaitingmember")
public class JoinwaitingMemberController {

    private final JoinwaitingMemberService joinwaitingMemberService;
    private final ModelMapper modelMapper;

    @Autowired
    public JoinwaitingMemberController(JoinwaitingMemberService joinwaitingMemberService, ModelMapper modelMapper) {
        this.joinwaitingMemberService = joinwaitingMemberService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/regist_waiting")        // joinwaitingMember에 멤버 추가
    public ResponseEntity<ResponseProjectJoinUser> registWaiting(@RequestBody RequestProjectJoinUser user){

        JoinwaitingMemberDTO joinwaitingMemberDTO = modelMapper.map(user, JoinwaitingMemberDTO.class);

        joinwaitingMemberService.addJoinWaiting(joinwaitingMemberDTO);

        ResponseProjectJoinUser responseProjectJoinUser = modelMapper.map(joinwaitingMemberDTO, ResponseProjectJoinUser.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseProjectJoinUser);

    }

    @GetMapping("/delete_waiting/{joinwaitingMemberId}")
    public ResponseEntity<?> deleteWaiting(@PathVariable("joinwaitingMemberId") int joinwaitingMemberId){

        joinwaitingMemberService.deleteWaiting(joinwaitingMemberId);

        return ResponseEntity.status(HttpStatus.OK).build();

    }



}
