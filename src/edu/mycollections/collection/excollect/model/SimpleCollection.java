package edu.mycollections.hw7.excollect.model;

public interface SimpleCollection <E>{

    int getSize();

    boolean add(E value);

    boolean add(int index, E value);

    boolean remove(int index);

    boolean remove(E value);

    boolean update(int index, E value);

    E get (int index);
}
