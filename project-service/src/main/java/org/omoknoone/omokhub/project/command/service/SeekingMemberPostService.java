package org.omoknoone.omokhub.project.command.service;

import org.omoknoone.omokhub.project.command.dto.SeekingMemberPostDTO;

public interface SeekingMemberPostService {
    int newPost(SeekingMemberPostDTO seekingMemberPostDTO);

    int modify(SeekingMemberPostDTO seekingMemberPostDTO);

    void removeSeekingMemberPost(int seekingMemberPostId);
}
