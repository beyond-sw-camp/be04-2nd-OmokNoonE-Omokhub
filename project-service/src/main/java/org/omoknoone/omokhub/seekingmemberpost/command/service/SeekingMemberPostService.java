package org.omoknoone.omokhub.seekingmemberpost.command.service;

import org.omoknoone.omokhub.seekingmemberpost.command.dto.SeekingMemberPostDTO;

public interface SeekingMemberPostService {
    int newPost(SeekingMemberPostDTO seekingMemberPostDTO);

    int modify(SeekingMemberPostDTO seekingMemberPostDTO);
}
