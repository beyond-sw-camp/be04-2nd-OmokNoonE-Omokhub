package org.omoknoone.omokhub.seekingmemberpost.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.omoknoone.omokhub.seekingmemberpost.query.entity.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.service.SeekingMemberPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@SpringBootTest
class SeekingMemberPostServiceTest {

    @Autowired
    private SeekingMemberPostService seekingMemberPostService;

    private static Stream<Arguments> getSeekingMemberPostInfo() {

        SeekingMemberPostDTO seekingMemberPost = new SeekingMemberPostDTO();
        seekingMemberPost.setSeekingMemberId(1);
        seekingMemberPost.setTitle("모집글 제목 1");
        seekingMemberPost.setStartDate(LocalDate.now());
        seekingMemberPost.setTechStack("자바, 스프링, MyBatis");
        seekingMemberPost.setSeeking(true);
        seekingMemberPost.setDeleted(false);

        return Stream.of(
                Arguments.of(seekingMemberPost)
        );
    }

    @DisplayName("조건에 따른 모집글 목록 검색 테스트")
//    @ParameterizedTest
//    @MethodSource("getSeekingMemberPostInfo")
    @Test
    void testSearchMemberInfoByMemberId() {

        Map<String, Object> criteria = new HashMap<>();
        criteria.put("startDate", LocalDate.of(2024, 3, 8));
        criteria.put("title", "자바 백엔드 프로젝트");
        criteria.put("techStack", "자바");

        Assertions.assertDoesNotThrow(
                () -> seekingMemberPostService.findSeekingMemberPostList(criteria)
        );
    }

}