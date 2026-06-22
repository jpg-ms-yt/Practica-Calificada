import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el valor de N: ");
        int n = entrada.nextInt();

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " múltiplos de 3 entre 1 y " + n);
    }
}