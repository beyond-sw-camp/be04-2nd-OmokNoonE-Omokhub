package org.omoknoone.omokhub.seekingmemberpost.query.service;

import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostCriteriaDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.dto.SeekingMemberPostDTO;
import org.omoknoone.omokhub.seekingmemberpost.query.repository.SeekingMemberPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface SeekingMemberPostService {

    List<SeekingMemberPostDTO> searchSeekingMemberPostByCriteria(SeekingMemberPostCriteriaDTO seekingMemberPostCriteriaDTO);
}
