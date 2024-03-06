package org.omoknoone.omokhub.projectmember.command.service;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.omoknoone.omokhub.projectmember.command.aggregate.JoinwaitingMember;
import org.omoknoone.omokhub.projectmember.command.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.command.repository.JoinwaitingMemberRepository;
import org.omoknoone.omokhub.projectmember.command.vo.ProjectMemberVO;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingmemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

@Service
public class JoinwaitingMemberServiceImpl implements JoinwaitingMemberService{

    private final ModelMapper modelMapper;
    private final JoinwaitingMemberRepository joinwaitingMemberRepository;


    @Autowired
    public JoinwaitingMemberServiceImpl(ModelMapper modelMapper, JoinwaitingMemberRepository joinwaitingMemberRepository) {
        this.modelMapper = modelMapper;
        this.joinwaitingMemberRepository = joinwaitingMemberRepository;
    }

    /* 설명. 대기열(joinwaitingMember)에 waitingMember 추가 하는 기능 */
    @Transactional
    @Override
    public void addJoinWaiting(JoinwaitingMemberDTO joinwaitingMemberDTO) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        JoinwaitingMember joinwaitingMember = modelMapper.map(joinwaitingMemberDTO, JoinwaitingMember.class);
        joinwaitingMemberRepository.save(joinwaitingMember);
    }

    /* 설명. 대기열에서 waitingMember 삭제 하는 기능 */
    @Transactional
    @Override
    public void deleteWaiting(int joinwaitingMemberId) {

//        JoinwaitingMember joinwaitingMember = joinwaitingMemberRepository.findById(joinwaitingMemberId)
//                .orElseThrow(()-> {
//            return new EntityNotFoundException ("조회된 회원 없음");
//        });
        joinwaitingMemberRepository.deleteById(joinwaitingMemberId);
    }
}
