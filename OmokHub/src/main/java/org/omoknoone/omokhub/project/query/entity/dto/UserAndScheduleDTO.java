package org.omoknoone.omokhub.project.query.entity.dto;

import org.omoknoone.omokhub.user.query.UserDTO;

import java.util.List;

public class UserAndScheduleDTO {
    private String memberId;
    private String name;
    private List<ScheduleDTO> list;

    public UserAndScheduleDTO() {
    }

    public UserAndScheduleDTO(String memberId, String name, List<ScheduleDTO> list) {
        this.memberId = memberId;
        this.name = name;
        this.list = list;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScheduleDTO> getList() {
        return list;
    }

    public void setList(List<ScheduleDTO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserAndScheduleDTO{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
