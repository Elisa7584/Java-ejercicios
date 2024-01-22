package Ejercicios;
import java.util.Locale;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        int numero = 0;

        numero= Integer.parseInt(args[0]);
        if(numero >= 0){
            System.out.println(numero + " es positivo");
        }
        else{
            System.out.println(numero + " es negativo");
        }

        Scanner sc=new Scanner (System.in).useLocale(Locale.ENGLISH);

        
        /*EJERCICIO 1*/

        if (numero < 5){
            System.out.println("El numero es menor que cinco");
        }
        else if (numero == 5){
            System.out.println("El numero es cinco");
        }
        else{
            System.out.println("El numero es mayor que cinco");
        }

        /*EJERCICIO 2*/

        System.out.println("Dime un numero: ");
        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("El numero es ngativo");
        }
        else if(numero > 0){
            System.out.println("El numero es positivo");
        }
    }
}
