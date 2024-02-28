package org.omoknoone.omokhub.seekingmemberpost.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SeekingMemberPostServiceTest {

    @Autowired
    private SeekingMemberPostService seekingMemberPostService;

    /*private static Stream<Arguments> getMemberInfo() {

        MemberDTO memberInfo = new MemberDTO();
        memberInfo.setMemberId("user1");
        memberInfo.setName("뱁새");
        memberInfo.setNickname("오목눈이");
        memberInfo.setEmail("user01@gmail.com");
        memberInfo.setPhoneNum("010-1234-2233");
        memberInfo.setAddress("서울시 서초구");
        LocalDate birthday = LocalDate.of(2023, 7, 15);
        memberInfo.setBirthday(birthday);

        return Stream.of(
                Arguments.of(memberInfo)
        );
    }

    @DisplayName("모집글 목록 테스트")
    @Test
    void testSearchMemberInfoByMemberId() {
        Assertions.assertDoesNotThrow(
                () -> seekingMemberPostService.)
        );
    }

    @DisplayName("모집글 상세보기 테스트")
    @Test
//    @ParameterizedTest
//    @MethodSource("getMemberInfo")
    void testSearchMemberInfoByMemberId(MemberDTO memberDTO) {
        Assertions.assertDoesNotThrow(
                () -> memberService.searchMemberInfoByMemberId(memberDTO.getMemberId())
        );
    }

    @DisplayName("내가 작성한 모집글 목록 테스트")
    @Test
//    @ParameterizedTest
//    @MethodSource("getMemberInfo")
    void testSearchMemberInfoByMemberId(MemberDTO memberDTO) {
        Assertions.assertDoesNotThrow(
                () -> memberService.searchMemberInfoByMemberId(memberDTO.getMemberId())
        );
    }*/
}