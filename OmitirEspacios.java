public class OmitirEspacios {
    public static void main(String[] args) {
        String frase = "Hoy es un día muy bonito";
        System.out.println("Texto sin espacios:");

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter == ' ') {
                continue; // Salta el espacio
            }

            System.out.print(caracter);
        }
    }
}