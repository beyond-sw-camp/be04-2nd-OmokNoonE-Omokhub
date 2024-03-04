package org.omoknoone.omokhub.user.query.repository;


import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;

@Mapper
public interface MemberMapper {
    MemberDTO selectMemberInfoByMemberId(String memberId);

    MemberDTO selectMemberIdByNickname(String nickname);

    Integer selectProfileCountByMemberId(String memberId);
}
