package org.omoknoone.omokhub.projectmember.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.projectmember.query.JoinwaitingmemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JoinwaitingmemberServiceTest {

    @Autowired
    private JoinwaitingmemberService joinwaitingmemberService;

    @DisplayName("대기 멤버 조회 테스트")
    @Test
    void testSearchWaitingMember() {
        Assertions.assertDoesNotThrow(
                () -> joinwaitingmemberService.searchWaitingMember()
        );
    }

    @DisplayName("초대받은 or 신청한 프로젝트 참여 대기인원")
    @Test
    void testSearchInviteOrApplyMember(){
        Assertions.assertDoesNotThrow(
                ()-> joinwaitingmemberService.searchInviteOrApplyMember()
        );
    }

    @DisplayName("내가 신청한 프로젝트 참여 대기 현황 조회")
    @Test
    void testMyCurrentApplyStatus(){
        Assertions.assertDoesNotThrow(
                ()->joinwaitingmemberService.sesarchMyCurrentApplyStatus()
        );
    }
}