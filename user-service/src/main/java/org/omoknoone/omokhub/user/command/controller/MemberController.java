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
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user/members")
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

    /* 설명. 탈퇴 요청 들어온 경우 */
    @PutMapping("/withdraw")
    public ResponseEntity<?> withdraw(@RequestBody RequestMember member) {

        /* 설명.
         *  1. 탈퇴할 회원이 작성한 모집글 목록의 진행여부 종료를 위해 memberId를 전달
         *  2. soft delete 된 경우 회원의 탈퇴 여부 True로 변경
        * */
        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);

        memberService.withdraw(memberDTO);

        /* 설명. 3. 탈퇴 회원에게 NO_CONTENT return */
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/modify")
    public ResponseEntity<ResponseMember> modify(@RequestBody RequestMember member) {

        MemberDTO memberDTO = modelMapper.map(member, MemberDTO.class);

        ResponseMember responseMember = modelMapper.map(memberService.modify(memberDTO), ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }
}
