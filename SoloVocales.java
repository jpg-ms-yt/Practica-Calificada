import java.util.Scanner;

public class SoloVocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un texto o frase: ");
        String texto = entrada.nextLine().toLowerCase(); // Todo minúsculas

        System.out.print("Vocales encontradas: ");

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.print(letra + " ");
            }
        }
    }
}