package org.omoknoone.omokhub.user.query.service;

import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberNicknameDTO;

public interface MemberService {
    MemberDTO searchMemberInfoByMemberId(String memberId);

    MemberNicknameDTO searchMemberIdByNickname(String nickname);

    Integer searchProfileCountByMemberId(String memberId);
}
