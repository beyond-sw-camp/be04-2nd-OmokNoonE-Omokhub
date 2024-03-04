package org.omoknoone.omokhub.projectmember.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.projectmember.query.entity.dto.JoinwaitingmemberDTO;

import java.lang.reflect.Member;
import java.util.List;

@Mapper
public interface JoinwaitingmemberMapper {
    List<Member> selectWaitingMember(int projectId);

    List<Member> selectInviteOrApplyMember();

    List<JoinwaitingmemberDTO> myCurrentApplyStatus();

}