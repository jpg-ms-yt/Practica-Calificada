import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número positivo: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("❌ Error: El número debe ser mayor a 0. Intenta de nuevo.");
            }

        } while (numero <= 0); // Se repite mientras NO sea positivo

        System.out.println("✅ ¡Correcto! Ingresaste: " + numero);
    }
}