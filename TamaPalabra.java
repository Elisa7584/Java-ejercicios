public class TamaPalabra {
    public static String tamaPalabra(int n, String palabra){
        int longitudPalabra = palabra.length();

        if (longitudPalabra < n){
            for (int i = longitudPalabra ; i < n ; i++){
                palabra += "-";
            }
        }else if (longitudPalabra > n){
            String palabraRecortada = "";
            for (int i = 0 ; i < n ; i++){
                palabraRecortada += palabra.charAt(i);
            }
            palabra = palabraRecortada;
        }

        return palabra;
    }

    public static void main(String[] args){
        int numero = 5;
        String palabra = "";
        int[] numerosDePrueba = {-2,0,3,5,10};
        String[] palabrasDePrueba = {"","pan","verde","patata","hipopotamo","esternocleido"};

        if(args.length == 1 && args[0].equals("probando")){
            for(int numeroPrueba : numerosDePrueba){
                System.out.println("Para el número: " + numeroPrueba);
                for(String palabraPrueba : palabrasDePrueba){
                    System.out.println(tamaPalabra(numeroPrueba,palabraPrueba));
                }
            }
        }else if (args.length != 2){
            System.out.println("--- Número argumentos incorrecto: int - String ---");
        } else {
            numero = Integer.parseInt(args[0]);
            palabra = args[1];
            System.out.println(tamaPalabra(numero,palabra));
        }

        
    }
}