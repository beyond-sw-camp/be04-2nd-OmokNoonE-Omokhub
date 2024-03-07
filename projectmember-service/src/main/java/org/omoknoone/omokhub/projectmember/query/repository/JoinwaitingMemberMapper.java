package org.omoknoone.omokhub.projectmember.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.query.dto.WaitingAndMemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;

import java.lang.reflect.Member;
import java.util.List;

@Mapper
public interface JoinwaitingMemberMapper {
    List<WaitingAndMemberDTO> selectWaitingMember(int projectTeamId);

    List<MemberDTO> selectInviteOrApplyMember();

    List<JoinwaitingMemberDTO> myCurrentApplyStatus();

}