public class DetenerEn30 {
    public static void main(String[] args) {
        System.out.println("Números hasta detenerse en 30:");

        for (int i = 1; i <= 50; i++) {
            if (i == 30) {
                break; // Termina el ciclo completamente
            }
            System.out.print(i + " ");
        }
    }
}