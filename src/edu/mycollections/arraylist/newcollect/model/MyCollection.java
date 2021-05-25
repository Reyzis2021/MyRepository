package edu.mycollections.hw8.newcollect.model;

public interface MyCollection extends Iterable<String>{

    boolean add(String o);

    boolean add(int index, String str);

    boolean delete(String o);

    String get(int index);

    boolean contains(String o);

    boolean equal(String [] strArr);

    void clear();

    int size();



}
