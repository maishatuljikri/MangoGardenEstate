package com.example.mangogardenestate.Modelclass3;

public class WorkerAttendance {

    private String workerId;
    private String workerName;
    private String attendanceDate;
    private String status;
    private int totalPresent;

    public WorkerAttendance() {
    }

    public WorkerAttendance(String workerId, String workerName,
                            String attendanceDate, String status,
                            int totalPresent) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.attendanceDate = attendanceDate;
        this.status = status;
        this.totalPresent = totalPresent;
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

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(int totalPresent) {
        this.totalPresent = totalPresent;
    }
}

