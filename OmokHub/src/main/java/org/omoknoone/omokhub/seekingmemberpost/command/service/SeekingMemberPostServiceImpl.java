package org.omoknoone.omokhub.seekingmemberpost.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.seekingmemberpost.command.aggregate.SeekingMemberPost;
import org.omoknoone.omokhub.seekingmemberpost.command.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.command.repository.SeekingMemberPostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeekingMemberPostServiceImpl implements SeekingMemberPostService {

    private final ModelMapper modelMapper;
    private final SeekingMemberPostRepository seekingMemberPostRepository;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    public SeekingMemberPostServiceImpl(ModelMapper modelMapper, SeekingMemberPostRepository seekingMemberPostRepository) {
        this.modelMapper = modelMapper;
        this.seekingMemberPostRepository = seekingMemberPostRepository;
    }

    @Override
    public int newPost(SeekingMemberPostDTO seekingMemberPostDTO) {
        logger.info("[LOGGER] newSeekingMemberPost techStack: {}", seekingMemberPostDTO.getTechStack());

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        SeekingMemberPost seekingMemberPost = modelMapper.map(seekingMemberPostDTO, SeekingMemberPost.class);

        List<String> techStackList = seekingMemberPostDTO.getTechStack();

        StringBuilder sb = new StringBuilder();
        for (String s : techStackList) {
            sb.append(s + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        String techStack = sb.toString();

        seekingMemberPost.setTechStack(techStack);


        seekingMemberPostRepository.save(seekingMemberPost);

        logger.info("[LOGGER] after 모집글 생성 후 ID 값: {}", seekingMemberPost.getSeekingMemberPostId());

        return seekingMemberPost.getSeekingMemberPostId();
    }


//    @Transactional
//    public void signUp(SeekingMemberPostDTO newMember) {
//        logger.info("[LOGGER] newMember: {}", newMember);
//
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//        memberRepository.save(modelMapper.map(newMember, SeekingMemberPost.class));
//    }
}
