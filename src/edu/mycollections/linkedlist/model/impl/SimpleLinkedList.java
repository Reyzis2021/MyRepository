package edu.mycollections.hw9.model.impl;

import edu.mycollections.hw9.model.CustomCollection;
import edu.mycollections.hw9.model.DescendingIterator;

import java.util.Collection;
import java.util.Iterator;

public class SimpleLinkedList implements CustomCollection, Iterable<String>, DescendingIterator<String> {

    private Node firstElem;
    private Node lastElem;
    private int size = 0;

    public SimpleLinkedList(){

        firstElem = null;
        lastElem = null;

    }
    public boolean isEmpty(){
        return  firstElem == null;
    }


    @Override
    public boolean add(String str) {
       Node target = new Node(str);
       if(isEmpty()){
           firstElem = target;
       }
       else {
           lastElem.nextElem = target;
           target.prevElem = lastElem;
       }
       lastElem = target;
       return true;
    }

    @Override
    public boolean addAll(String[] strAll) {
        for (int i = 0; i < strAll.length; i++) {
            Node target = new Node(strAll[i]);
           if (isEmpty()){
               firstElem = target;
           }
           else {
               lastElem.nextElem = target;
               target.prevElem = lastElem;
           }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection strColl) {

        for (int i = 0; i < strColl.size(); i++) {
            Node target = new Node(get(i));
            if (isEmpty()){
                firstElem = target;
            }
            else {
                lastElem.nextElem = target;
                target.prevElem = lastElem;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        String target = get(index);
        delete(target);

        return true;
    }

    @Override
    public boolean delete(String str) {
        Node target = firstElem;

        while (!target.currentElem.equals(str)){
            target = target.nextElem;

            if(target == null){
                return false;
            }
        }
        if (target == firstElem){
            firstElem = target.nextElem;
        }
        else {
            target.prevElem.nextElem = target.nextElem;
        }

        if (target == lastElem){
            lastElem = target.prevElem;
        }
        else {
            target.nextElem.prevElem = target.prevElem;
        }
        size--;
        return true;
    }

    @Override
    public String get(int index) {
        Node target = firstElem;
        for (int i = 0; i < index ; i++) {
            target = getNextElement(target);
        }
        return target.currentElem;

    }

    @Override
    public boolean contains(String str) {
        Node target = firstElem;
        while (!target.currentElem.equals(str)){
            target = target.nextElem;
            if(target == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean clear() {

        for (int i = 1; i <= size; i++) {
            delete(i);
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }

    @Override
    public boolean compare(Collection coll) {
        return false;
    }


    public Node getNextElement(Node current){
        return current.getNextElem();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public String next() {
                return get(counter++);
            }
        };
    }

    @Override
    public Iterator<String> descendingIterator() {
        return new Iterator<String>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public String next() {
                return get(counter--);
            }
        };
    }

    private class Node{

        private String currentElem;
        private Node nextElem;
        private Node prevElem;

       private Node(String currentElem) {
            this.currentElem = currentElem;

        }

        public String getCurrentElem() {
            return currentElem;
        }

        public void setCurrentElem(String currentElem) {
            this.currentElem = currentElem;
        }

        public Node getNextElem() {
            return nextElem;
        }

        public void setNextElem(Node nextElem) {
            this.nextElem = nextElem;
        }

        public Node getPrevElem() {
            return prevElem;
        }

        public void setPrevElem(Node prevElem) {
            this.prevElem = prevElem;
        }
    }
}
