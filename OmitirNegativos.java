import java.util.Scanner;

public class OmitirNegativos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa números (0 para terminar):");

        do {
            System.out.print("Número: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("⚠️ Número negativo, se omite.");
                continue; // Salta lo que sigue y vuelve a pedir otro
            }

            System.out.println("✅ Procesado: " + numero);

        } while (numero != 0);

        System.out.println("Fin del programa.");
    }
}