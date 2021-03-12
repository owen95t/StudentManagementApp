package model;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;

public class AssignmentList extends AbstractList implements Serializable {

    private ArrayList<AssignmentAbstract> aList;

    public AssignmentList() {

    }

    public void addAssignment(AssignmentAbstract a) {
        /*TODO: add check to see if assignment already exists.
            Validate by comparing name and due date (helper method)
            else, throw AssignmentAlreadyExists Exception
         */
        aList.add(a);
    }

    public void removeAssignment(AssignmentAbstract a) {
        /*
        TODO: check to see if assignment is available for removal
         */
        aList.remove(a);
    }

    public boolean doesAssignmentExist(AssignmentAbstract a) {
        boolean bool = false;
        if (aList.contains(a)) {
            bool = true;
        }
        return bool;
    }

    public void getList(){
        if (aList.isEmpty()) {
            System.out.println("List is empty");
        }

        for (AssignmentAbstract a : aList) {
            System.out.println();
        }
    }

    @Override
    public int size() {
        return aList.size();
    }

    @Override
    public Object get(int index) {

        return null;
    }

}
