import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, fahrenheit;
        String respuesta;

        do {
            System.out.print("🌡️ Ingresa temperatura en Celsius: ");
            celsius = entrada.nextDouble();

            // Fórmula: (°C × 9/5) + 32 = °F
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("👉 Equivale a: " + fahrenheit + " °F");

            entrada.nextLine(); // Limpiar
            System.out.print("¿Convertir otro valor? (s/n): ");
            respuesta = entrada.nextLine();
            System.out.println(); // Salto de línea

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("✅ Programa finalizado.");
    }
}