import java.util.ArrayList;
import java.util.Scanner;


public class ejerc {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        /*Mostrar " " Muestra todos los elementos de una lista separados por espacios.*/

        String[] listaEspacios = {"hola","como","estas"};
        String espacios = " ";

        String[] listaS = {"hola","como","estas"};
        String letra = "S";

        String palabra = "";

        int[] listaNumeros = {1,10,4,80,7};

        for(int i = 0; i < listaEspacios.length ; i++){
            listaEspacios[i] += espacios;
        }
        for (String string : listaEspacios) {
            System.out.print(string);
        }

        // Mostrar S Muestra todos los elementos de una lista separados el símbolo S. El valor de S puede ser

        for(int i = 0; i < listaS.length ; i++){
            listaS[i] += letra;
        }
        for (String string : listaS) {
            System.out.print(string);
        }

        //.- Valor aleatorio: Devuelve un elemento aleatorio de una lista de números.

        int posicionAleatoria = (int) Math.floor(Math.random() * listaNumeros.length - 1);
        System.out.println("\nHemos generado el siguiente numero aleatorio, que corresponde a la posicion ("
                + listaNumeros[posicionAleatoria] + ") de la lista de palabras");

        //.- Palabra aleatoria Devuelve una palabra aleatorio de una lista de palabras.
        int posicionAleatoria2 = (int) Math.floor(Math.random() * listaEspacios.length - 1);
        System.out.println("\nHemos generado el siguiente numero aleatorio, que corresponde a la posicion ("
                + listaEspacios[posicionAleatoria2] + ") de la lista de palabras");

        //.- Lista hasta salir Crea una lista de palabras solicitando palabras mediante Scanner hasta que la palabra introducida sea salir.
        // Muestra despues la lista por pantalla.

        ArrayList<String> arrayPalabras = new ArrayList<String>();

        String palabraUsuario = "";

        while(!palabraUsuario.equals("salir")){
            arrayPalabras.add(palabraUsuario);
            System.out.println("Dime una palabra: ");
            palabraUsuario = sc.nextLine();
        }
        System.out.println(arrayPalabras);

    }
}
