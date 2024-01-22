package Ejercicios;
import java.util.Locale;
import java.util.Scanner;

public class Practicas {
    public static void main(String[] args) {
        int numCoches;

        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("¿cuantos coches tienes: ?");
        numCoches = sc.nextInt();
        System.out.println("Yo tengo " + numCoches + " coches");

        
        Coche cocheElisa = new Coche(4, "Toyota", "Elisa");

        System.out.println("Vamos a pincharle las ruedas a Elisa, elige cuantas pinchamos: ");
        int ruedasPinchar = sc.nextInt();
        cocheElisa.pincharRuedas(ruedasPinchar);

        System.out.println(cocheElisa.toString());

    }
}
