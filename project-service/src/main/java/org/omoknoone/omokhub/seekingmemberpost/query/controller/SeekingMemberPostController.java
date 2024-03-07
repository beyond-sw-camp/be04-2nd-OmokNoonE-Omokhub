package org.omoknoone.omokhub.seekingmemberpost.query.controller;

import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.entity.SeekingMemberPost;
import org.omoknoone.omokhub.seekingmemberpost.query.service.SeekingMemberPostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("QuerySeekingMemberPostController")
@RequestMapping("project/seekingmemberposts")
public class SeekingMemberPostController {

    private final SeekingMemberPostService seekingMemberPostService;

    public SeekingMemberPostController(SeekingMemberPostService seekingMemberPostService) {
        this.seekingMemberPostService = seekingMemberPostService;
    }

    @GetMapping("/list/{startDate}/{title}/{techStack}")
    public ResponseEntity<List<SeekingMemberPostDTO>> searchSeekingMemberPostByCriteria(
            @PathVariable("startDate") String startDate,
            @PathVariable("title") String title,
            @PathVariable("techStack") String techStack) {

        SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO
                = new SeekingMemberPostCriteriaDTO(startDate, title, techStack);

        List<SeekingMemberPostDTO> seekingMemberPostList =
                seekingMemberPostService.searchSeekingMemberPostByCriteria(seekingMemberPostCriteriaDTO);

        return ResponseEntity.status(HttpStatus.OK).body(seekingMemberPostList);
    }

    @GetMapping("/member-post-id/{memberPostId}")
    public ResponseEntity<SeekingMemberPost> searchSeekingMemberPostDetail(@PathVariable int memberPostId) {

        SeekingMemberPost seekingMemberPost = seekingMemberPostService.searchSeekingMemberPostDetail(memberPostId);

        return ResponseEntity.status(HttpStatus.OK).body(seekingMemberPost);
    }

    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<List<SeekingMemberPost>> searchSeekingMemberMyPost (@PathVariable String memberId) {

        List<SeekingMemberPost> seekingMemberPost = seekingMemberPostService.searchSeekingMemberMyPost(memberId);

        return ResponseEntity.status(HttpStatus.OK).body(seekingMemberPost);
    }

}
