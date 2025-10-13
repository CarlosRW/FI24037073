
package com.carlosrw.revert;

/**
 *
 * @author carlos ramirez
 */
import java.util.ArrayList;

public class MyStackString implements MyStackInterface<String>{

	private ArrayList<String> myList = new ArrayList<String>();

	public void push(String item) {
		myList.add(item);
	}

	public String pop() {
		if (myList.isEmpty()) {
			return null; // Retorna null si la pila está vacía
		}
		return myList.removeLast();
	}

	public String peek() {
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