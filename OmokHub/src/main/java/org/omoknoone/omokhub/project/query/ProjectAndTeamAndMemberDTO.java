package org.omoknoone.omokhub.project.query;

import org.omoknoone.omokhub.projectmember.ProjectMemberDTO;
import org.omoknoone.omokhub.projectmember.ProjectTeamDTO;

import java.time.LocalTime;
import java.util.List;

public class ProjectAndTeamAndMemberDTO {

    private int projectId;
    private String title;
    private LocalTime startDate;
    private LocalTime endDate;
    private String status;
    private int projectTeamId;
    private int projectMemberId;
    private boolean isPublic;
    private LocalTime lastModifiedDate;

    /* 설명. ProjectTeamDTO           private String teamName; */
    private List<ProjectTeamDTO> projectTeams;
    /* 설명. ProjectMemberDTO         private String memberId; */
    private List<ProjectMemberDTO> projectMembers;

    public ProjectAndTeamAndMemberDTO() {
    }

    public ProjectAndTeamAndMemberDTO(int projectId, String title, LocalTime startDate, LocalTime endDate, LocalTime lastModifiedDate, String status, int projectTeamId, int projectMemberId, boolean isPublic, List<ProjectTeamDTO> projectTeams, List<ProjectMemberDTO> projectMembers) {
        this.projectId = projectId;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.projectTeamId = projectTeamId;
        this.projectMemberId = projectMemberId;
        this.isPublic = isPublic;
        this.projectTeams = projectTeams;
        this.projectMembers = projectMembers;
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

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public LocalTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalTime endDate) {
        this.endDate = endDate;
    }

    public LocalTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    public int getProjectMemberId() {
        return projectMemberId;
    }

    public void setProjectMemberId(int projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public List<ProjectTeamDTO> getProjectTeams() {
        return projectTeams;
    }

    public void setProjectTeams(List<ProjectTeamDTO> projectTeams) {
        this.projectTeams = projectTeams;
    }

    public List<ProjectMemberDTO> getProjectMembers() {
        return projectMembers;
    }

    public void setProjectMembers(List<ProjectMemberDTO> projectMembers) {
        this.projectMembers = projectMembers;
    }

    @Override
    public String toString() {
        return "ProjectAndTeamAndMemberDTO{" +
                "projectId=" + projectId +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", status='" + status + '\'' +
                ", projectTeamId=" + projectTeamId +
                ", projectMemberId=" + projectMemberId +
                ", isPublic=" + isPublic +
                ", projectTeams=" + projectTeams +
                ", projectMembers=" + projectMembers +
                '}';
    }
}
