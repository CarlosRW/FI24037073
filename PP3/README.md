# Práctica Programada 3: Lista Circular Doblemente Enlazada

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
| **Repositorio del Curso** | Repositorio oficial del profesor con las instrucciones generales y material de referencia. | https://github.com/larmcr/2025-III-SC-304/tree/main/PP3 |
| **Mi Solución** | Repositorio que contiene mi código fuente (`PP3/PracticaProgramada3`) y la solución final. | https://github.com/larmcr/2025-III-SC-304/tree/main/PP3 |

---

### Páginas Web utilizadas

* GeeksForGeeks https://www.geeksforgeeks.org/doubly-linked-list/

---

## Preguntas de Evaluación

### 1. Implementación de Queue (Cola) y Stack (Pila)

**Si tuviera que implementar una estructura tipo Cola (Queue), ¿qué tipo de lista (simple, circular, doblemente enlazada o circular doblemente enlazada) utilizaría y por qué? ¿Y para una estructura tipo Pila (Stack)?**

* **Para una Cola (Queue)**:
    * Utilizaría una lista doblemente enlazada (o una circular doblemente enlazada).
    * **Razón**: Una Cola sigue el principio FIFO (First-In, First-Out), que requiere inserciones rápidas al final addLast y eliminaciones rápidas al inicio removeFirst. En las listas doblemente enlazadas, ambas operaciones se realizan en tiempo constante ($O(1)$) al tener acceso directo tanto al head como al tail.

* **Para una Pila (Stack)**:
    * Utilizaría una lista simplemente enlazada.
    * **Razón**: Una Pila sigue el principio LIFO (Last-In, First-Out), donde la inserción push y la eliminación pop ocurren en el mismo extremo, el inicio head. Una lista simplemente enlazada permite realizar addFirst y removeFirst en tiempo constante ($O(1)$), y no requiere la complejidad o el puntero prev de una lista doblemente enlazada.

### 2. Ventajas y Desventajas de una Implementación Propia

**¿Cuál cree que podría ser una ventaja y una desventaja de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones proveídas directamente por los módulos estándar de Java (como por ejemplo List)?**

* **Ventaja**:
    * **Control y Optimización Específica**: La principal ventaja es el control total sobre la implementación. Esto permite crear una estructura **optimizada y a medida** (como una lista *circular doblemente enlazada* específicamente) que cumple exactamente con los requisitos funcionales, evitando la sobrecarga o la abstracción innecesaria de las colecciones más genéricas de Java, logrando potencialmente una mayor eficiencia en un caso de uso muy particular.

* **Desventaja**:
    * **Falta de Robustez y Funcionalidad Estándar**: Las colecciones estándar de Java como java.util.LinkedList han sido extensamente probadas y optimizadas por expertos. Una implementación propia puede ser más propensa a errores (bugs) y, lo más importante, no cumple con todas las interfaces del Java Collections Framework, lo que limita su interoperabilidad con otras partes de un sistema que esperan un java.util.List o java.util.Queue.

***Ya lo había terminado el readme solo que no lo había puesto: repositorio para que vea que es verdad:
https://github.com/CarlosRW/PracticaProgramada3***
