import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class examenBucles {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in).useLocale(Locale.ENGLISH);
        Random random = new Random();

        String nombreEquipo;
        int numMiembros;

        if (args.length > 2){
            System.out.println("Versión del código en desarrollo... ¡Introduzca el nombre del equipo y el número de miembros!");
        }else{
            System.out.println("Ha introducido correctamente los datos.");
            nombreEquipo = args[0];
            numMiembros = Integer.parseInt(args[1]);

        System.out.print("Ingrese el nombre del equipo: ");
        nombreEquipo = sc.nextLine();

        System.out.print("Ingrese el número de miembros del equipo: ");
        numMiembros = sc.nextInt();

        sc.nextLine();

        String[] nombresMiembros = new String[numMiembros];

        for (int i = 0; i < numMiembros; i++) {
            System.out.print("Ingrese el nombre del miembro " + (i + 1) + ": ");
            String nombreMiembro = sc.nextLine();

            String nombreAnonimo = nombreMiembro.substring(0, Math.min(3, nombreMiembro.length())) + "***";
            nombresMiembros[i] = nombreAnonimo;
        }

        int indiceJefe = random.nextInt(numMiembros);

        System.out.println("\nInformación del equipo:");

        System.out.print("El equipo " + nombreEquipo + " está compuesto por " + numMiembros + " integrantes, a saber: ");
        for (int i = 0; i < numMiembros; i++) {
            System.out.print(nombresMiembros[i]);

            if (i < numMiembros - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
        
        System.out.println("El jefe de equipo es: " + nombresMiembros[indiceJefe] + ".");

}
}
}

