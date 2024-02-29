package org.omoknoone.omokhub.user.query;

public class MemberController {

    private final MemberService memberService;

    public MemberController() {
        this.memberService = new MemberService();
    }

    public void searchMemberInfo(String memberId) {

        MemberDTO member = memberService.searchMemberInfoByMemberId(memberId);

        System.out.println("member = " + member);
    }

    public void searchMemberIdByNickname(String nickname) {

        MemberDTO member = memberService.searchMemberIdByNickname(nickname);

    }

    public void searchProfileCount(String memberId) {

        int profileCount = memberService.searchProfileCountByMemberId(memberId);
    }
}
