package edu.hillel.hw6.phoneapp.model.impl;


import edu.hillel.hw6.phoneapp.exception.AbonentValidationException;
import edu.hillel.hw6.phoneapp.model.Abonent;
import edu.hillel.hw6.phoneapp.model.AbonentArray;

public class AbonentArrayImpl implements AbonentArray {


    private int size;
    private int freeSize;
    private  Abonent abonents[];
    private Class type;



    public AbonentArrayImpl(int size){
        this(size, Abonent.class);
    }
    public AbonentArrayImpl (int size, Class clazz) {
        if (size > 0) {
            this.size = size;
        } else {
            this.abonents = new Abonent[0];
            IllegalArgumentException e = new IllegalArgumentException("Argument can not be less than or equal to 0.");
            throw e;
        }

        if (clazz == null || !Abonent.class.isAssignableFrom(clazz)) {
            IllegalArgumentException e = new IllegalArgumentException("The argument can not be null or not of type Abonent.");
            throw e;
        }
        this.abonents = new Abonent[size];
        this.freeSize = size;
        this.type = clazz;
    }

    public int getSize() {

        return size;
    }


    public int getFreeSize() {
        return freeSize;
    }


    public Class getArrayType() {
        return type;
    }


    public Abonent getAbonentAtArr(int index) {
        if (checkIndex(index)) return abonents[index];
        return null;
    }


    public boolean insertAbonentToArr(Abonent abonent, int index) {
        checkIndex(index);
        if (abonent != null) {
            if (type.isInstance(abonent)) {
                if (abonents[index] == null) {
                    abonents[index] = abonent;
                    freeSize--;

                    return true;
                }
            } else {
                IllegalArgumentException e = new IllegalArgumentException("the type of the value being passed is incompatible" +
                        " with the type stored by the array.");
                throw e;
            }
        } else {
            AbonentValidationException e = new AbonentValidationException("AbonentArray.insertAbonentToArr", abonent);
            throw e;
        }

        return false;
    }


    public Abonent removeAbonentFromArr(int index) {
        checkIndex(index);
        if (abonents[index] != null) {
            Abonent temp = abonents[index];
            abonents[index] = null;
            return temp;
        } else {
            System.err.println("Can't remove from empty slot " + index);
            return null;
        }
    }


    public boolean checkIndex(int index) {
        if (index >= 0 && index < size) {
            return true;
        } else {
            IndexOutOfBoundsException e = new IndexOutOfBoundsException("Index must be from 0 to " + size + "; current index = " + index);
            throw e;
        }
    }
    public Abonent[] getAbonents() {
        return abonents;
    }
}
