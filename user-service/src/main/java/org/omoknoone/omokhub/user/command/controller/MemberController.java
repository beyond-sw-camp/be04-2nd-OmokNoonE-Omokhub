package org.omoknoone.omokhub.user.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.user.command.dto.MemberDTO;
import org.omoknoone.omokhub.user.command.service.MemberService;
import org.omoknoone.omokhub.user.command.vo.RequestMember;
import org.omoknoone.omokhub.user.command.vo.ResponseMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/member")
public class MemberController {

    private final MemberService memberService;
    private final ModelMapper modelMapper;

    /* 설명. 로그 사용하기, github에 올릴 때 주석*/
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public MemberController(MemberService memberService, ModelMapper modelMapper) {
        this.memberService = memberService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/signup")
    public ResponseEntity<ResponseMember> signUp(@RequestBody RequestMember member) {

        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);

        memberService.signUp(memberDTO);

        ResponseMember responseMember = modelMapper.map(memberDTO, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseMember);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdraw(@RequestBody RequestMember member) {

        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);

        memberService.withdraw(memberDTO);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("/modify")
    public ResponseEntity<ResponseMember> modify(@RequestBody RequestMember member) {

        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);

        ResponseMember responseMember = memberService.modify(memberDTO);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }
}
