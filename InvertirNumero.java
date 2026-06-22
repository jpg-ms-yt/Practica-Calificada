import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();

        System.out.print("Número invertido: ");

        // Convertimos a texto para recorrerlo (forma sencilla)
        String texto = String.valueOf(numero);

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
}