import java.util.Locale;
import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args) {
        /*Solicita por consola una hora, unos minutos y unos segundos. 
        Vuelve a solicitar los datos en caso de no estar comprendidos 
        entre los valores correctos.*/

        Scanner sc=new Scanner (System.in).useLocale(Locale.ENGLISH); 

        int horas,minutos,segundos;

        do{
            System.out.println("Dime una hora:");
            horas = sc.nextInt();
        }while(horas > 24 && horas < 24);

        do{
            System.out.println("Dime un minuto:");
            minutos = sc.nextInt();
            }while(minutos > 60 && minutos < 60);

        do{
            System.out.println("Dime un segundo:");
            segundos = sc.nextInt();
            }while(segundos > 60 && segundos < 60);

        System.out.println("Las horas son " + horas + ", los minutos son " + minutos + " y los segundos son " + segundos);
    }
}
