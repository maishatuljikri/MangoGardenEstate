package com.example.mangogardenestate.maisha2330841.nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class DailyWorkStatus implements Serializable {

    private String workTitle;
    private LocalDate workDate;
    private String assignedTask;
    private String workDetails;
    private String workStatus;

    public DailyWorkStatus(String workTitle,
                           LocalDate workDate,
                           String assignedTask,
                           String workDetails,
                           String workStatus) {

        this.workTitle = workTitle;
        this.workDate = workDate;
        this.assignedTask = assignedTask;
        this.workDetails = workDetails;
        this.workStatus = workStatus;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public LocalDate getWorkDate() {
        return workDate;
    }

    public String getAssignedTask() {
        return assignedTask;
    }

    public String getWorkDetails() {
        return workDetails;
    }

    public String getWorkStatus() {
        return workStatus;
    }
}
