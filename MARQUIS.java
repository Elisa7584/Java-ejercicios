import java.util.ArrayList;

public class BuclesEnPosicion {

    public static int buscaPosicion(int pos, ArrayList<Integer> lista) {
        int numero = -1;
        if (pos >= 0 && pos < lista.size()) {
            numero = lista.get(pos);
        }
        return numero;
    }

    public static void main(String[] args) {
        int numero, resultado;

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        // Generar la batería de pruebas
        System.out.println("Batería de pruebas:");
        for (int i = 0; i < 10; i++) {
            numero = (int) Math.floor(Math.random() * 20);
            listaNumeros.add(numero);
            System.out.println("Número en posición " + i + ": " + numero);
        }

        if (args.length == 1) {
            int posicion = Integer.parseInt(args[0]);
            resultado = buscaPosicion(posicion, listaNumeros);

            System.out.println("\nResultados de la batería de pruebas:");
            System.out.println("Posición solicitada: " + posicion);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Por favor, proporciona un argumento válido para la posición.");
        }
    }
}
