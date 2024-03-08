package org.omoknoone.omokhub.client;
import org.omoknoone.omokhub.projectmember.query.dto.ResponseMemberDTO;

public interface UserServiceClient {
    ResponseMemberDTO getMemberById(String memberId);

}
