package org.omoknoone.omokhub.seekingmemberpost.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostDTO;

import java.util.List;
import java.util.Map;

@Mapper
public interface SeekingMemberPostMapper {
    List<SeekingMemberPostDTO> selectSeekingMemberPostList(SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO);

    SeekingMemberPostDTO selectSeekingMemberPostDetail(int seekingMemberPostId);

    List<SeekingMemberPostDTO> selectSeekingMemberPostByMyPost(String memberId);
}
