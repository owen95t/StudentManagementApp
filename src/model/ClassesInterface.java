package model;

import java.util.Date;

public interface ClassesInterface{
    public void setClassName(String name);

    public String getClassName();

    public void setStartDate(Date date);

    public Date getStartDate();

    public void setEndDate(Date date);

    public Date getEndDate();

    public void setProfName(String first, String last);

    public String getProfName();

    public void addAssignment(AssignmentList a);

    public void removeAssignment(AssignmentList a);
}
