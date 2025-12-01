package com.carlosrw.casopractico2;

/**
 *
 * @author carlos
 */
import java.util.Stack;

public class CustomTree {

    private TreeNode _root;

    public CustomTree() {
        _root = null;
    }

    public void insert(double tf, String word) {
        _root = insert(_root, tf, word);
    }

    private TreeNode insert(TreeNode node, double tf, String word) {

        // Implementación recursiva de inserción en Árbol Binario de Búsqueda (BST) basado en TF.

        if (node == null) {
            // Caso base: si el nodo es nulo, creamos el nuevo nodo y le agregamos la palabra.
            TreeNode newNode = new TreeNode(tf);
            newNode.addWord(word); 
            return newNode;
        }

        if (tf < node.getTf()) {
            // Si el nuevo TF es menor, insertamos en el subárbol izquierdo.
            node.setLeft(insert(node.getLeft(), tf, word));
        } else if (tf > node.getTf()) {
            // Si el nuevo TF es mayor, insertamos en el subárbol derecho.
            node.setRight(insert(node.getRight(), tf, word));
        } else {
            // Si el TF es igual, agregamos la palabra a la pila del nodo actual.
            node.addWord(word);
        }

        return node;
    }

    public String getInOrderTraversal() {
        // Este método realiza el recorrido In Order (Izquierda -> Raíz -> Derecha)
        // para obtener los TFs en orden ascendente, tal como requiere el archivo tree.txt.
        return getInOrderTraversal(_root);
    }

    private String getInOrderTraversal(TreeNode root) {
        // Recorrido In Order (no recursivo)
        var builder = new StringBuilder();
        var stack = new Stack<TreeNode>();
        var node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            // Formato de salida para tree.txt
            builder.append(node.getTf() + "\n ↳ " + node.getWords() + "\n\n");
            node = node.getRight();
        }
        return builder.toString();
    }
}