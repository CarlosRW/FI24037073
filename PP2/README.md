# Práctica Programada 2 - Revert

- **Nombre:** Carlos Eduardo Ramírez Wong 
- **Carné:** FI24037073

- **Profesor:** Luis Andrés Rojas Matey

## Entorno y Herramientas
| IDE Utilizado | Versión de Java |
|---|---|
| Apache NetBeans 22 | Java SE 21 & JDK 21 (LTS) |

## Implementación del Programa Revert
### Descripción
El programa Revert cumple con las especificaciones funcionales al leer el archivo **input.txt** caracter por caracter, almacenar cada uno en una estructura de Pila (Stack), y luego vaciar la pila mediante la operación pop() para escribir los caracteres en orden inverso en el archivo **output.txt**.

## Respuestas a Preguntas
### 1. ¿Cree que exista otra forma de efectuar la inversión del contenido de un archivo sin necesitad de usar una pila? Si sí, indique cómo (sin necesidad de código).
Sí, creo que el uso de una Lista (ArrayList) y recorrido Inverso es una forma de invertir el contenido de un archivo sin usar una pila.

- Leer todo el contenido del archivo (caracter por caracter o línea por línea) y almacenarlo en un ArrayList.
- Una vez que la lista está llena, recorrerla desde el último elemento hasta el primero.
- Y por último escribir cada elemento de la lista en este orden inverso al archivo de salida.

### 2. ¿En qué ejemplo de la vida real (no informático) se puede ver reflejado el uso de una pila?
Un ejemplo es el método de reabastecimiento de ciertos productos en un supermercado, como la leche, el yogur o los jugos, cuando se utiliza un estante o dispensador que obliga a los clientes a tomar el primer producto.

- Poner Productos (Push): El empleado de la tienda, para garantizar que se venda el producto más antiguo primero (para maximizar la frescura y evitar que los productos caduquen), siempre coloca el producto nuevo por la parte trasera del estante o dispensador.

- Tomar Productos (Pop): El cliente, por naturaleza o diseño del estante, siempre toma el producto que está en la parte frontal del dispensador.

Esto ilustra el principio LIFO (Last-In, First-Out): En este contexto, el "último en entrar" se refiere al extremo por donde el empleado repone, y el "primero en salir" es el extremo por donde el cliente toma.

## Ejemplo de Uso y Resultado
### Configuración del input.txt
Asumimos que el archivo **input.txt** contiene los datos de prueba requeridos por el enunciado
```bash
.olpmeje nu
se otsE
```

### Ejemplo
Corremos el archivo del directorio
```bash
# Ejecutar la clase principal
java com.carlosrw.revert.Revert
```

### Resultado
Esta es la salida que se mostrará en la consola si el programa se ejecuta correctamente y encuentra/escribe los archivos:
```bash
--- Programa Revert --- 

 Leyendo y apilando desde: input.txt
 Desapilando y escribiendo a: output.txt
 Archivo invertido con éxito. Verifique output.txt
```

### Contenido del output.txt
Una vez finalizada la ejecución, el archivo output.txt contendrá el contenido invertido:
```bash
Esto es
un ejemplo.
```

## Referencias
- **Documentación de `java.util.Stack`:** [https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Stack.html]

- **Oregoom Java `try-with-resources`:** [https://oregoom.com/java/try-with-resources/]

- **Repositorio de larmcr:** [https://github.com/larmcr/2025-III-SC-304]



