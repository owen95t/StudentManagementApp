package model;

import java.util.Date;

public abstract class ClassesAbstract {

    protected String className;
    protected Date startDate;
    protected Date endDate;
    protected String profFirstName, profLastName;
    protected AssignmentAbstract assignmentAbstract;

    public void setClassName(String name) {
        if (name.length()<=0) {
            //TODO: Throw error
            System.out.println();
        }
        this.className = name;
    }

    public String getClassName() {
        return this.className;
    }

    public void setStartDate(Date date) {

    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setEndDate(Date date) {

    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setProfName(String first, String last) {

    }

    public String getProfName() {
        return this.profFirstName + " " + this.profLastName;
    }

    public void addAssignment(AssignmentList list, AssignmentAbstract a) {

    }

    public void removeAssignment(AssignmentList list, AssignmentAbstract a) {

    }
}
