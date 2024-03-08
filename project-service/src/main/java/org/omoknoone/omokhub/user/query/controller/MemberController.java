package org.omoknoone.omokhub.user.query.controller;

import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.service.MemberService;

public class MemberController {

    private final MemberService memberService;

    public MemberController() {
        this.memberService = new MemberService();
    }

    public void searchMemberInfo(String memberId) {

        MemberDTO member = memberService.searchMemberInfoByMemberId(memberId);

    }

    public void searchMemberIdByNickname(String nickname) {

        MemberDTO member = memberService.searchMemberIdByNickname(nickname);

    }

    public void searchProfileCount(String memberId) {

        int profileCount = memberService.searchProfileCountByMemberId(memberId);
    }
}
