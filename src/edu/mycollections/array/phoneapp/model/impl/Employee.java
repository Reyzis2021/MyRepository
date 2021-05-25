package edu.mycollections.array.phoneapp.model.impl;

public class Employee extends AbstractAbonent{

    protected String profession;
    protected int departmentId;

    public Employee(int id, String name, String surname, String address, String telNum,
                    String numOfBankCard, double debit, double credit, int cityCallTime,
                    int internCallTime, int internetTraffic,
                    String profession, int departmentId) {
        super(id, name, surname, address, telNum, numOfBankCard, debit, credit,
                cityCallTime, internCallTime, internetTraffic);

        this.profession = profession;
        this.departmentId = departmentId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "profession='" + profession + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
