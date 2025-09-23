# Práctica Programada 1 - Inverso

**Nombre:** Carlos Eduardo Ramírez Wong 
**Carné:** FI24037073

---

### Ejemplo de uso
```bash
javac Inverso.java
java Inverso 123
```

### Resultado
```bash
123 → 321
```

## Posibles Soluciones
- **W3schools:** https://www.w3schools.com/java/java_recursion.asp
- **ChatGPT:** https://chatgpt.com/share/68d21ee6-1b64-8002-bc34-d441c6915564

## Respuestas a las preguntas
1. **¿Es posible implementar una solución equivalente pero de comportamiento iterativo?**
Sí, se puede implementar con un ciclo while o for, tomando el residuo (% 10) en cada iteración y acumulando los dígitos en otro número.
La diferencia es que en la versión recursiva, la llamada se hace sobre un número más pequeño (n / 10) hasta llegar al caso base.

2. **¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?**
Sí. Usando recursividad sin acumulador, pero concatenando los dígitos en una cadena (String) y luego convirtiéndola a entero.

3. **¿Qué relación observa entre el algoritmo para invertir un número natural (calculando y utilizando los cocientes y residuos de las divisiones) con las estrategias para pasar de una base numérica a otra?**
Ambos algoritmos siguen un mismo patrón:

- En cada paso, se obtiene un residuo (n % base) que representa el "último dígito" en esa base.

- Se obtiene un cociente (n / base) que reduce el número para continuar el proceso.

- Se repite hasta que el cociente es cero.

Es decir, al invertir un número en base 10 usamos la misma lógica que cuando transformamos un número decimal a binario, octal o hexadecimal.