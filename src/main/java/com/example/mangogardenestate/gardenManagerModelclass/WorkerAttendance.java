package com.example.mangogardenestate.gardenManagerModelclass;

public class WorkerAttendance {

    private String attendanceId;
    private String workerId;
    private String workerName;
    private String attendanceDate;
    private String status;

    public WorkerAttendance() {
    }

    public WorkerAttendance(String attendanceId,
                            String workerId,
                            String workerName,
                            String attendanceDate,
                            String status) {

        this.attendanceId = attendanceId;
        this.workerId = workerId;
        this.workerName = workerName;
        this.attendanceDate = attendanceDate;
        this.status = status;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
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
}
