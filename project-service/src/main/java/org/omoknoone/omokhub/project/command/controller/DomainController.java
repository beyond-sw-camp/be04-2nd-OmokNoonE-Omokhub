package org.omoknoone.omokhub.project.command.controller;

import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.project.command.dto.DomainDTO;
import org.omoknoone.omokhub.project.command.service.DomainService;
import org.omoknoone.omokhub.project.command.vo.ResponseDomain;
import org.omoknoone.omokhub.project.command.vo.ResponseForeignDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/domain/domains")
public class DomainController {
    private ModelMapper modelMapper;
    private DomainService domainService;

    @Autowired
    public DomainController(ModelMapper modelMapper, DomainService domainService) {
        this.modelMapper = modelMapper;
        this.domainService = domainService;
    }

    /* 설명. 관계 User(Request) Order(Response)
    *           User가 Order에 대한 정보가 필요한 상황
    * */

    /* 설명. [user-service]
    *       이 메소드는 요청하는 도메인(user)에서 작성하는 메소드입니다.
    *       !!!!!!!!!!!!응답하는 도메인에서는 삭제할 것!!!!!!!!!!!!
    * */
    /* 설명. 외부 도메인의 값을 포함하는 현재 도메인을 반환하는 메소드 */
    @GetMapping("/domains/{attribute}")
    public ResponseEntity<ResponseDomain> getUser(@PathVariable("attribute") String attribute) {

        DomainDTO domainDTO = domainService.getDomainByAttribute(attribute);

        ResponseDomain returnValue = modelMapper.map(domainDTO, ResponseDomain.class);

        return ResponseEntity.status(HttpStatus.OK).body(returnValue);
    }


    /* 설명. [order-service]
    *       이 메소드는 응답하는 도메인(order)에서 작성하는 메소드입니다.
    *       !!!!!!!!!!!!요청하는 도메인에서는 삭제할 것!!!!!!!!!!!!
    * */
    /* 설명. 외부 도메인의 속성값을 통하여 해당하는 현 도메인의 정보를 외부 도메인에 전달하는 메소드 */
    @GetMapping("/domains/foreigndomains/{foreignAttribute}")       // /현재 도메인/외부 도메인/외부 도메인의 속성
    public ResponseEntity<List<ResponseDomain>> getUserOrders(@PathVariable("foreignAttribute") String foreignAttribute) {

        /* 설명. 외부 도메인의 속성값을 이용하여 이에 해당하는 현 도메인 정보들을 DTO 리스트로 저장 */
        List<DomainDTO> domainDTOList = domainService.getForeignDomainDomains(foreignAttribute);

        /* 설명. 저장한 정보들을 ResponseDomain(현 도메인) 리스트로 반환 */
        List<ResponseDomain> returnValue = domainDTOResponseDomain(domainDTOList);

        /* 설명. 왜 ResponseDomain으로 따로 하는지?
        *       DomainDTO에는 List<ResponseForeignDomain>(=외부 도메인의 정보)가 포함되어 있기에,
        *       해당 정보가 없는 ResponseDomain으로 전환하여 전달
        * */

        return ResponseEntity.status(HttpStatus.OK).body(returnValue);
    }

    private List<ResponseDomain> domainDTOResponseDomain(List<DomainDTO> domainDTOList) {
        List<ResponseDomain> responseList = new ArrayList<>();

        for (DomainDTO domainDTO : domainDTOList) {
            ResponseDomain responseDomain = new ResponseDomain();

            /* 설명. DTO로 저장되어있는 현 도메인의 값을 ResponseDomain에 옮겨담기 */
            responseDomain.setDomainId(domainDTO.getDomainId());
            responseDomain.setStringAttribute(domainDTO.getStringAttribute());
            responseDomain.setLocalDateTimeAttribute(domainDTO.getLocalDateTimeAttribute());

            responseList.add(responseDomain);
        }

        return responseList;
    }
}
