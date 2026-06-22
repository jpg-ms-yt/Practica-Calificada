public class PatronEstrellas {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // 5 niveles
            // Imprime las estrellas de este nivel
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" "); // Espacio entre grupos
        }
    }
}