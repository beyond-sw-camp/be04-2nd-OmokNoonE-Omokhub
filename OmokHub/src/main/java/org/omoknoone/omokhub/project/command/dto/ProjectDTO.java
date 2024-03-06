package org.omoknoone.omokhub.project.command.dto;

import java.time.LocalDateTime;

public class ProjectDTO {
        private int projectId;
        private String title;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private LocalDateTime lastModifiedDate;
        private String status;
        private int projectTeamId;
        private int projectMemberId;
        private boolean isPublic;

        public ProjectDTO() {
        }

        public ProjectDTO(int projectId, String title, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime lastModifiedDate, String status, int projectTeamId, int projectMemberId, boolean isPublic) {
            this.projectId = projectId;
            this.title = title;
            this.startDate = startDate;
            this.endDate = endDate;
            this.lastModifiedDate = lastModifiedDate;
            this.status = status;
            this.projectTeamId = projectTeamId;
            this.projectMemberId = projectMemberId;
            this.isPublic = isPublic;
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

        public LocalDateTime getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
        }

        public LocalDateTime getEndDate() {
            return endDate;
        }

        public void setEndDate(LocalDateTime endDate) {
            this.endDate = endDate;
        }

        public LocalDateTime getLastModifiedDate() {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
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

        public boolean getIsPublic() {
            return isPublic;
        }

        public void setIsPublic(boolean isPublic) {
            this.isPublic = isPublic;
        }

        @Override
        public String toString() {
            return "Project{" +
                    "projectId=" + projectId +
                    ", title='" + title + '\'' +
                    ", startDate=" + startDate +
                    ", endDate=" + endDate +
                    ", lastModifiedDate=" + lastModifiedDate +
                    ", status='" + status + '\'' +
                    ", projectTeamId=" + projectTeamId +
                    ", projectMemberId=" + projectMemberId +
                    ", isPublic=" + isPublic +
                    '}';
        }
    }
