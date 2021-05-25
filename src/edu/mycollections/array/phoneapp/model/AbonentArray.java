package edu.mycollections.array.phoneapp.model;

import edu.mycollections.array.phoneapp.model.Abonent;

public interface AbonentArray {

    int getSize();
    int getFreeSize();
    Class getArrayType();
    Abonent getAbonentAtArr(int index);
    boolean insertAbonentToArr(Abonent abonent, int index);
    Abonent removeAbonentFromArr(int index);


}
