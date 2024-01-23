import java.util.Scanner;

public class TamaPalabra {

    public static String tamaPalabra(String palabra, int numero) {

        int longitudPalabra = palabra.length();

        if (longitudPalabra < numero) {
            for (int i = longitudPalabra; i < numero; i++) {

                palabra += "-";
            }
        } else if (longitudPalabra > numero) {

            String aux = "";

            for (int i = 0; i < numero; i++) {

                aux += palabra.charAt(i);
            }
            palabra = aux;
        }

        return palabra;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 5;
        String palabra = "", nuevaPalabra = "";
        String[] listaPalabras = { "patata", "gato", "hipopotamo", "", "eco", "esternocleido" };
        int[] numerosPrueba = { -2, 3, 5, 10 };

        if (args.length == 1 && args[0].equals("probando")) {

            for (int numerosDePrueba : numerosPrueba) {
                System.out.println(tamaPalabra(palabra, numerosDePrueba));
                
                for (String palabraPrueba : listaPalabras) {
                    System.out.println(tamaPalabra(palabraPrueba, numero));
                }
            }
        } else if (args.length != 2) {

            System.out.println("El numero de argumentos no es correcto");

        } else {
            numero = Integer.parseInt(args[0]);
            palabra = args[1];
        }

    }
}
