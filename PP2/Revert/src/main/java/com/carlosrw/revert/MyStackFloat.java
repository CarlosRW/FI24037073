package com.carlosrw.revert;

import java.util.ArrayList;

/**
 *
 * @author carlos ramirez
 */

public class MyStackFloat implements MyStackInterface<Float> {

    private ArrayList<Float> myList = new ArrayList<Float>();

    public void push(Float item) {
        myList.add(item);
    }

    public Float pop() {
        if (myList.isEmpty()) {
            return null; // Retorna null si la pila está vacía
        }
        return myList.removeLast();
    }

    public Float peek() {
        if (myList.isEmpty()) {
            return null; // Retorna null si la pila está vacía
        }
        return myList.getLast();
    }

    public boolean empty() {
        return myList.isEmpty();
    }

    public int size() {
        return myList.size();
    }

}
