package com.example.mangogardenestate.maisha2330841.nonuser;

import java.io.Serializable;
import java.time.LocalDate;

public class LeaveRequest implements Serializable {

    private String farmerId;
    private String leaveType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status;

    public LeaveRequest(String farmerId,
                        String leaveType,
                        LocalDate startDate,
                        LocalDate endDate,
                        String reason,
                        String status) {

        this.farmerId = farmerId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.status = status;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }
}
