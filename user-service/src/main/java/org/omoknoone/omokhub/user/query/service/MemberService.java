package org.omoknoone.omokhub.user.query.service;

import org.omoknoone.omokhub.user.query.dto.MemberDTO;

public interface MemberService {
    MemberDTO searchMemberInfoByMemberId(String memberId);

    MemberDTO searchMemberIdByNickname(String nickname);

    Integer searchProfileCountByMemberId(String memberId);
}
