package org.omoknoone.omokhub.project.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.project.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.project.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.project.query.entity.SeekingMemberPost;

import java.util.List;

@Mapper
public interface SeekingMemberPostMapper {
    List<SeekingMemberPostDTO> selectSeekingMemberPostList(SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO);

    SeekingMemberPost selectSeekingMemberPostDetail(int seekingMemberPostId);

    List<SeekingMemberPost> selectSeekingMemberPostByMyPost(String memberId);
}
