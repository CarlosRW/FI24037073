package com.carlosrw.casopractico2;

/**
 *
 * @author carlos
 */
public class CustomQueue {

    private QueueNode _head;

    public CustomQueue() {
        _head = null;
    }

    public void enqueue(int index) {
        var node = new QueueNode(index);

        if (_head == null) {
            // Si la cola está vacía, el nuevo nodo es la cabeza
            _head = node;
            return;
        }

        // Si no está vacía, se recorre la lista hasta el último nodo
        QueueNode current = _head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        
        // Se enlaza el nuevo nodo al final
        current.setNext(node);
    }

    public int dequeue() {
        var index = -1;

        // Desencolar: remover desde el inicio de la lista (_head)
        
        if (_head == null) {
            // Si la cola está vacía, retorna -1
            return index; 
        }
        
        // Almacena el valor del nodo a desencolar
        index = _head.getIndex();
        
        // Actualiza la cabeza al siguiente nodo
        _head = _head.getNext();
        
        return index;
    }

    public int getSize() {
        var size = 0;

        // Retorna el tamaño recorriendo la lista
        
        QueueNode current = _head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        
        return size;
    }

    public String getIndexes() {
        // Este método consume la cola (utiliza dequeue) para obtener los índices
        var builder = new StringBuilder();
        for (var index = dequeue(); index > -1; index = dequeue()) {
            builder.append(" " + index);
        }
        return builder.toString();
    }
}