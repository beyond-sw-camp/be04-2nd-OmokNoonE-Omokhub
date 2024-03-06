package org.omoknoone.omokhub.project.query.dto;

import java.time.LocalTime;

public class ProjectDTO {

    private int projectId;
    private String title;
    private LocalTime startDate;
    private LocalTime endDate;
    private LocalTime lastModifiedDate;
    private String status;
    private int projectTeamId;
    private int projectMemberId;
    private boolean isPublic;

    public ProjectDTO() {
    }
}
