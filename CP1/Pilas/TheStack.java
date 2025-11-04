import java.util.Random;
import java.util.Stack;

public class TheStack<Type> implements TheStackInterface<Type> {

    private Stack<Type> _stack;

    private Integer _capacity;

    public TheStack(Integer capacity) {
        _stack = new Stack<Type>();
        _capacity = capacity;
    }

    // Improvement: Arreglar el método 'push' para retornar Boolean
    public Boolean push(Type item) {
        // Gemini
        // El error de compilación se debe a la recursión infinita en la implementación original
        var available = _stack.size() < _capacity;
        if (available) {
            _stack.push(item); // Se debe llamar al push del objeto Stack
        }
        return available;
    }

    // Update: Modificar 'pop' para retornar 'null' si la pila está vacía
    public Type pop() {
        // Modificación para retornar null si la pila está vacía
        if (_stack.isEmpty()) {
            return null;
        }
        return _stack.pop();
    }

    // Update: Modificar 'peek' para retornar 'null' si la pila está vacía
    public Type peek() {
        // Gemini
        // Arreglo del error y modificación para retornar null si la pila está vacía
        if (_stack.isEmpty()) {
            return null;
        }
        return _stack.peek();
    }

    // debe coincidir con la firma de la interfaz
    public Boolean empty() {
    // Se cambia el tipo de retorno a 'Boolean' para coincidir con la interfaz.
        return _stack.isEmpty();
    }

    public Integer size() {
        // Tipo de retorno de 'int' a 'Integer'
        return _stack.size();
    }

    public String print() {
        return _stack.toString();
    }

public static void main(String[] args) {
        // Error: Corregir el tipo de la variable 'stack' para que sea TheStackInterface
        // Solo se resuelve el error de compilación en 'size'
        var capacity = Integer.parseInt(args[0]);
        TheStackInterface<Double> stack = new TheStack<Double>(capacity);
        System.out.println("Pushing {capacity + 1}");
        var random = new Random();
        for (var n = 0; n <= capacity; n++) {
            var number = random.nextDouble();
            var pushed = stack.push(number);
            System.out.println(" ↳ push(" + number + ") → " + pushed);
        }
        System.out.println();
        System.out.println("Pushed {full}");
        System.out.println(" ↳ print() → " + stack.print());
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
        System.out.println();
        System.out.println("Popping {capacity + 1}");
        for (var n = 0; n <= capacity; n++) {
            var popped = stack.pop();
            System.out.println(" ↳ pop() → " + popped);
        }
        System.out.println();
        System.out.println("Popped {empty}");
        System.out.println(" ↳ print() → " + stack.print());
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
    }
}