package org.omoknoone.omokhub.client;

import org.omoknoone.omokhub.projectmember.command.vo.ResponseMember;
import org.springframework.stereotype.Component;

@Component
public class MockMemberServiceClient implements MemberServiceClient {

    @Override
    public ResponseMember getMemberById(String memberId) {

        // 실제 User 서비스로부터 받을 것으로 예상되는 데이터를 모방하여 반환
        return new ResponseMember(memberId, "MockName");
}
}
