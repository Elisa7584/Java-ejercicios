import java.util.Scanner;

public class EjRandomYArrayMARCOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ESTE CODIGO EN REALIDAD ES CORTISIMO, PERO ENTRE COMENTARIOS Y SYSTEM.OUT.PRINTLN's, PARECE MAS GRANDE


        // String listaPalabras[] => Esto a secas, es solo una variable sin inicializar,
        // osea, como si no existiera aún.
        // Cuando añadimos el "= new String[5]", estamos diciendo: 'Quiero que esta
        // variable, sea un NUEVO ARRAY de tipo STRING de 5 POSICOINES (osea, 0, 1, 2, 3 y 4)'

        String listaPalabras[] = new String[5];
        System.out.println("\nAcabamos de crear una lista vacía de " + (listaPalabras.length - 1)
                + " posiciones, osea que contiene " + listaPalabras.length + " elementos realmente.");

        // Ahora, queremos recorrer esas 5 posiciones que hemos creado, ya que existen,
        // pero están vacías por ahora
        // Esto es como decir, partiendo desde la posicion 0 (i = 0), mientras que no
        // llegue a la ultima posicion de la lista (listaPalabras.length), aumenta una posicion

        for (int i = 0; i < listaPalabras.length; i++) {
            System.out.println("\n¡Vamos a rellenar la posicion " + i + " de la lista de palabras!");
            System.out.println("Introduce una palabra: ");
            listaPalabras[i] = sc.nextLine(); // Ahora, quiero rellenar de la lista de palabras, la posicion (i), osea,
                                              // la que toque.
                                              // Y en este caso quiero rellenarla con el String que escriba el usuario
        }

        System.out.println("\n¡Has terminado de rellenar la lista!");

        // Ahora, quiero mostrar de manera aleatoria, una de las palabras que hay dentro
        // de mi lista "listaPalabras", ¿Cómo?...
        // FACIL, primero, vamos a generar de manera aleatoria la posicion que queremos mostrar:

        //      Math.floor      =>  Redondea el numero aleatorio que nos dan.
        //      Math.random     =>  Genera un numero aleatorio entre 0 y el numero por el que multipliquemos.

        // Otra cosa importante, listaPalabras.length - 1, significa lo siguiente: Si tenemos 5 cosas en la lista,
        // solo quiero llegar hasta el numero 4, porque vamos por posiciones, 
        // osea, 0, 1, 2, 3 y 4. 
        // El 5 nos lo comemos jeje.

        int posicionAleatoria = (int) Math.floor(Math.random() * listaPalabras.length - 1);
        System.out.println("\nHemos generado el siguiente numero aleatorio, que corresponde a la posicion ("
                + posicionAleatoria + ") de la lista de palabras");
        System.out.println("\nLa palabra, de la lista de palabras, de la posicion generada, en este caso es...  ¡¡"
                + listaPalabras[posicionAleatoria] + "!!");

        // Y por ultimo, mostramos de la lista de palabras que tenemos, la palabra que
        // hay en la posicion aleatoria que hemos generado.
    }
}
