package org.omoknoone.omokhub.projectmember.command;

import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.omoknoone.omokhub.exceptions.BusinessRuleViolationException;
import org.omoknoone.omokhub.projectmember.command.aggregate.ProjectTeam;
import org.omoknoone.omokhub.projectmember.command.dto.ProjectTeamDTO;
import org.omoknoone.omokhub.projectmember.command.repository.ProjectTeamRepository;
import org.omoknoone.omokhub.projectmember.command.service.ProjectTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProjectTeamServiceTest {

    /* 필기.
     *  insert 단위 테스트에서 MockBean을 적용한 이유:
     *  @Transactional을 사용하게 되는 경우, DB에서 필드값의 PK값이 Auto-increment가 적용되어 있으면
     *  테스트 종료 후  트랜잭션이 rollback이 되더라도 Auto-increment가 실행 되는 이슈가 발생, 따라서 PK값의 자동 할당 값의 관리를
     *  위해서 해당 insert 테스트는 Mokito를 적용하여 DB로부터 완전히 격리된 환경에서 테스트를 진행함
    * */
    @MockBean   // 빈을 mocking하면 작업, 해당 인테페이스를 모킹하여 실제 데이터 베이스에 접근하지 않고 테스트 가능
    private ProjectTeamRepository projectTeamRepository;

    /* 필기.
     *  modelMapper의 경우 런타임에 리플렉션을 사용하여 객체 간의 매핑을 수행하기 때문에
     *  @MockBean 적용을 하지 않음. 만약 사용하게 되는 경우, 실제 동작을 모방할 수 없기 때문에
     *  객체 간의 자동 맵핑 기능을 수행할 수 없음. 또한 ModelMapper는 외부 시스템이나 복잡한
     *  의존성 없이 독립적으로 작동하기 때문에, 테스트에서 모킹할 필요가 없음
    * */
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProjectTeamService projectTeamService;

    @Captor    // Mockito의 ArgumentCator 클래스 인스턴스 생성 및 초기화
    private ArgumentCaptor<ProjectTeam> projectTeamCaptor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);   // @Captor 초기화
    }

    @Test
    @Order(1)
    @DisplayName("프로젝트 팀 등록 테스트")
    void registTeamTest() {

        // Given
        // 첫 번째 팀 설정
        ProjectTeamDTO projectTeamDTO = new ProjectTeamDTO();
        projectTeamDTO.setMaxMember(10);
        projectTeamDTO.setCurrentMember(1);
        projectTeamDTO.setTeamName("새롭게 만들어진 팀 1");
        projectTeamDTO.setAddedDate(LocalDate.now());
        projectTeamDTO.setActive(true);

        // 생성자를 활용하여 두 번째 팀 설정
        ProjectTeamDTO projectTeamDTO2 = new ProjectTeamDTO(
                7,
                1,
                "새롭게 만들어진 팀 2",
                LocalDate.now(),
                true
        );

        ProjectTeam projectTeam1 = modelMapper.map(projectTeamDTO, ProjectTeam.class);
        ProjectTeam projectTeam2 = modelMapper.map(projectTeamDTO2, ProjectTeam.class);

        when(projectTeamRepository.save(any(ProjectTeam.class))) // Mockito 설정: 호출에 대해서 순차적으로 반환
                .thenReturn(projectTeam1)
                .thenReturn(projectTeam2);

        // When: 첫 번째 팀
        projectTeamService.registTeam(projectTeamDTO);

        // Then: 첫 번째 팀 등록 검증
        verify(projectTeamRepository).save(projectTeamCaptor.capture());
//        ProjectTeam captured1 = projectTeamCaptor.getValue(); // 하나의 테스트만 진행 할 때
        ProjectTeam captured1 = projectTeamCaptor.getAllValues().get(0);
        assertNotNull(captured1.getProjectTeamId()); // ID가 할당되었는지 확인

        // DTO에서 설정한 팀 이름이 엔티티로 제대로 전달되었는지 확인
        assertEquals(projectTeamDTO.getTeamName(), captured1.getTeamName());
        System.out.println("프로젝트 팀이 등록되었습니다: " + captured1);


        // When: 두 번째 팀
        projectTeamService.registTeam(projectTeamDTO2);

        // Then: 두 번쨰 팀 등록 검증
        verify(projectTeamRepository, times(2)).save(projectTeamCaptor.capture());
        ProjectTeam captured2 = projectTeamCaptor.getAllValues().get(1);
        assertNotNull(captured2.getProjectTeamId()); // ID가 할당되었는지 확인
        assertEquals(projectTeamDTO2.getTeamName(), captured2.getTeamName());
        System.out.println("프로젝트 팀이 등록되었습니다: " + captured2);
    }

    @Test
    @Order(2)
    @DisplayName("잘못된 입력 값으로 프로젝트 팀 등록 시 예외 발생 테스트")
    void registerTeamWithInvalidDataTest() {
        ProjectTeamDTO invalidTeamDTO = new ProjectTeamDTO();
        invalidTeamDTO.setMaxMember(-1); // 잘못된 값 설정
        invalidTeamDTO.setCurrentMember(1);
        invalidTeamDTO.setTeamName("");
        invalidTeamDTO.setAddedDate(LocalDate.now());
        invalidTeamDTO.setActive(true);

        // 예외가 발생하는지 검증
        assertThrows(IllegalArgumentException.class, () -> {
            projectTeamService.registTeam(invalidTeamDTO);
        });
    }

    @Test
    @Order(3)
    @DisplayName("최대 멤버 수 경계값으로 프로젝트 팀 등록 테스트")
    void registerTeamWithBoundaryValueOfMaxMemberTest() {
        ProjectTeamDTO boundaryDto = new ProjectTeamDTO();
        boundaryDto.setMaxMember(5); // 경계값 설정
        boundaryDto.setCurrentMember(1);
        boundaryDto.setTeamName("경계값 테스트 팀");
        boundaryDto.setAddedDate(LocalDate.now());
        boundaryDto.setActive(true);

        ProjectTeam projectTeam = modelMapper.map(boundaryDto, ProjectTeam.class);
        when(projectTeamRepository.save(any(ProjectTeam.class))).thenReturn(projectTeam);

        projectTeamService.registTeam(boundaryDto);

        verify(projectTeamRepository).save(projectTeamCaptor.capture());
        ProjectTeam capturedProjectTeam = projectTeamCaptor.getValue();

        assertEquals(5, capturedProjectTeam.getMaxMember());
    }

    @Test
    @Order(4)
    @DisplayName("모든 필드가 정확히 매핑되고 저장되는지 검증")
    void allFieldsMappingAndSavingTest() {
        // Given
        ProjectTeamDTO dto = new ProjectTeamDTO();
        dto.setMaxMember(10);
        dto.setCurrentMember(1);
        dto.setTeamName("전체 필드 검증 팀");
        dto.setAddedDate(LocalDate.now());
        dto.setActive(true);

        ProjectTeam projectTeam = modelMapper.map(dto, ProjectTeam.class);
        when(projectTeamRepository.save(any(ProjectTeam.class))).thenReturn(projectTeam);

        // When
        projectTeamService.registTeam(dto);

        // Then
        verify(projectTeamRepository).save(projectTeamCaptor.capture());
        ProjectTeam capturedProjectTeam = projectTeamCaptor.getValue();

        assertEquals(dto.getMaxMember(), capturedProjectTeam.getMaxMember());
        assertEquals(dto.getCurrentMember(), capturedProjectTeam.getCurrentMember());
        assertEquals(dto.getTeamName(), capturedProjectTeam.getTeamName());
        assertEquals(dto.getAddedDate(), capturedProjectTeam.getAddedDate());
        assertEquals(dto.isActive(), capturedProjectTeam.isActive());
    }

    @Test
    @Order(5)
    @DisplayName("currentMember가 maxMember를 초과할 수 없는 비즈니스 규칙 검증")
    void businessRuleCurrentMemberCannotExceedMaxMemberTest() {
        ProjectTeamDTO dto = new ProjectTeamDTO();
        dto.setMaxMember(5);
        dto.setCurrentMember(6); // 비즈니스 규칙 위반
        dto.setTeamName("비즈니스 규칙 검증 팀");
        dto.setAddedDate(LocalDate.now());
        dto.setActive(true);

        // 비즈니스 규칙 위반 시 예외 발생 검증
        assertThrows(BusinessRuleViolationException.class, () -> {
            projectTeamService.registTeam(dto);
        });
    }


}