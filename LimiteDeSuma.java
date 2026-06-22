public class LimiteDeSuma {
    public static void main(String[] args) {
        int suma = 0;
        int limite = 50;

        System.out.println("Sumando hasta llegar al límite de " + limite + ":");

        for (int i = 1; i <= 20; i++) {
            suma += i;

            if (suma > limite) {
                System.out.println("\n⚠️ La suma (" + suma + ") superó el límite.");
                break;
            }

            System.out.println("Número: " + i + " | Suma actual: " + suma);
        }
    }
}