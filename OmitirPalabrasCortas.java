import java.util.Scanner;

public class OmitirPalabrasCortas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = entrada.nextLine();
        String[] palabras = frase.split(" "); // Separa la frase en palabras

        System.out.println("\nPalabras con 3 o más letras:");

        for (String palabra : palabras) {
            if (palabra.length() < 3) {
                continue; // Salta si tiene menos de 3 caracteres
            }
            System.out.println("- " + palabra);
        }
    }
}