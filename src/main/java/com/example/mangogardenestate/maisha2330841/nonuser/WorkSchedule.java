package com.example.mangogardenestate.maisha2330841.nonuser;

public class WorkSchedule {

    private final String taskId;
    private final String taskName;
    private final String workDate;
    private final String startTime;
    private final String endTime;
    private final String section;
    private final String status;

    public WorkSchedule(String taskId,
                        String taskName,
                        String workDate,
                        String startTime,
                        String endTime,
                        String section,
                        String status) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.workDate = workDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.section = section;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWorkDate() {
        return workDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getSection() {
        return section;
    }

    public String getStatus() {
        return status;
    }
}