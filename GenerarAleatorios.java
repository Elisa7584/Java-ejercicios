import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class GenerarAleatorios {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in).useLocale(Locale.ENGLISH);


        Random rand = new Random();
        int numero;
        double numero1;

        numero = rand.nextInt();
        System.out.println(numero);

        numero = rand.nextInt(5);
        System.out.println(numero);

        numero = rand.nextInt(5+1);
        System.out.println(numero);

        numero = rand.nextInt(5)+1;
        System.out.println(numero);

        numero1 = Math.random();
        System.out.println(numero1);

        numero1 = Math.random()*10 + 1;
        System.out.println(numero1);

        numero1 = Math.floor(Math.random()*20);
        System.out.println(numero1);
        numero = (int) numero1;

        int maximo = 20;
        int minimo = 5;
        int diferencia = maximo-minimo;

        numero = (int)Math.floor(Math.random()*diferencia)+minimo;
        System.out.println(numero);


    }
}
