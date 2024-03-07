package org.omoknoone.omokhub.seekingmemberpost.query.service;

import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.entity.SeekingMemberPost;
import org.omoknoone.omokhub.seekingmemberpost.query.repository.SeekingMemberPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QuerySeekingMemberPostService")
public class SeekingMemberPostServiceImpl implements SeekingMemberPostService {

    private final SeekingMemberPostMapper seekingMemberPostMapper;

    @Autowired
    public SeekingMemberPostServiceImpl(SeekingMemberPostMapper seekingMemberPostMapper) {
        this.seekingMemberPostMapper = seekingMemberPostMapper;
    }

    @Override
    public List<SeekingMemberPostDTO> searchSeekingMemberPostByCriteria(
            SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO) {

        List<SeekingMemberPostDTO> seekingMemberPostList =
                seekingMemberPostMapper.selectSeekingMemberPostList(seekingMemberPostCriteriaDTO);

        return seekingMemberPostList;
    }

    @Override
    public SeekingMemberPost searchSeekingMemberPostDetail(int memberPostId) {
        return seekingMemberPostMapper.selectSeekingMemberPostDetail(memberPostId);
    }

    @Override
    public List<SeekingMemberPost> searchSeekingMemberMyPost(String memberId) {
        return seekingMemberPostMapper.selectSeekingMemberPostByMyPost(memberId);
    }
}
