package com.example.mangogardenestate.gardenManagerModelclass;


public class TreeCondition {

    private String treeId;
    private String section;
    private String condition;
    private String inspectionDate;
    private String inspector;

    public TreeCondition() {
    }

    public TreeCondition(String treeId,
                         String section,
                         String condition,
                         String inspectionDate,
                         String inspector) {

        this.treeId = treeId;
        this.section = section;
        this.condition = condition;
        this.inspectionDate = inspectionDate;
        this.inspector = inspector;
    }

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }
}