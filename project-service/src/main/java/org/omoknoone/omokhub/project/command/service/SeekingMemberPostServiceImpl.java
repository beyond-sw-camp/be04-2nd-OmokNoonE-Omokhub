package org.omoknoone.omokhub.project.command.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.project.command.aggregate.SeekingMemberPost;
import org.omoknoone.omokhub.project.command.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.project.command.repository.SeekingMemberPostRepository;
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

    @Override
    public void removeSeekingMemberPost(int seekingMemberPostId) {

        SeekingMemberPost seekingMemberPost
                = seekingMemberPostRepository.findById(seekingMemberPostId).orElseThrow(IllegalArgumentException::new);

        seekingMemberPost.setIsDeleted(true);

        seekingMemberPostRepository.flush();
    }

    @Override
    public void removeSeekingMemberPostByMemberId(String memberId) {
        List<SeekingMemberPost> seekingMemberPosts
                = seekingMemberPostRepository.findSeekingMemberPostsByMemberId(memberId);

        if(seekingMemberPosts.isEmpty()){
           throw new IllegalArgumentException(memberId + "아이디의 유저가 작성한 모집글이 존재하지 않음");
        }

        for (SeekingMemberPost seekingMemberPost : seekingMemberPosts) {
            seekingMemberPost.setIsDeleted(true);
        }
        seekingMemberPostRepository.flush();
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
