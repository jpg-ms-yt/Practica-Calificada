import java.util.Scanner;

public class HastaEscribirSalir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;

        System.out.println("Escribe lo que quieras, escribe 'salir' para terminar:");

        while (true) {
            System.out.print("> ");
            texto = entrada.nextLine();

            if (texto.equalsIgnoreCase("salir")) {
                break; // Sale del ciclo infinito
            }

            System.out.println("📝 Recibido: " + texto);
        }

        System.out.println("👋 Programa finalizado.");
    }
}