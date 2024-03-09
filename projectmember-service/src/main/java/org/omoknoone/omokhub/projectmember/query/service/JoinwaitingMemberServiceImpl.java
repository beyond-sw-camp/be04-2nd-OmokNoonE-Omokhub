package org.omoknoone.omokhub.projectmember.query.service;

import lombok.extern.slf4j.Slf4j;
import org.omoknoone.omokhub.client.MemberServiceClient;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.query.dto.ResponseMemberDTO;
import org.omoknoone.omokhub.projectmember.query.dto.WaitingAndMemberDTO;
import org.omoknoone.omokhub.projectmember.query.repository.JoinwaitingMemberMapper;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service("QueryJoinwaitingMemberServiceImpl")
@Slf4j
public class JoinwaitingMemberServiceImpl implements JoinwaitingMemberService {

    private final JoinwaitingMemberMapper joinwaitingMemberMapper;
    private final MemberServiceClient memberServiceClient;

    Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    public JoinwaitingMemberServiceImpl(JoinwaitingMemberMapper joinwaitingMemberMapper, MemberServiceClient memberServiceClient) {
        this.joinwaitingMemberMapper = joinwaitingMemberMapper;
        this.memberServiceClient = memberServiceClient;
    }

    @Override
    public List<WaitingAndMemberDTO> searchWaitingMember(int findprojectId) {
//
//        // 데이터베이스에서 기본 정보를 조회
//        List<WaitingAndMemberDTO> memberList = joinwaitingMemberMapper.selectWaitingMember(findprojectId);
//
//        // 각 대기 중인 멤버에 대한 추가 정보를 user-service에서 조회
//        for (WaitingAndMemberDTO member : memberList) {
//            // 'nicknameAndId' 리스트 내의 각 ResponseMemberDTO 객체에 대하여
//            for (ResponseMemberDTO responseMember : member.getNicknameAndId()) {
//                // user-service로부터 멤버의 추가 정보를 조회
//                ResponseMemberDTO additionalInfo = memberServiceClient.getMemberById(responseMember.getMemberId());
//                // 받아온 추가 정보로부터 nickname 설정
//                responseMember.setNickname(additionalInfo.getNickname());
//                // 필요한 경우 여기에 memberId를 설정하는 로직도 추가할 수 있습니다.
//                // 예: responseMember.setMemberId(additionalInfo.getMemberId());
//            }
//        }
//
//        return memberList;

// 서비스 로직에서 배치 요청 사용

            List<WaitingAndMemberDTO> memberList = joinwaitingMemberMapper.selectWaitingMember(findprojectId);


            // memberId 리스트 추출
            List<String> memberIds = memberList.stream()
                    .flatMap(member -> member.getNicknameAndId().stream())
                    .map(ResponseMemberDTO::getMemberId)
                    .collect(Collectors.toList());

//            Map<String, List<String>> memberListMap = new HashMap<>();
            logger.info("user 클라이언트 호출 {} ", memberIds);
            // 배치 요청으로 멤버 정보 조회
            List<ResponseMemberDTO> membersInfo = memberServiceClient.getUserInfos(memberIds);

            // memberId를 키로 하고 ResponseMemberDTO를 값으로 하는 맵 생성
            Map<String, ResponseMemberDTO> membersInfoMap = membersInfo.stream()
                    .collect(Collectors.toMap(ResponseMemberDTO::getMemberId, Function.identity()));

            // 조회된 정보를 memberList에 설정
            for (WaitingAndMemberDTO member : memberList) {
                for (ResponseMemberDTO responseMember : member.getNicknameAndId()) {
                    ResponseMemberDTO additionalInfo = membersInfoMap.get(responseMember.getMemberId());
                    if (additionalInfo != null) {
                        responseMember.setNickname(additionalInfo.getNickname());
                    }
                }
            }

            return memberList;
        }


    @Override
    public void searchInviteOrApplyMember() {
        List<MemberDTO> members = joinwaitingMemberMapper.selectInviteOrApplyMember();
    }

    @Override
    public void sesarchMyCurrentApplyStatus() {
        List<JoinwaitingMemberDTO> waitingstatus = joinwaitingMemberMapper.myCurrentApplyStatus();
    }
}
