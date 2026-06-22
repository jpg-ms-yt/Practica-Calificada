import java.util.Scanner;

public class EdadValida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingresa tu edad (0 a 120): ");
            edad = entrada.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("❌ Edad NO válida. Debe ser entre 0 y 120.");
            }

        } while (edad < 0 || edad > 120); // Repite si está fuera de rango

        System.out.println("✅ Edad registrada correctamente: " + edad + " años.");
    }
}