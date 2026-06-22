public class NumerosYSuma {
    public static void main(String[] args) {
        int suma = 0;

        System.out.println("Números del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " "); // Muestra el número
            suma = suma + i;           // Va sumando
        }

        System.out.println("\n\nLa suma total es: " + suma);
    }
}
