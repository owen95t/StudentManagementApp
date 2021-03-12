package model;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;

public class AssignmentList extends AbstractList implements Serializable {

    private ArrayList<AssignmentInterface> aList;

    public AssignmentList() {

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
