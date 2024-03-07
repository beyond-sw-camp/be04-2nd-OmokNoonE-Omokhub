package org.omoknoone.omokhub.seekingmemberpost.query.service;

import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.entity.SeekingMemberPost;
import org.omoknoone.omokhub.seekingmemberpost.query.repository.SeekingMemberPostMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QuerySeekingMemberPostService")
@Slf4j
public class SeekingMemberPostServiceImpl implements SeekingMemberPostService {

    private final SeekingMemberPostMapper seekingMemberPostMapper;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public SeekingMemberPostServiceImpl(SeekingMemberPostMapper seekingMemberPostMapper) {
        this.seekingMemberPostMapper = seekingMemberPostMapper;
    }

    @Override
    public List<SeekingMemberPostDTO> searchSeekingMemberPostByCriteria(
            SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO) {

        logger.info("service impl Mapper이전 : {}", seekingMemberPostCriteriaDTO);
        List<SeekingMemberPostDTO> seekingMemberPostList =
                seekingMemberPostMapper.selectSeekingMemberPostList(seekingMemberPostCriteriaDTO);
        logger.info("service impl Mapper이후 : {}", seekingMemberPostList);

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
