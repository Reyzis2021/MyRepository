package edu.mycollections.hw8.newcollect.tests;


import edu.mycollections.hw8.newcollect.model.impl.CollectionImpl;

public class CollectionRun {

    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl();

        collection.add("Kostya");
        collection.add("Annie");
        collection.add("Oleg");
        collection.add("Tannya");
        collection.add(1,"Igor");
        collection.add(0,"Sasha");
        System.out.println(collection.size());
        collection.delete("Tannya");
        collection.delete("Oleg");
        System.out.println(collection.size());

        CollectionImpl col = new CollectionImpl();
        col.add("Sasha");
        col.add("Kostya");
        col.add("Igor");
        col.add("Annie");



        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(collection.equal(col.getValues()));

        for(String s : collection){
            System.out.println(s);

        }

        System.out.println(collection.contains("Igor"));
        System.out.println(collection.contains("Mary"));

        System.out.println("-------------------------");
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));

        collection.clear();

        System.out.println("--------------------------");
        System.out.println(collection.size());




    }
}
