import java.util.Scanner;

public class MismaInicial {

    public static boolean sonIguales(String palabra1, String palabra2){
        return palabra1.charAt(0) == palabra2.charAt(0);
    }
    public static void main(String[] args) {
        /*
         * Crea una función a la que le pases dos palabras y compruebe si tienen la
         * misma inicial.
         * True si tiene la misma inicial.
         * False si no tiene la misma inicial.
         */

         Scanner sc=new Scanner (System.in);

         String pal1 = "", pal2 = "";

         String[] listaPalabrasPrueba = {"alcachofa", "cocacola", "1234", "caca"};

         if(args.length == 1 && args[0].equals("probando")){

            for (String string : listaPalabrasPrueba) {
                System.out.println(string);
            }

            pal2 = listaPalabrasPrueba[0];

            for(int i = 0; i < listaPalabrasPrueba.length ; i++){
                pal1 = listaPalabrasPrueba[i];
                System.out.println(sonIguales(pal1, pal2));
            }

         }else if(args.length != 2){
            System.out.println("¡¡¡¡¡El numero de argumentos es incorrecto, vuelve a introducirlos!!!!! -> Se esperan dos String's");
         }else{
            pal1 = args[0];
            pal2 = args[1];

            System.out.println(sonIguales(pal1, pal2));
         }

    }
}
