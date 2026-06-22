public class BuscarYDetener {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 8, 23, 15, 30, 7};
        int buscado = 23;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                System.out.println("✅ Número " + buscado + " encontrado en la posición: " + i);
                break; // Ya no sigue buscando
            }
        }

        if (!encontrado) {
            System.out.println("❌ El número no está en el arreglo.");
        }
    }
}