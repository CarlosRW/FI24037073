package com.carlosrw.casopractico2;

/**
 *
 * @author carlos
 */
public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);

        // Push (Apilar): agregar al inicio de la lista (_head).
        
        // El nuevo nodo apunta al actual tope (head).
        node.setNext(_head); 
        // El nuevo nodo se convierte en el tope (head).
        _head = node;
    }

    public String pop() {
        String word = null;

        // Pop (Desapilar): remover el nodo del inicio de la lista (_head).
        
        if (_head == null) {
            // Si la pila está vacía, retorna null.
            return word; 
        }
        
        // Almacena la palabra del nodo a desapilar.
        word = _head.getWord();
        
        // Actualiza la cabeza al siguiente nodo.
        _head = _head.getNext();
        
        return word;
    }

    public int size() {
        var length = 0;

        // Retorna el tamaño recorriendo la lista.
        
        StackNode current = _head;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        
        return length;
    }

    public String getWords() {
        // Este método consume la pila (utiliza pop) para obtener las palabras
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}