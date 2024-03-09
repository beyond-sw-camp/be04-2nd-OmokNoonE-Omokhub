package org.omoknoone.omokhub.user.command.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "omok-project-service", url = "172.30.1.28:58000")
public interface ProjectServiceClient {

    @PutMapping("/project-service/project/seekingmemberposts/remove/member-id")
    Object removeSeekingMemberPostByMemberId(Map<String, String> memberId);

}
