import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class GenerarAleatorios {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in).useLocale(Locale.ENGLISH);

        //Forma uno

        Random rand = new Random();
        int numero;
        double numero1;

        numero = rand.nextInt();
        System.out.println(numero);

        //Numero entre 0 y 4
        numero = rand.nextInt(5);
        System.out.println(numero);

        //Numero entre 0 y 5
        numero = rand.nextInt(5+1);
        System.out.println(numero);

        //Numero entre 1 y 5
        numero = rand.nextInt(5)+1;
        System.out.println(numero);

        //Forma dos

        //Numero aleatorio entre 0 y 1
        numero1 = Math.random();
        System.out.println(numero1);

        //Numero aleatorio entre 0 y 10
        numero1 = Math.random()*10 + 1;
        System.out.println(numero1);

        //Numero aleatorio entero entre 0 y 20
        numero1 = Math.floor(Math.random()*20);
        System.out.println(numero1);
        numero = (int) numero1;

        //Numero aleatorio entre 5 y 20
        int maximo = 20;
        int minimo = 5;
        int diferencia = maximo-minimo;

        numero = (int)Math.floor(Math.random()*diferencia)+minimo;
        System.out.println(numero);


    }
}
