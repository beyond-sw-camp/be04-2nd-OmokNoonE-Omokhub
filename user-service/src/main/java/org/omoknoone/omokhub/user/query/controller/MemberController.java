package org.omoknoone.omokhub.user.query.controller;

import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;
import org.omoknoone.omokhub.user.query.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("QueryMemberController")
@RequestMapping("/user/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<MemberDTO> searchMemberInfo(@PathVariable String memberId) {

        MemberDTO member = memberService.searchMemberInfoByMemberId(memberId);

        return ResponseEntity.status(HttpStatus.OK).body(member);
    }

    @GetMapping("/nickname/{nickname}")
    public ResponseEntity<MemberNicknameDTO> getMemberIdAndNicknameByNickname(@PathVariable String nickname) {

        MemberNicknameDTO member = memberService.getMemberIdAndNickname(nickname);

        return ResponseEntity.status(HttpStatus.OK).body(member);
    }

    @GetMapping("/memberid-nickname/{memberId}")
    public ResponseEntity<MemberNicknameDTO> getMemberIdAndNicknameByMemberId(@PathVariable String memberId){

        MemberNicknameDTO member = memberService.getMemberIdAndNickname(memberId);

        return ResponseEntity.status(HttpStatus.OK).body(member);
    }

    @GetMapping("/api/member-id/{memberIds}")
    public ResponseEntity<List<MemberNicknameDTO>> getMemberIdAndNicknameByMemberList(@PathVariable List<String> memberIds){

        List<MemberNicknameDTO> members = memberService.getMemberIdAndNicknameByMemberList(memberIds);

        return ResponseEntity.status(HttpStatus.OK).body(members);
    }

}
