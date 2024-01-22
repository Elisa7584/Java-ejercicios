package Ejercicios;
import java.util.Locale;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) throws Exception {

        /*Haz un pequeño juego rollo pokemon en el que empieza la partida, el jugador puede introducir su nombre y el del enemigo.

         * Una vez hace eso, va a empezar un combate, y terminara cuando alguien muera jeje. 
         
         *El jugador va a tener un menu el que puede atacar, curarse, huir.

         *Cuando el jugador ataque al enemigo, o al reves, cuando el enemigo ataque al jugador, 

         * dar un mensaje como "Elisa le ha quitado 10 puntos de vida a Manolo!!!",
         * 
         * y cuando alguien muera, tambien tienes que dar un mensaje diciendo "HA GANADO ELISA!!" 
         * 
        */

        Scanner sc= new Scanner (System.in).useLocale(Locale.ENGLISH);

        String nombreJugador, nombreEnemigo;
        int vidaJugador = 100, vidaEnemigo = 100, opcion;

        System.out.println("Introduce el nombre del jugador: ");
        nombreJugador = sc.nextLine();

        System.out.println("Introduce el nombre del enemigo: ");
        nombreEnemigo = sc.nextLine();

        System.out.println("El jugador es " + nombreJugador + " y su oponente va a ser: " + nombreEnemigo);

        System.out.println("EMPIEZA EL COMBATE");

        while (vidaJugador > 0 && vidaEnemigo > 0){

            System.out.println("Elige una opción: \n1- Atacar \n2- Curarse \n3- Huir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Atacar");
                    vidaEnemigo -= 10;
                    System.out.println("El enemigo ha perdido 12 puntos y su vida actual es: " + vidaEnemigo);

                    break;
                
                case 2:
                    System.out.println("Curarse");
                    vidaJugador += 10;
                    break;
                
                case 3:
                    System.out.println("Huir");
                    break;
                    
            }
        
            if (vidaEnemigo <= 0){
                System.out.println("HA GANADO ELISA");
            };

        };

    }
}

