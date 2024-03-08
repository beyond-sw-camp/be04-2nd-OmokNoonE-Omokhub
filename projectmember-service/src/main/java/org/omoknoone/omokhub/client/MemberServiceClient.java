package org.omoknoone.omokhub.client;

import org.omoknoone.omokhub.projectmember.query.dto.ResponseMemberDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/* 메모. 서비스 이름 및 url 맞추어서 수정 */
@FeignClient(name = "omok-user-service", url = "localhost:58900")
public interface MemberServiceClient {

    /* 메모. 민석님께 받으면 맞추어서 수정 */
    @GetMapping("/<gateway 경로 적기>></{memberId}")
    List<ResponseMemberDTO> getMemberById(@PathVariable("memberId") String memberId);

}
