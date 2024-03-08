package org.omoknoone.omokhub.user.command.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "omok-project-service", url = "192.168.0.21:58000")
public interface ProjectServiceClient {

    @PutMapping("/project-service/project/seekingmemberposts/remove/member-id")
    Boolean removeSeekingMemberPostByMemberId(Map<String, String> memberId);

}
