import java.util.Scanner;

public class SimularCompras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio;
        double total = 0;
        String agregarMas;

        System.out.println("🛒 Registro de compras");

        do {
            System.out.print("Ingresa precio del producto: S/ ");
            precio = entrada.nextDouble();
            total = total + precio;

            entrada.nextLine(); // Limpiar entrada
            System.out.print("¿Agregar otro producto? (s/n): ");
            agregarMas = entrada.nextLine();

        } while (agregarMas.equalsIgnoreCase("s"));

        System.out.println("--------------------------------");
        System.out.println("💰 TOTAL A PAGAR: S/ " + total);
    }
}