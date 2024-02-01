import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner (System.in);

    public static Juego crearJuego(){
        String nombre, genero;
        int precio;

        System.out.println("Dime el nombre del juego: ");
        nombre = sc.nextLine();

        sc.nextLine();

        System.out.println("Dime el genero: ");
        genero = sc.nextLine();

        System.out.println("Dime el precio: ");
        precio = sc.nextInt();

        return new Juego( genero, nombre, precio);

    }
    public static void main(String[] args) {
        /* Queremos crear un servicio de alquiler de juegos, donde la gente puede o bien, añadir juegos al servicio, o alquilarlos y gastarse su dinero
         * para poder tenerlos.
         * Quiero hacer un menu con 4 opciones: 1 - Ver juegos 2 - Comprar juego 3 - Vender juego 4 - Salir
         */
        ArrayList<Juego> arrayJuegos = new ArrayList<Juego>();
        ArrayList<Juego> arrayJuegosComprados = new ArrayList<Juego>();
        


        int opcion = 0;

         while(opcion != 5){

            System.out.println("1- ver Juegos");
            System.out.println("2- comprar Juego");
            System.out.println("3- vender Juego");
            System.out.println("4- añadir Juego");
            System.out.println("5- salir");

            System.out.println("Elige una de las cuatro opciones: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Lista de juegos disponibles");
                    for (Juego juego : arrayJuegos) {
                        System.out.println(juego.toString());
                    }

                    System.out.println("Lista de juegos comprados del usuario");
                    for (Juego juego : arrayJuegosComprados) {
                        System.out.println(juego.toString());
                    }
                }
                case 2 -> {
                    int contador = 1;
                    for (Juego juego : arrayJuegos) {
                        System.out.println(contador + "-" + juego.getNombre() + " " + juego.getPrecio() + "€");
                        contador ++;
                    }
                    System.out.println("Elige un juego de la lista: ");
                    int posJuego = sc.nextInt() - 1;

                    arrayJuegos.get(posJuego).comprarJuego();

                    Juego juegoUsuario = arrayJuegos.get(posJuego);
                    arrayJuegosComprados.add(juegoUsuario);
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    Juego nuevoJueguito = crearJuego();
                    arrayJuegos.add(nuevoJueguito);
                } 
                case 5 -> {
                    System.out.println("Has salido de la tienda");
                } 
            }
        } 
    }
}
