//package org.omoknoone.omokhub.projectmember.query.client;
//
//import org.omoknoone.omokhub.projectmember.command.vo.ResponseMember;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//public class RealMemberServiceClient implements MemberServiceClient {
//
//    private final RestTemplate restTemplate;
//    private final String userServiceUrl;
//
//    @Autowired
//    public RealUserServiceClient(RestTemplate restTemplate, @Value("${user.service.url}") String userServiceUrl) {
//        this.restTemplate = restTemplate;
//        this.userServiceUrl = userServiceUrl;
//    }
//
//    @Override
//    public ResponseMember getMemberById(String memberId) {
//        ResponseEntity<ResponseMember> response = restTemplate.getForEntity(userServiceUrl + "/users/" + memberId, ResponseMember.class);
//        return response.getBody();
//    }
//
//}
