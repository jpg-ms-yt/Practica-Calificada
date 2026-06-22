import java.util.Scanner;

public class ContrasenaCorrecta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String CLAVE_CORRECTA = "java2026"; // Puedes cambiarla
        String claveIngresada;

        do {
            System.out.print("Ingresa tu contraseña: ");
            claveIngresada = entrada.nextLine();

            if (!claveIngresada.equals(CLAVE_CORRECTA)) {
                System.out.println("❌ Contraseña incorrecta. Intenta otra vez.");
            }

        } while (!claveIngresada.equals(CLAVE_CORRECTA)); // Repite si es distinta

        System.out.println("✅ Contraseña correcta. ¡Bienvenido!");
    }
}