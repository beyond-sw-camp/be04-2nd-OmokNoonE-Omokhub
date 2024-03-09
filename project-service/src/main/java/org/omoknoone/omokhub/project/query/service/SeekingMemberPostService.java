package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.project.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.project.query.entity.SeekingMemberPost;

import java.util.List;

public interface SeekingMemberPostService {

    List<SeekingMemberPostDTO> searchSeekingMemberPostByCriteria(SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO);

    SeekingMemberPost searchSeekingMemberPostDetail(int memberPostId);

    List<SeekingMemberPost> searchSeekingMemberMyPost(String memberId);
}
