package org.omoknoone.omokhub.project.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.project.command.service.SeekingMemberPostService;
import org.omoknoone.omokhub.project.command.vo.RequestSeekingMemberPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/project/seekingmemberposts")
public class SeekingMemberPostController {

    private final SeekingMemberPostService seekingMemberPostService;
    private final ModelMapper modelMapper;

    @Autowired
    public SeekingMemberPostController(SeekingMemberPostService seekingMemberPostService, ModelMapper modelMapper) {
        this.seekingMemberPostService = seekingMemberPostService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/newpost")
    public ResponseEntity<Map<String, Integer>> newPost(@RequestBody RequestSeekingMemberPost seekingMemberPost) {

        SeekingMemberPostDTO seekingMemberPostDTO = modelMapper.map(seekingMemberPost, SeekingMemberPostDTO.class);

        int postId = seekingMemberPostService.newPost(seekingMemberPostDTO);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new HashMap<>() {{
                    put("seekingMemberId", postId);
                }});
    }

    @PutMapping("/modify")
    public ResponseEntity<Map<String, Integer>> modify(@RequestBody RequestSeekingMemberPost seekingMemberPost) {

        SeekingMemberPostDTO seekingMemberPostDTO = modelMapper.map(seekingMemberPost, SeekingMemberPostDTO.class);

        int postId = seekingMemberPostService.modify(seekingMemberPostDTO);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new HashMap<>() {{
                    put("seekingMemberId", postId);
                }});
    }

    /* 설명. 실제로 DB값을 삭제하는 것이 아닌, 값의 상태를 삭제로 설정하는 것. (즉 업데이트이므로 Put 사용)*/
    @PutMapping("/remove/{seekingMemberPostId}")
    public ResponseEntity<?> removeSeekingMemberPost(@PathVariable int seekingMemberPostId) {

        seekingMemberPostService.removeSeekingMemberPost(seekingMemberPostId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /* 설명. 특정 회원이 작성한 모집글을 조회하여, 존재한다면 해당 모집글의 삭제 여부를 True로 변환하는 메소드 */
    @PutMapping("/remove/member-id")
    public ResponseEntity<Boolean> removeSeekingMemberPostByMemberId(
            Map<String, String> memberId) {

        seekingMemberPostService.removeSeekingMemberPostByMemberId(memberId.get("memberId"));

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(true);
    }
}
