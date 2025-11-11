# Práctica Programada 4: Árbol Binario de Búsqueda con Arreglo

## Información del Estudiante

| Curso | Estructuras de Datos |
| :--- | :--- |
| Estudiante | Carlos Eduardo Ramírez Wong |
| Carné | F124037073 |
| IDE/Editor Utilizado | Apache NetBeans 22 |
| Versión de Java | Java SE 21 & JDK 21 |

---

## Contexto y Repositorios

Esta práctica fue desarrollada como parte del curso **SC-304 Estructuras de Datos** de la Universidad Fidélitas.

| Referencia | Descripción | Enlace |
| :---: | :---: | :---: |
| **Repositorio del Curso** | Repositorio oficial del profesor con las instrucciones generales y material de referencia. | https://github.com/larmcr/2025-III-SC-304/tree/main/PP4 |
| **Mi Solución** | Repositorio que contiene mi código fuente (`PP4/BinTreeIntArray.java`) y la solución final. | https://github.com/CarlosRW/FI24037073/new/main/PP4 |

---

## Descripción de la Implementación

Esta práctica consiste en actualizar los métodos de la clase `BinTreeIntArray.java` para implementar un **Árbol Binario de Búsqueda (ABB)** utilizando un arreglo de tamaño fijo (`Integer[]`).

Todos los métodos fueron desarrollados siguiendo estrictamente las especificaciones, utilizando lógica **iterativa** (sin recursividad) y las fórmulas de indexación del arreglo para navegar entre nodos:

* **Hijo Izquierdo (Left):** $2i + 1$
* **Hijo Derecho (Right):** $2i + 2$

### Métodos Implementados:

1. **`insert(int value)`**: Inserta un valor de forma ordenada en la posición del hijo izquierdo (si es menor) o derecho (si es mayor), buscando la primera posición `null` disponible en el camino.
2. **`preOrderTraversal()`**: Recorre e imprime el árbol en el orden **Raíz $\rightarrow$ Izquierda $\rightarrow$ Derecha**, utilizando una única pila (`Stack`) para simular la recursión.
3. **`postOrderTraversal()`**: Recorre e imprime el árbol en el orden **Izquierda $\rightarrow$ Derecha $\rightarrow$ Raíz**, utilizando un método iterativo que requiere **dos pilas** auxiliares (`Stack`) para invertir el orden de visita.

---

## 🔍 Recursos y Asistencia Utilizados

### Páginas Web de Consulta

Se consultaron los siguientes recursos para validar la lógica de los algoritmos iterativos, especialmente para los recorridos de árbol con la representación en array:

* https://es.stackoverflow.com/questions/8224/herencia-m%C3%BAltiple-en-java-sin-repetir-c%C3%B3digo
