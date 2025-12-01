package com.carlosrw.casopractico2;

/**
 *
 * @author carlos
 */
import java.util.Arrays;

public class CustomGraph {

    private char[] _chars;
    private int[][] _matrix;

    public CustomGraph(char[] chars) {
        _chars = chars;
        // La matriz se inicializa en 0s automáticamente.
        _matrix = new int[chars.length][chars.length];
    }

    public void addDirectedEdge(char source, char target) {
        addEdge(source, target);
    }

    private void addEdge(char source, char target) {
        int src = Arrays.binarySearch(_chars, source);
        int tgt = Arrays.binarySearch(_chars, target);

        // Se incrementa el contador de adyacencia en la matriz.
        // Las filas (src) son el carácter anterior y las columnas (tgt) son el carácter siguiente
        if (src >= 0 && tgt >= 0) {
            _matrix[src][tgt]++;
        }
    }

    public String getMatrix() {
        var builder = new StringBuilder(" ");
        // Encabezados de columna
        for (int index = 0; index < _chars.length; index++) {
            builder.append(" , " + _chars[index]);
        }
        // Filas de la matriz
        for (int row = 0; row < _chars.length; row++) {
            builder.append("\n");
            // Encabezado de fila
            builder.append(_chars[row]);
            for (int col = 0; col < _chars.length; col++) {
                builder.append(" , " + _matrix[row][col]);
            }
        }
        builder.append("\n");
        return builder.toString();
    }
}
