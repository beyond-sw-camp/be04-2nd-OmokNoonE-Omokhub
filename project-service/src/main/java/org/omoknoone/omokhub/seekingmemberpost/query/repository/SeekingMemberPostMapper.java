package org.omoknoone.omokhub.seekingmemberpost.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.entity.SeekingMemberPost;

import java.util.List;
import java.util.Map;

@Mapper
public interface SeekingMemberPostMapper {
    List<SeekingMemberPostDTO> selectSeekingMemberPostList(SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO);

    SeekingMemberPost selectSeekingMemberPostDetail(int seekingMemberPostId);

    List<SeekingMemberPost> selectSeekingMemberPostByMyPost(String memberId);
}
