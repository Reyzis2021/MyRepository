package edu.mycollections.array.phoneapp.model.impl;

import edu.mycollections.array.phoneapp.model.impl.AbstractAbonent;

public class Student extends AbstractAbonent {

    protected String faculty;
    protected Integer course;
    protected String group;

    public Student(int id, String name, String surname, String address,
                   String telNum, String numOfBankCard, double debit, double credit,
                   int cityCallTime, int internCallTime, int internetTraffic, String faculty,
                   Integer course, String group) {
        super(id, name, surname, address, telNum, numOfBankCard, debit, credit, cityCallTime, internCallTime, internetTraffic);
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() +
                "faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
