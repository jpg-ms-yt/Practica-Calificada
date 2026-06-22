import java.util.Scanner;

public class AcumularNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        double suma = 0;
        int cantidad = 0;
        String continuar;

        do {
            System.out.print("Ingresa una nota: ");
            nota = entrada.nextDouble();
            suma = suma + nota;
            cantidad++; // Contamos cuántas notas van

            // Limpiamos el buffer para leer texto
            entrada.nextLine();
            System.out.print("¿Ingresar otra nota? (s/n): ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("s")); // Mientras diga "s", seguimos

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("📈 Total notas: " + cantidad);
            System.out.println("📊 Promedio final: " + promedio);
        } else {
            System.out.println("⚠️ No ingresaste ninguna nota.");
        }
    }
}