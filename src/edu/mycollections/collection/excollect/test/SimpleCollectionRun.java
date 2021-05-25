package edu.mycollections.hw7.excollect.test;

import edu.mycollections.hw7.excollect.model.impl.SimpleCollectionImpl;

public class SimpleCollectionRun {
    public static void main(String[] args) {
        SimpleCollectionImpl<String> simpleCollection = new SimpleCollectionImpl<>();
        simpleCollection.add("Kostya");
        simpleCollection.add("Any");
        simpleCollection.add("Vanya");
        simpleCollection.add("Boris");


        System.out.println(simpleCollection.get(1));
        System.out.println(simpleCollection.getSize());
        simpleCollection.update(1,"Jenya");
        System.out.println(simpleCollection.get(1));
        System.out.println(simpleCollection.get(0));
        System.out.println(simpleCollection.get(2));
        System.out.println(simpleCollection.get(3));

        simpleCollection.remove("Jenya");
        simpleCollection.remove("Boris");
        System.out.println(simpleCollection.get(0));
        System.out.println(simpleCollection.get(1));
        System.out.println(simpleCollection.getSize());
        simpleCollection.add(1,"Wendy");
        System.out.println(simpleCollection.getSize());
        System.out.println(simpleCollection.get(0));
        System.out.println(simpleCollection.get(1));
        System.out.println(simpleCollection.get(2));






    }
}
