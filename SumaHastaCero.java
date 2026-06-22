import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingresa un número (0 para terminar): ");
            numero = entrada.nextInt();
            suma = suma + numero; // Suma todo, incluso si es 0

        } while (numero != 0); // Se repite mientras NO sea 0

        System.out.println("📊 La suma total es: " + suma);
    }
}