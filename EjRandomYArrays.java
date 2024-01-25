<<<<<<< HEAD
import java.util.Scanner;

public class EjRandomYArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String listaPalabras[] = new String[5];

        for (int i = 0; i < listaPalabras.length; i++) {

            System.out.println("Dime una palabra: ");
            String palabra = sc.nextLine();

            listaPalabras[i] = palabra;
        }

        int posicionAleatoria = (int) Math.floor(Math.random() * listaPalabras.length -1);
        System.out.println(listaPalabras[posicionAleatoria]);

    }
}
=======
import java.util.Scanner;

public class EjRandomYArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String listaPalabras[] = new String[5];

        for (int i = 0; i < listaPalabras.length; i++) {

            System.out.println("Dime una palabra: ");
            String palabra = sc.nextLine();

            listaPalabras[i] = palabra;
        }

        int posicionAleatoria = (int) Math.floor(Math.random() * listaPalabras.length -1);
        System.out.println(listaPalabras[posicionAleatoria]);

    }
}
>>>>>>> 9ab9394bbb346df9245fad01bc9209de12ac4739
