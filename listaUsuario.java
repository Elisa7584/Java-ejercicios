import java.util.ArrayList;
import java.util.Scanner;

public class listaUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayPalabras = new ArrayList<String>();

        String palabra = "";

        while (!palabra.equals("salir")){
            arrayPalabras.add(palabra);
            System.out.println("dime una palabra: ");
            palabra = sc.nextLine();
        }

        System.out.println("Has construido la lista: " + arrayPalabras);
}
}
