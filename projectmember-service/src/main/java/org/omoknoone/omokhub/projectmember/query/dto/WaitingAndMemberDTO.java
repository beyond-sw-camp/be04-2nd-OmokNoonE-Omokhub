package org.omoknoone.omokhub.projectmember.query.dto;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class WaitingAndMemberDTO {

    private String category;
    private LocalDateTime joinDate;
    private List<ResponseMemberDTO> waitingMember;
    private int joinWaitingMemberId;

    public WaitingAndMemberDTO() {
    }

    public WaitingAndMemberDTO(String category, LocalDateTime joinDate, List<ResponseMemberDTO> waitingMember, int joinWaitingMemberId) {
        this.category = category;
        this.joinDate = joinDate;
        this.waitingMember = waitingMember;
        this.joinWaitingMemberId = joinWaitingMemberId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    public List<ResponseMemberDTO> getWaitingMember() {
        return waitingMember;
    }

    public void setWaitingMember(List<ResponseMemberDTO> waitingMember) {
        this.waitingMember = waitingMember;
    }

    public int getJoinWaitingMemberId() {
        return joinWaitingMemberId;
    }

    public void setJoinWaitingMemberId(int joinWaitingMemberId) {
        this.joinWaitingMemberId = joinWaitingMemberId;
    }

    @Override
    public String toString() {
        return "WaitingAndMemberDTO{" +
                "category='" + category + '\'' +
                ", joinDate=" + joinDate +
                ", waitingMember=" + waitingMember +
                ", joinWaitingMemberId=" + joinWaitingMemberId +
                '}';
    }
}
