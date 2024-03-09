package org.omoknoone.omokhub.user.query.service;

import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;

import java.util.List;

public interface MemberService {
    MemberDTO searchMemberInfoByMemberId(String memberId);
    MemberNicknameDTO getMemberIdAndNickname(String attribute);
    List<MemberNicknameDTO> getMemberIdAndNicknameByMemberList(List<String> memberList);
}
