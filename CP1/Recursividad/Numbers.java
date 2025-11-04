public class Numbers {

    private static double N = 25;

    public static double formula(double z) {
        // Se necesita una instancia para llamar al método 'round' ya que no es estático
        return new Numbers().round((z + Math.sqrt(4 + Math.pow(z, 2))) / 2);
    }

    public static double recursive(double z) {
        return new Numbers().round(recursive(z, N) / recursive(z, N - 1));
    }

    public static double iterative(double z) {
        return new Numbers().round(iterative(z, N) / iterative(z, N - 1));
    }

    // Improvement: Actualizar el método 'recursive'
    private static double recursive(double z, double n) {
        // Implementación de la función recursiva f(z, n) = z • f(z, n - 1) + f(z, n - 2)
        if (n == 0 || n == 1) {
            return 1.0;
        }
        return z * recursive(z, n - 1) + recursive(z, n - 2);
    }

    // Update: Implementar el método 'iterative'
    private static double iterative(double z, double n) {
        // Implementación iterativa del algoritmo
        if (n == 0 || n == 1) {
            return 1.0;
        }

        double a = 1.0; // f(z, 0)
        double b = 1.0; // f(z, 1)
        double c = 0.0; // f(z, i)

        for (int i = 2; i <= n; i++) {
            c = z * b + a;
            a = b;
            b = c;
        }
        return c;
    }

    // Error: Se cambia de 'private double round' a 'private static double round'
    // Se mantiene 'private double round' y se usa 'new Numbers().round(...)' en 'public static' para evitar cambiar la firma de 'round'.
    // Esto es un 'Error' de compilación
    private double round(double value) {
        var ROUND = 10000000000.0;
        return Math.round(value * ROUND) / ROUND;
    }

    public static void main(String[] args) {
        String[] metallics = {
                "Platinum", // [0]
                "Golden", // [1]
                "Silver", // [2]
                "Bronze", // [3]
                "Copper", // [4]
                "Nickel", // [5]
                "Aluminum", // [6]
                "Iron", // [7]
                "Tin", // [8]
                "Lead", // [9]
        };
        for (var z = 0; z < metallics.length; z++) {
            System.out.println("\n[" + z + "] " + metallics[z]);
            System.out.println(" ↳ formula(" + z + ")   ≈ " + formula(z));
            System.out.println(" ↳ recursive(" + z + ") ≈ " + recursive(z));
            System.out.println(" ↳ iterative(" + z + ") ≈ " + iterative(z));
        }
    }
}