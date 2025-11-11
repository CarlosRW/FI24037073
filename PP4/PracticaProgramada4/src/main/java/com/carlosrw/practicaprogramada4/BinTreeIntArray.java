package com.carlosrw.practicaprogramada4;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author carlos ramírez wong
 */
public class BinTreeIntArray {

    private Integer[] _tree;

    public BinTreeIntArray(int size) {
        _tree = new Integer[size];
    }

    public Integer[] getTree() {
        return _tree;
    }

    /**
     * Agrega un nodo de tipo entero de forma ordenada (ABB). La lógica busca la
     * posición del hijo (2i+1 o 2i+2) y si está nula, inserta el valor entero.
     */
    public void insert(int value) {

        // Actualizar
        int currentIndex = 0;

        if (_tree.length == 0) {
            // El arreglo no tiene capacidad, no se puede insertar.
        } else if (_tree[0] == null) {
            // Caso base: Insertar en la raíz (índice 0) si está vacía.
            _tree[0] = value;
        } else {
            // Lógica de recorrido para nodos subsiguientes
            while (currentIndex < _tree.length && _tree[currentIndex] != null) {

                if (value < _tree[currentIndex]) {
                    // Intenta ir a la izquierda (left = 2i + 1)
                    int nextIndex = 2 * currentIndex + 1;

                    if (nextIndex >= _tree.length) {
                        break; // No hay espacio.
                    }

                    if (_tree[nextIndex] == null) {
                        _tree[nextIndex] = value; // Insertar y salir.
                        break;
                    }
                    currentIndex = nextIndex; // Continuar la búsqueda a la izquierda

                } else if (value > _tree[currentIndex]) {
                    // Intenta ir a la derecha (right = 2i + 2)
                    int nextIndex = 2 * currentIndex + 2;

                    if (nextIndex >= _tree.length) {
                        break; // No hay espacio.
                    }

                    if (_tree[nextIndex] == null) {
                        _tree[nextIndex] = value; // Insertar y salir.
                        break;
                    }
                    currentIndex = nextIndex; // Continuar la búsqueda a la derecha

                } else {
                    // El valor ya existe, detener la inserción.
                    break;
                }
            }
        }
        System.out.println(" ↳ insert: " + value + " → " + Arrays.toString(_tree));
    }

    // Recorre e imprime los nodos del árbol binario en inorden (Left -> Root -> Right).
    public void inOrderTraversal() { // left -> root -> right
        System.out.print(" ↳ inOrderTraversal → ");
        var stack = new Stack<Integer>();
        var index = 0;
        while (!stack.isEmpty() || (index < _tree.length && _tree[index] != null)) {
            while (index < _tree.length && _tree[index] != null) {
                stack.push(index);
                index = 2 * index + 1;
            }
            index = stack.pop();
            System.out.print(_tree[index] + " ");
            index = 2 * index + 2;
        }
        System.out.println();
    }

    // Recorre e imprime los nodos del árbol binario en preorden (Left -> Root -> Right).
    public void preOrderTraversal() { // root -> left -> right
        System.out.print(" ↳ preOrderTraversal → ");

        // Actualizar
        if (_tree.length == 0 || _tree[0] == null) {
            System.out.println();
            return;
        }

        var stack = new Stack<Integer>();
        stack.push(0); // Empezamos en la raíz (índice 0)

        while (!stack.isEmpty()) {
            int currentIndex = stack.pop();

            // Visitar la Raíz
            if (_tree[currentIndex] != null) {
                System.out.print(_tree[currentIndex] + " ");

                // Apilar el hijo Derecho (se apila primero para que se procese DESPUÉS por LIFO)
                int rightIndex = 2 * currentIndex + 2;
                if (rightIndex < _tree.length && _tree[rightIndex] != null) {
                    stack.push(rightIndex);
                }

                // Apilar el hijo Izquierdo (se apila segundo para que se procese PRIMERO)
                int leftIndex = 2 * currentIndex + 1;
                if (leftIndex < _tree.length && _tree[leftIndex] != null) {
                    stack.push(leftIndex);
                }
            }
        }

        System.out.println();
    }

    public void postOrderTraversal() { // left -> right -> root
        System.out.print(" ↳ postOrderTraversal → ");

        // Actualizar
        if (_tree.length == 0 || _tree[0] == null) {
            System.out.println();
            return;
        }

        // Pila 1: Para la secuencia Root -> Right -> Left (orden auxiliar)
        var s1 = new Stack<Integer>();
        // Pila 2: Para almacenar la secuencia final (Left -> Right -> Root)
        var s2 = new Stack<Integer>();

        s1.push(0); // Empezamos en la raíz (índice 0)

        while (!s1.isEmpty()) {
            int currentIndex = s1.pop();
            s2.push(currentIndex); // El orden de salida de s2 será Left -> Right -> Root

            // Apilar Izquierda
            int leftIndex = 2 * currentIndex + 1;
            if (leftIndex < _tree.length && _tree[leftIndex] != null) {
                s1.push(leftIndex);
            }

            // Apilar Derecha
            int rightIndex = 2 * currentIndex + 2;
            if (rightIndex < _tree.length && _tree[rightIndex] != null) {
                s1.push(rightIndex);
            }
        }

        // Imprimir la secuencia de s2 (que ya está en Posorden)
        while (!s2.isEmpty()) {
            int index = s2.pop();
            if (_tree[index] != null) {
                System.out.print(_tree[index] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        var tree = new BinTreeIntArray(7);
        System.out.println("Empty array → " + Arrays.toString(tree.getTree()));
        tree.insert(4);
        tree.insert(6);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        System.out.println("\nFull array → " + Arrays.toString(tree.getTree()));
        tree.inOrderTraversal(); // 1 2 3 4 5 6 7
        tree.preOrderTraversal(); // 4 2 1 3 6 5 7
        tree.postOrderTraversal(); // 1 3 2 5 7 6 4
    }
}
