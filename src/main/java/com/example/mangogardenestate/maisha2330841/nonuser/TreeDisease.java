package com.example.mangogardenestate.maisha2330841.nonuser;

import java.time.LocalDate;

public class TreeDisease {

    private String treeId;
    private String section;
    private LocalDate reportDate;
    private String diseaseType;
    private String severity;
    private String description;

    public TreeDisease(String treeId,
                       String section,
                       LocalDate reportDate,
                       String diseaseType,
                       String severity,
                       String description) {

        this.treeId = treeId;
        this.section = section;
        this.reportDate = reportDate;
        this.diseaseType = diseaseType;
        this.severity = severity;
        this.description = description;
    }

    public String getTreeId() {
        return treeId;
    }

    public String getSection() {
        return section;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }
}