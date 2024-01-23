import java.util.Scanner;

public class Dibujar {
    
    public static void main(String[] args) {
        // Dado un número y un símbolo, escribir la pirámide formada desde un símbolo
        // hasta el número dado

        Scanner sc = new Scanner(System.in);

        int num = 0;
        String simbolo = "", dibujo = "";

        if (args.length != 2) {

            System.out.println("El numero de argumentos es incorrecto: String simbolo, int numero ");
        }else{
            num = Integer.parseInt(args[0]);
            simbolo = args[1];
        }

        for(int i = 0 ; i <= num ; i++){
            for(int j = 1 ; j < i ; j++){
                System.out.print(simbolo);
            }
            System.out.println();
    }
}
}
