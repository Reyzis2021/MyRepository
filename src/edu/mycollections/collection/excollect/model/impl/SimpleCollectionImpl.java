package edu.mycollections.hw7.excollect.model.impl;


import edu.mycollections.hw7.excollect.model.SimpleCollection;

public class SimpleCollectionImpl<E> implements SimpleCollection<E> {


    private E[] values;

    public SimpleCollectionImpl(){
        values = (E[]) new Object[0];
    }


    public void checkRange(int index){
        if(index < 0 || index > values.length){
            throw  new IndexOutOfBoundsException("Index must be from 0 to " + values.length + "; current index = " + index);
        }
    }

    @Override
    public int getSize() {
        return values.length;
    }

    @Override
    public boolean add(E value) {

        try {
            E[] tmp = values;
            values = (E[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0 , values, 0, tmp.length);
            values[values.length - 1] = value;
            return true;
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean add(int index, E value) {
        checkRange(index);
        try {
            E[] tmp = values;
            values = (E[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0, values, 0, index);
            int tmpIndex = tmp.length - index;
            values[index] = value;
            System.arraycopy(tmp, index, values, index + 1, tmpIndex );
            return true;
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean remove(int index) {
        checkRange(index);

        try {
            E[] tmp = values;
            values = (E[]) new Object[tmp.length - 1];
            System.arraycopy(tmp, 0, values, 0, index);
            int tmpIndex = tmp.length - index - 1;
            System.arraycopy(tmp, index + 1, values, index, tmpIndex);
            return true;
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        return false;

    }


    @Override
    public boolean remove(E value) {
        try {
            E[] tmp = values;
            values = (E[]) new Object[values.length - 1];
            int index = 0;

            for (int i = 0; i < tmp.length; i++) {
                if (value.equals(tmp[i])) {
                    System.arraycopy(tmp, 0, values, 0, index);
                    int tmpIndex = tmp.length - index - 1;
                    System.arraycopy(tmp, index + 1, values, index, tmpIndex);
                    return true;
                }
            }
        }
            catch(ClassCastException e){
                e.printStackTrace();
            }

        return false;

    }

    @Override
    public boolean update(int index, E value) {
        checkRange(index);
        values[index] = value;
        return true;
    }

    @Override
    public E get(int index) {
        checkRange(index);
        return values[index];
    }

}
