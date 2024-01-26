// TEN EN CUENTA QUE ESTO LO ACABO DE GENERAR AHORA
// VOY A INTENTAR VER SI PUEDO ASEGURARME QUE ESTÁ TODO BIEN
// AL MENOS TIENES ESTO POR SI TE AYUDA :)

// Y LEE LOS COMENTARIOS POR SI ACASO
        import java.util.ArrayList;
import java.util.Scanner;

public class ComidaRapida {
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        Scanner scanner = new Scanner(System.in);
         // Si no te deja usar arraylist, usa un array normal y ya

            // LEE ESTO, ES LA JUSTIFICACIÓN DE PORQUE USO ARRAYLOST
            
        // ARRAYLIST PORQUE QUEREMOS METER DE MANERA DINAMICA ELEMENTOS Y NO SABEMOS CUANTOS QUEREMOS
            // EL ARRAY NORMAL ES CUANDO SABES EL NUMERO DE COSAS QUE QUIERES GUARDAR, Y AQUÍ NO LO SABEMOS CLARO
        ArrayList<String> pedido = new ArrayList<>();
        double precioTotal = 0;

        System.out.println("¿Qué quiere pedir? Hamburguesa, Pizza o Helado.");

        while (true) {
            String opcion = scanner.nextLine().toLowerC
            if (opcion.equals("hamburguesa")) {
                // #1 - Preguntar por los extras de la hamburguesa

                   // El 
                System.out.println("¿Quiere lechuga?");
                boolean lechuga = scanner.nextLine().equalsIgnoreCase("si");

                System.out.println("¿Quiere tomate?");
                boolean tomate = scanner.nextLine().equalsIgnoreCase("si");

                System.out.println("¿Quiere mayonesa?");
                boolean mayonesa = scanner.nextLine().equalsIgnoreCase("si");

                // Construir el String con la información de la hamburguesa
                String infoHamburguesa = "Una hamburguesa";
                if (lechuga) infoHamburguesa += " con lechuga";
                if (tomate) infoHamburguesa += " con tomate";
                if (mayonesa) infoHamburguesa += " con mayonesa";

                pedido.add(infoHamburguesa);
                precioTotal += 6;
            } else if (opcion.equals("pizza")) {
                // #2 - Preguntar por los extras de la pizza
                System.out.println("¿Quiere salsa?");
                boolean salsa = scanner.nextLine().equalsIgnoreCase("si");

                System.out.println("¿Quiere extra de queso?");
                boolean quesoExtra = scanner.nextLine().equalsIgnoreCase("si");

                // Construir el String con la información de la pizza
                String infoPizza = "Una pizza";
                if (salsa)
                        infoPizza += " con salsa";
                if (quesoExtra) 
                        infoPizza += " con extra de queso";

                pedido.add(infoPizza);
                precioTotal += 12;
            } else if (opcion.equals("helado")) {
                // #3 - Preguntar por los extras del helado
                System.out.println("¿Quiere chispitas?");
                boolean chispitas = scanner.nextLine().equalsIgnoreCase("si");

                System.out.println("¿Quiere sirope?");
                boolean sirope = scanner.nextLine().equalsIgnoreCase("si");

                System.out.println("¿Quiere cucurucho o tarrina?");
                String cucuruchoTarrina = scanner.nextLine();

                // Construir el String con la información del helado
                String infoHelado = "Un helado";
                if (chispitas) 
                        infoHelado += " con chispitas";
                if (sirope)
                        infoHelado += " con sirope";
                infoHelado += " en " + cucuruchoTarrina;

                pedido.add(infoHelado);
                precioTotal += 3;
            }

            System.out.println("¿Quiere algo más? Si/No");
            if (scanner.nextLine().equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("¿Qué quiere pedir? Hamburguesa, Pizza o Helado.");
        }

        // Mostrar el pedido
        System.out.println("Va a comprar:");
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println((i + 1) + ". " + pedido.get(i));
        }

        // Eliminar producto del pedido si se desea
        while (true) {
            System.out.println("¿Desea eliminar algo del pedido? Si/No");
            if (scanner.nextLine().equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("¿Indica el número del producto desea eliminar?");
            int numeroProducto = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea en blanco después del número

            if (numeroProducto > 0 && numeroProducto <= pedido.size()) {
                pedido.remove(numeroProducto - 1);
                System.out.println("Va a comprar:");
                for (int i = 0; i < pedido.size(); i++) {
                    System.out.println((i + 1) + ". " + pedido.get(i));
                }
            } else {
                System.out.println("Número de producto inválido. Por favor, inténtelo de nuevo.");
            }
        }

        // Mostrar el precio final y solicitar el nombre para el pedido
        System.out.println("Son " + pedido.size() + " producto(s) y " + precioTotal + "€.");
        System.out.println("Introduzca el nombre de la persona que recogerá el pedido.");
        String nombreCliente = scanner.nextLine();
        System.out.println("¡Muchas gracias, " + nombreCliente + "!");
>>>>>>> 963d0049e7941e6529110e7e8d234d56a8a557b8
    }
                    }
        
