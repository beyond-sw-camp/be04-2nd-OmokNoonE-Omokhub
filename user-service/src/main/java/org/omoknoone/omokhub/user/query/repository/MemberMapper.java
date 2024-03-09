package org.omoknoone.omokhub.user.query.repository;


import org.apache.ibatis.annotations.Mapper;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;
import org.omoknoone.omokhub.user.query.entity.Member;

import java.util.List;

@Mapper
public interface MemberMapper {
    MemberDTO selectMemberInfoByMemberId(String memberId);
    Member selectMemberNicknameById(MemberNicknameDTO memberNicknameDTO);
    List<MemberNicknameDTO> selectMemberIdAndNicknameByMemberList(List<String> memberList);
}
