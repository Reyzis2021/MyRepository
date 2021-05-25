package edu.mycollections.hw8.newcollect.model.impl;

import java.util.Iterator;

public class ArrayIterator implements Iterator {

    String [] values;
    private int index = 0;


    public ArrayIterator(String [] values){
        this.values = values;
    }
    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public String next() {
        return values[index++];
    }
}
