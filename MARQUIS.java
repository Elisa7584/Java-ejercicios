public class MARQUIS {
    public static void main(String[] args) {
        public class GeneradorCartaAmor {

    public static void main(String[] args) {
        // Datos de la carta
        String remitente = "Tu Nombre";
        String destinatario = "Nombre de la Persona Amada";
        String saludo = "Querido/a " + destinatario + ",";
        String contenido = "Escribo estas palabras para expresar lo que siento por ti...";
        String despedida = "Con todo mi amor,\n" + remitente;

        // Generar la carta
        String cartaDeAmor = generarCarta(remitente, destinatario, saludo, contenido, despedida);

        // Imprimir la carta
        System.out.println(cartaDeAmor);
    }

    public static String generarCarta(String remitente, String destinatario, String saludo, String contenido, String despedida) {
        StringBuilder carta = new StringBuilder();

        // Saludo
        carta.append(saludo).append("\n\n");

        // Contenido de la carta
        carta.append(contenido).append("\n\n");

        // Despedida
        carta.append(despedida);

        return carta.toString();
    }
}

    }
}
