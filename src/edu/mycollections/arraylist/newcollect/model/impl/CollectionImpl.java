package edu.mycollections.hw8.newcollect.model.impl;

import edu.mycollections.hw8.newcollect.model.MyCollection;

import java.util.Arrays;
import java.util.Iterator;

public class CollectionImpl implements MyCollection {

    private final String[] DEFAULT_ELEMENTS = {};
    private String values[];



    public CollectionImpl() {
        this(0);
    }



    public CollectionImpl(int size) {
        if (size > 0) {
            this.values = new String[size];
        } else if (size == 0) {
            this.values = DEFAULT_ELEMENTS;
        } else {
            IllegalArgumentException e = new IllegalArgumentException("Invalid argument! Collection size can not" +
                    " be less then 0!");
            throw e;

        }


    }

    public void checkRange(int index){
        if(index < 0 || index > values.length){
            throw  new IndexOutOfBoundsException("Index must be from 0 to " + values.length + "; current index = " + index);
        }
    }
    @Override
    public boolean add(String str) {
        String [] tmp = values;
        values = new String[tmp.length + 1];
        System.arraycopy(tmp, 0, values, 0, tmp.length);
        values[values.length - 1] = str;
        return true;

    }

    @Override
    public boolean add(int index, String str) {
        checkRange(index);
        String [] tmp = values;
        values = new String[tmp.length + 1];
        System.arraycopy(tmp, 0, values, 0, index);
        values[index] = str;
        int tmpIndex = tmp.length - index;
        System.arraycopy(tmp, index, values, index + 1, tmpIndex );
        return true;
    }

    @Override
    public boolean delete(String str) {
       for (int index = 0; index < values.length; index++){
           if (str.equals(values[index])){
               String [] tmp = values;
               values = new String[tmp.length - 1];
               System.arraycopy(tmp, 0, values, 0, index);
               int tmpIndex = tmp.length - index - 1;
               System.arraycopy(tmp, index + 1, values, index, tmpIndex);
           }
       }
        return true;
    }

    @Override
    public String get(int index) {
        return values[index];
    }

    @Override
    public boolean contains(String str) {

        for (int i = 0; i < values.length; i++) {
            if(str.equals(values[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equal(String[] strArr) {
        return Arrays.hashCode(values) == Arrays.hashCode(strArr);
    }

    @Override
    public void clear() {
        values = DEFAULT_ELEMENTS;
    }

    @Override
    public int size() {
        return values.length;
    }


    public Iterator iterator() {
        return new ArrayIterator(values);
    }

    public String[] getValues() {
        return values;
    }


}
