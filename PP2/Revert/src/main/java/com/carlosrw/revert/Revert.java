package com.carlosrw.revert;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author carlos ramirez
 */

/**
 * Clase principal que lee 'input.txt', invierte su contenido utilizando una
 * pila (Stack) de tipo Character, y escribe el resultado invertido en
 * 'output.txt'.
 */
public class Revert {

    private static final String INPUT_FILE_NAME = "input.txt";
    private static final String OUTPUT_FILE_NAME = "output.txt";

    public static void revertFileContent() throws IOException {

        Stack<Character> charStack = new Stack<>();

        // Lectura y Apilamiento (push)
        System.out.println(" Leyendo y apilando desde: " + INPUT_FILE_NAME);
        // try-with-resources asegura que el reader se cierre, incluso si hay excepciones
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                charStack.push(character);
            }
        }

        // Desapilamiento (pop) y Escritura
        System.out.println(" Desapilando y escribiendo a: " + OUTPUT_FILE_NAME);
        // try-with-resources asegura que el writer se cierre y los datos se guarden
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))) {
            // El bucle garantiza que pop() nunca se llame en una pila vacía
            while (!charStack.empty()) {
                char character = charStack.pop();
                writer.write(character);
            }
        }

        System.out.println(" Archivo invertido con éxito. Verifique " + OUTPUT_FILE_NAME);
    }

    public static void main(String[] args) {
        System.out.println(" --- Programa Revert --- \n");
        try {
            // Llamamos al método que realiza la operación IOException
            revertFileContent();
        } catch (IOException e) {
            // Capturamos y manejamos la excepción
            System.err.println("\n--- ERROR DE ARCHIVOS ---");
            System.err.println("Fallo al leer/escribir: " + e.getMessage());
            System.err.println("Asegurese de que el archivo " + INPUT_FILE_NAME + " exista y que tenga permisos de escritura.");
        }
    }
}
