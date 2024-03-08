package org.omoknoone.omokhub.client;
import org.omoknoone.omokhub.projectmember.command.vo.ResponseMember;

public interface MemberServiceClient {
    ResponseMember getMemberById(String memberId);

}
