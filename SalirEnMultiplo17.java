public class SalirEnMultiplo17 {
    public static void main(String[] args) {
        System.out.println("Números hasta encontrar múltiplo de 17:");

        for (int i = 1; i <= 100; i++) {
            if (i % 17 == 0) {
                System.out.println("\n🛑 Se detuvo en el primer múltiplo: " + i);
                break;
            }
            System.out.print(i + " ");
        }
    }
}