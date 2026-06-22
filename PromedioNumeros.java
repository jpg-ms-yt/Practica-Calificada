import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = entrada.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Número " + i + ": ");
            double valor = entrada.nextDouble();
            suma = suma + valor;
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
    }
}