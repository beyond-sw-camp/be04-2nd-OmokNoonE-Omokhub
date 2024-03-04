package org.omoknoone.omokhub.seekingmemberpost.query.controller;

import org.omoknoone.omokhub.seekingmemberpost.query.service.SeekingMemberPostService;

public class SeekingMemberPostController {

    private final SeekingMemberPostService seekingMemberPostService;

    public SeekingMemberPostController(SeekingMemberPostService seekingMemberPostService) {
        this.seekingMemberPostService = seekingMemberPostService;
    }


}
