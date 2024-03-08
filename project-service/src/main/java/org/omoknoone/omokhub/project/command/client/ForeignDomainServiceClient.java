package org.omoknoone.omokhub.project.command.client;

import org.omoknoone.omokhub.project.command.vo.ResponseForeignDomain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/* 설명. 이 client는 요청하는 도메인에서만 작성할 것!!!!!!!!!!!!!!!!!!!
*       응답하는 곳에서는 필요없는 파일!!!!!!!!(꼭 삭제할 것.)
* */
/* 설명. foreigndomain 에 외부 도메인 이름을 작성할 것. 예) project, member 등*/
@FeignClient(name = "omok-foreigndomain-service", url = "192.168.0.21:58000")
public interface ForeignDomainServiceClient {

    @GetMapping("/foreigndomain-service/domain/**")
    List<ResponseForeignDomain> getForeignDomains(String attribute);

}
