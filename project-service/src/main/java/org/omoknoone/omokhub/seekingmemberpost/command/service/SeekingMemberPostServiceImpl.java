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

import java.util.List;

@Service
public class SeekingMemberPostServiceImpl implements SeekingMemberPostService {

    private final ModelMapper modelMapper;
    private final SeekingMemberPostRepository seekingMemberPostRepository;

    @Autowired
    public SeekingMemberPostServiceImpl(ModelMapper modelMapper, SeekingMemberPostRepository seekingMemberPostRepository) {
        this.modelMapper = modelMapper;
        this.seekingMemberPostRepository = seekingMemberPostRepository;
    }

    @Override
    @Transactional
    public int newPost(SeekingMemberPostDTO seekingMemberPostDTO) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        SeekingMemberPost seekingMemberPost = modelMapper.map(seekingMemberPostDTO, SeekingMemberPost.class);

        techStackToString(seekingMemberPostDTO, seekingMemberPost);

        seekingMemberPostRepository.save(seekingMemberPost);


        return seekingMemberPost.getSeekingMemberPostId();
    }

    @Override
    @Transactional
    public int modify(SeekingMemberPostDTO seekingMemberPostDTO) {

        SeekingMemberPost seekingMemberPost = seekingMemberPostRepository
                .findById(seekingMemberPostDTO.getSeekingMemberPostId())
                .orElseThrow(IllegalArgumentException::new);

        if(!seekingMemberPostDTO.getTechStack().isEmpty()) {
            techStackToString(seekingMemberPostDTO, seekingMemberPost);
        }
        seekingMemberPost.setTitle(seekingMemberPostDTO.getTitle());
        seekingMemberPost.setSeekingMember(seekingMemberPostDTO.getSeekingMember());
        seekingMemberPost.setStartDate(seekingMemberPostDTO.getStartDate());
        seekingMemberPost.setEndDate(seekingMemberPostDTO.getEndDate());
        seekingMemberPost.setContent(seekingMemberPostDTO.getContent());
        seekingMemberPost.setIsSeeking(seekingMemberPostDTO.getIsSeeking());

        seekingMemberPostRepository.save(seekingMemberPost);

        return seekingMemberPost.getSeekingMemberPostId();
    }

    private void techStackToString(SeekingMemberPostDTO seekingMemberPostDTO, SeekingMemberPost seekingMemberPost) {
        List<String> techStackList = seekingMemberPostDTO.getTechStack();

        StringBuilder sb = new StringBuilder();
        for (String s : techStackList) {
            sb.append(s + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        String techStack = sb.toString();

        seekingMemberPost.setTechStack(techStack);
    }

}
