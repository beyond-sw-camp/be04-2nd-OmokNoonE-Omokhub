package org.omoknoone.omokhub.user.query.repository;


import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;

@Mapper
public interface MemberMapper {
    MemberDTO selectMemberInfoByMemberId(String memberId);

    MemberNicknameDTO selectMemberIdByNickname(String nickname);

    Integer selectProfileCountByMemberId(String memberId);
}
