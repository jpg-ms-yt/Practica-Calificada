public class MultiplosDeCinco {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                continue; // Si no es múltiplo, salta
            }
            System.out.print(i + " ");
        }
    }
}