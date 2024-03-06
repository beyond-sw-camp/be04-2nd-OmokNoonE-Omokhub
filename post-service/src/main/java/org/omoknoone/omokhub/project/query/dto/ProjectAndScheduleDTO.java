package org.omoknoone.omokhub.project.query.dto;

import java.util.List;

public class ProjectAndScheduleDTO {
    private int projectId;
    private String title;
    private String status;
    private List<ScheduleDTO> list;

    public ProjectAndScheduleDTO() {
    }

    public ProjectAndScheduleDTO(int projectId, String title, String status, List<ScheduleDTO> list) {
        this.projectId = projectId;
        this.title = title;
        this.status = status;
        this.list = list;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ScheduleDTO> getList() {
        return list;
    }

    public void setList(List<ScheduleDTO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ProjectAndScheduleDTO{" +
                "projectId=" + projectId +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", list=" + list +
                '}';
    }
}
