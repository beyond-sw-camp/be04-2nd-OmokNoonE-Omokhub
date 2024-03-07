package org.omoknoone.omokhub.projectmember.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingMemberDTO;

import java.lang.reflect.Member;
import java.util.List;

@Mapper
public interface JoinwaitingMemberMapper {
    List<Member> selectWaitingMember(int projectId);

    List<Member> selectInviteOrApplyMember();

    List<JoinwaitingMemberDTO> myCurrentApplyStatus();

}