package edu.mycollections.hw9.model;

import java.util.Collection;

public interface CustomCollection  {

    boolean add(String str);

    boolean addAll(String[] strAll);

    boolean addAll(Collection strColl);

    boolean delete(int index);

    boolean delete(String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare (Collection coll);


}
