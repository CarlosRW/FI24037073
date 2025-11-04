# Caso Práctico 1 (CP1) - Estructuras de Datos

| Curso | Estructuras de Datos |
| :--- | :--- |
| Código | SC-304 |
| Profesor | Luis Andrés Rojas Matey |
| Estudiante | Carlos Eduardo Ramírez Wong |
| Carné | F124037073 |

---

## Indicaciones Generales

Este repositorio contiene la resolución del Caso Práctico 1, que consta de tres proyectos independientes: **Recursividad**, **Pilas** y **Colas**.

Todos los proyectos han sido resueltos siguiendo las indicaciones de **_Errors_**, **_Improvement_**, y **_Update_** sin modificar los métodos `public` (excepto por las implementaciones requeridas) ni el método `main`.

El código fuente incluye comentarios que indican las implementaciones realizadas y la herramienta utilizada (`// Gemini`).

---

## Implementaciones y Cambios Relevantes

### 1. Recursividad (Numbers.java)

| Requisito | Archivo / Método | Solución |
| :--- | :--- | :--- |
| **_Errors_** | `public static` | Corregidos errores de compilación ajustando la llamada al método `round()` (ej., `new Numbers().round(...)`). |
| **_Improvement_** | `private double recursive(...)` | Implementación de la fórmula recursiva $f(z, n) = z \cdot f(z, n-1) + f(z, n-2)$ con casos base $f(z, 0)=1$ y $f(z, 1)=1$. |
| **_Update_** | `private double iterative(...)` | Implementación de la misma lógica usando un bucle `for` y variables auxiliares para el cálculo iterativo de la sucesión. |

### 2. Pilas (TheStack.java)

| Requisito | Archivo / Método | Solución |
| :--- | :--- | :--- |
| **_Errors_** | `empty()`, `size()` | Tipos de retorno ajustados a **`Boolean`** e **`Integer`** para coincidir con `TheStackInterface`. |
| **_Improvement_** | `public Boolean push(...)` | Implementación de la verificación de capacidad (`_stack.size() < _capacity`) para retornar `false` en caso de Overflow. |
| **_Update_** | `public Type pop()` y `public Type peek()` | Se añadió la verificación `if (_stack.isEmpty()) { return null; }` para manejar el Underflow. |

### 3. Colas (TheQueue.java)

| Requisito | Archivo / Método | Solución |
| :--- | :--- | :--- |
| **_Improvement_** | `public Type dequeue()` y `public Type getFront()` | Uso de los métodos `_queue.poll()` y `_queue.peek()` de `ArrayDeque` para retornar `null` si está vacía, sin usar la sentencia `if`. |
| **_Update_** | `public String[] getCodons()` | Implementación para vaciar la cola, tomar elementos de