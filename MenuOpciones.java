import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menú
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Opción Uno");
            System.out.println("2. Opción Dos");
            System.out.println("3. Opción Tres");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            // Acciones según la opción
            switch (opcion) {
                case 1:
                    System.out.println("👉 Elegiste la opción 1");
                    break;
                case 2:
                    System.out.println("👉 Elegiste la opción 2");
                    break;
                case 3:
                    System.out.println("👉 Elegiste la opción 3");
                    break;
                case 4:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("❌ Opción inválida, intenta de nuevo.");
            }

        } while (opcion != 4); // Mientras no sea 4, sigue mostrando el menú
    }
}