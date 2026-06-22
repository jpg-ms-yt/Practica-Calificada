import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int numeroSecreto = aleatorio.nextInt(100) + 1; // Número entre 1 y 100
        int intento;

        System.out.println("🎮 Adivina el número (entre 1 y 100):");

        do {
            System.out.print("Tu intento: ");
            intento = entrada.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("🔼 Es MAYOR, prueba otro.");
            } else if (intento > numeroSecreto) {
                System.out.println("🔽 Es MENOR, prueba otro.");
            }

        } while (intento != numeroSecreto); // Repite mientras no aciertes

        System.out.println("🎉 ¡Felicidades! Adivinaste, el número era: " + numeroSecreto);
    }
}