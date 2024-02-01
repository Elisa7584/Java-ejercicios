import java.util.Random;

public class buclesMarquis {
    public static void main(String[] args) {
        // Crear un objeto Random
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 10
        int numeroAleatorio = random.nextInt(10) + 1;

        // Imprimir el número aleatorio
        System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio);
    }
}
