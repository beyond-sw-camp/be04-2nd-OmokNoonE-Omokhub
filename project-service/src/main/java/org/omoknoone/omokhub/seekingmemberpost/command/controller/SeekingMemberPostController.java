package org.omoknoone.omokhub.seekingmemberpost.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.seekingmemberpost.command.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.command.service.SeekingMemberPostService;
import org.omoknoone.omokhub.seekingmemberpost.command.vo.RequestSeekingMemberPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @PutMapping("/remove/{seekingMemberPostId}")
    public ResponseEntity<?> removeSeekingMemberPost(@PathVariable int seekingMemberPostId) {

        seekingMemberPostService.removeSeekingMemberPost(seekingMemberPostId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
