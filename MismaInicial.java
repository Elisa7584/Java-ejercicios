import java.util.Scanner;

public class MismaInicial {

    public static boolean esIgual(String palabra1, String palabra2) {
        return palabra1.charAt(0) == palabra2.charAt(0);
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra1 = "", palabra2 = "";
        boolean esLoMismo;
        String[] palabrasPrueba = { "patata", "pomelo", "melocoton", "1234" };

        if (args.length == 1 && args[0].equals("probando")) {

            palabra1 = palabrasPrueba[0];

            for (int i = 1; i < palabrasPrueba.length; i++) {
                palabra2 = palabrasPrueba[i];
                System.out.println(esIgual(palabra1, palabra2));
            }
        } else if (args.length != 2) {
            System.out.println("Dime una palabra: ");
            palabra1 = sc.nextLine();

            System.out.println("Dime otra palabra: ");
            palabra2 = sc.nextLine();

        } else {
            palabra1 = args[0];
            palabra2 = args[1];
        }

        System.out.println(esLoMismo = esIgual(palabra1, palabra2));
    }
}
