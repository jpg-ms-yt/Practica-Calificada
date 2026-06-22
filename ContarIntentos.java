import java.util.Scanner;

public class ContarIntentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int VALOR_CORRECTO = 25; // El número que debes poner
        int intento;
        int contadorIntentos = 0;

        System.out.println("🔢 Ingresa el número correcto (es el 25):");

        do {
            System.out.print("Intento: ");
            intento = entrada.nextInt();
            contadorIntentos++; // Sumamos 1 intento cada vez que escribes

            if (intento != VALOR_CORRECTO) {
                System.out.println("❌ Incorrecto, sigue intentando...");
            }

        } while (intento != VALOR_CORRECTO);

        System.out.println("✅ ¡Correcto! Lo lograste después de " + contadorIntentos + " intentos.");
    }
}