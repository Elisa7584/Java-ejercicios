import java.util.ArrayList;
import java.util.Scanner;

public class EjListas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Crea una lista de 5 palabras directamente en el código.

        String[] listaPalabras = { "manzanilla", "fresas", "pomelo", "macarrones" };
        String listaPalabrasVacias[] = new String[5];

        int longitudLista = 0, numero = 0;

        String listaTamanio[] = new String[longitudLista];

        // Crea una lista de 5 palabras, solicitándolas por consola

        String palabra;

        // Lista con argumentos Crea una lista de 5 palabras, pasándolas como
        // argumentos.

        if (args.length != 5) {
            System.out.println("El numero de argumentos es incorrecto, vuelve a introducirlo: se espera un String y un int");
        } else {
            palabra = args[0];
            palabra = args[1];
            palabra = args[2];
            palabra = args[3];
            palabra = args[4];
        }

        // Crea una lista a partir de una serie de argumentos: El primer argumento debe
        // ser el número de elementos que va a tener la lista.
        // Los siguientes argumentos serán las palabras a introducir en la lista.
        // Recuerda comprobar que el número de argumentos es el adecuado.

        if (args.length != 2) {
            System.out.println("El numero de argumentos es incorrecto, vuelve a introducirlo: se espera un String y un int");
        } else {
            numero = Integer.parseInt(args[0]);
            palabra = args[1];
        
            String listaElementos[] = new String[numero];

            for (int i = 0 ; i < listaElementos.length ;i++){
                System.out.println("Introduce una palabra: ");
                palabra = sc.nextLine();

                listaElementos[i] = palabra;
            }

            for (String elemento : listaElementos) {
                System.out.println(elemento);
            }
        }

        // Crea una lista de N palabras directamente en el código.
        // Para saber el valor de N puede ser introducido por parámetros o solicitado
        // mediante Scanner por la terminal.

        System.out.println("Introduce cuantos elementos quieres que tenga tu lista: ");
        longitudLista = sc.nextInt();

        for (int i = 0; i < listaPalabrasVacias.length; i++) {
            System.out.println("Introduce una palabra: ");
            palabra = sc.nextLine();

            listaPalabrasVacias[i] = palabra;
        }
        System.out.println(listaPalabrasVacias);

        for (String elemento : listaPalabrasVacias) {
            System.out.println(elemento);
        }

        String listaPalabrasArgs[] = new String[5];

        for (int i = 0; i < listaPalabrasArgs.length; i++) {
            System.out.println("Introduce una palabra: ");
            palabra = sc.nextLine();

            listaPalabrasArgs[i] = palabra;
        }

        for (String elemento : listaPalabrasArgs) {
            System.out.println(elemento);
        }

        //
    }
}

