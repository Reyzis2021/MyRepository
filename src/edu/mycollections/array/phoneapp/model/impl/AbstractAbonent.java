package edu.mycollections.array.phoneapp.model.impl;

import edu.mycollections.array.phoneapp.model.Abonent;

public abstract class AbstractAbonent implements Abonent {

    protected int id;
    protected String name;
    protected String surname;
    protected String address;
    protected String telNum;
    protected String numOfBankCard;
    protected double debit;
    protected double credit;
    protected int cityCallTime;
    protected int internCallTime;
    protected int internetTraffic;


    public AbstractAbonent(int id, String name, String surname, String address, String telNum,
                           String numOfBankCard, double debit, double credit, int cityCallTime,
                           int internCallTime, int internetTraffic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telNum = telNum;
        this.numOfBankCard = numOfBankCard;
        this.debit = debit;
        this.credit = credit;
        this.cityCallTime = cityCallTime;
        this.internCallTime = internCallTime;
        this.internetTraffic = internetTraffic;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getTelNum() {
        return telNum;
    }

    @Override
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String getNumOfBankCard() {
        return numOfBankCard;
    }

    @Override
    public void setNumOfBankCard(String numOfBankCard) {
        this.numOfBankCard = numOfBankCard;
    }

    @Override
    public double getDebit() {
        return debit;
    }

    @Override
    public void setDebit(double debit) {
        this.debit = debit;
    }

    @Override
    public double getCredit() {
        return credit;
    }

    @Override
    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public int getCityCallTime() {
        return cityCallTime;
    }

    @Override
    public void setCityCallTime(int cityCallTime) {
        this.cityCallTime = cityCallTime;
    }

    @Override
    public int getInternCallTime() {
        return internCallTime;
    }

    @Override
    public void setInternCallTime(int internCallTime) {
        this.internCallTime = internCallTime;
    }

    @Override
    public int getInternetTraffic() {
        return internetTraffic;
    }

    @Override
    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "AbstractAbonent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", telNum='" + telNum + '\'' +
                ", numOfBankCard='" + numOfBankCard + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", cityCallTime=" + cityCallTime +
                ", internCallTime=" + internCallTime +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
