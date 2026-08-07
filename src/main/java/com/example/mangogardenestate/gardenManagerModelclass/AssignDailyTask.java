package com.example.mangogardenestate.gardenManagerModelclass;

import java.io.Serializable;

public class AssignDailyTask implements Serializable {

    private String taskId;
    private String workerId;
    private String workerName;
    private String taskName;
    private String workDate;
    private String taskDetails;

    public AssignDailyTask() {
    }

    public AssignDailyTask(String taskId,
                           String workerId,
                           String workerName,
                           String taskName,
                           String workDate,
                           String taskDetails) {

        this.taskId = taskId;
        this.workerId = workerId;
        this.workerName = workerName;
        this.taskName = taskName;
        this.workDate = workDate;
        this.taskDetails = taskDetails;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }
}
