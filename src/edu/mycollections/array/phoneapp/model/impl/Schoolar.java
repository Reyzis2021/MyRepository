package edu.mycollections.array.phoneapp.model.impl;

public class Schoolar extends AbstractAbonent{

    protected int numOfSchool;


    public Schoolar(int id, String name, String surname, String address,
                    String telNum, String numOfBankCard, double debit,
                    double credit, int cityCallTime, int internCallTime,
                    int internetTraffic, int numOfSchool) {
        super(id, name, surname, address, telNum, numOfBankCard, debit, credit, cityCallTime, internCallTime, internetTraffic);

        this.numOfSchool = numOfSchool;
    }

    public int getNumOfSchool() {
        return numOfSchool;
    }

    public void setNumOfSchool(int numOfSchool) {
        this.numOfSchool = numOfSchool;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numOfSchool=" + numOfSchool +
                '}';
    }
}
