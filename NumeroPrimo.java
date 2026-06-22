import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = entrada.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Revisamos divisores desde el 2 hasta la mitad del número
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // Si encuentra uno, ya no sigue buscando
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " ES un número primo");
        } else {
            System.out.println(numero + " NO es un número primo");
        }
    }
}