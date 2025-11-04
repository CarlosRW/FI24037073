import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Random;

public class TheQueue<Type> implements TheQueueInterface<Type> {

    private Deque<Type> _queue;

    public TheQueue() {
        _queue = new ArrayDeque<Type>();
    }

    public void enqueue(Type item) {
        _queue.add(item);
    }

    // Improvement: Actualizar 'dequeue' para retornar 'null' si está vacía, sin 'if'
    public Type dequeue() {
        // ArrayDeque.poll() remueve y retorna el primer elemento, o null si la cola está vacía.
        return _queue.poll();
    }

    // Improvement: Actualizar 'getFront' para retornar 'null' si está vacía, sin 'if'
    public Type getFront() {
        // Gemini
        // ArrayDeque.peek() retorna el primer elemento, o null si la cola está vacía.
        return _queue.peek();
    }

    public boolean isEmpty() {
        return _queue.isEmpty();
    }

    // Error: Corregir el tipo de retorno a 'int' para la implementación.
    // (Ya está correcto en el código, pero se menciona la corrección implícita)
    public int getSize() {
        return _queue.size();
    }

    // Update: Implementar el método 'getCodons'
    public String[] getCodons() {
        // Gemini
        // Implementación para vaciar la cola y formar codones (ternas de nucleótidos)
        int size = _queue.size();
        int codonsCount = size / 3;
        String[] codons = new String[codonsCount];

        for (int i = 0; i < codonsCount; i++) {
            // El 'dequeue' ahora usa 'poll()' que retorna 'null' si está vacía.
            // Asumiendo que 'Type' es 'String' para la concatenación, ya que se está usando en el main
            String n1 = (String) dequeue();
            String n2 = (String) dequeue();
            String n3 = (String) dequeue();
            codons[i] = n1 + n2 + n3;
        }

        return codons;
    }

    public String print() {
        return _queue.toString();
    }

    public static void main(String[] args) {
        var amount = Integer.parseInt(args[0]);
        String[] nucleotides = {
                "A", // [0]
                "C", // [1]
                "G", // [2]
                "T", // [3]
        };
        TheQueueInterface<String> queue = new TheQueue<String>();
        var random = new Random();
        for (; amount > 0; amount--) {
            var index = random.nextInt(4);
            var amino = nucleotides[index];
            queue.enqueue(amino);
        }
        System.out.println("Filled {full}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
        System.out.println("\ngetCodons() → " + Arrays.toString(queue.getCodons()));
        System.out.println("\nEnd {empty}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
    }
}