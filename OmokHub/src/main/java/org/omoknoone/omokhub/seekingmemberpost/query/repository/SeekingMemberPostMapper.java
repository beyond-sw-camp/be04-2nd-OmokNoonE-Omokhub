package org.omoknoone.omokhub.seekingmemberpost.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.seekingmemberpost.query.SeekingMemberPostDTO;

import java.util.List;

@Mapper
public interface SeekingMemberPostMapper {
    List<SeekingMemberPostDTO> selectSeekingMemberPostList();

    SeekingMemberPostDTO selectSeekingMemberPostDetail(int seekingMemberPostId);

    List<SeekingMemberPostDTO> selectSeekingMemberPostByMyPost(String memberId);
}
