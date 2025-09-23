public class Inverso {

    public static void main(String[] args) {
        // Validar que se haya dado un argumento
        if (args.length == 0) {
            System.out.println("Debe ingresar un número natural como argumento.");
            return;
        }

        // Convertir argumento a número
        int numero = Integer.parseInt(args[0]);

        // Calcular el inverso con el método recursivo
        int inverso = invertir(numero, 0);

        // Mostrar resultado
        System.out.println(numero + " → " + inverso);
    }

    public static int invertir(int n, int acumulador) {
        // Si n es 0, retornar el acumulador
        if (n == 0) {
            return acumulador;
        }

        // Obtener último dígito
        int residuo = n % 10;

        // Obtener el resto del número
        int cociente = n / 10;

        // Construir el número inverso recursivamente
        return invertir(cociente, acumulador * 10 + residuo);
    }
}
