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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/seekingmemberpost/seekingmemberpost")
public class SeekingMemberPostController {

    private final SeekingMemberPostService seekingMemberPostService;
    private final ModelMapper modelMapper;

    /* 설명. 로그 사용하기, github에 올릴 때 주석*/
    Logger logger = LoggerFactory.getLogger(getClass());

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
}
