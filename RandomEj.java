import java.util.Random;

public class RandomEj {
    
        public static void main(String[] args) {
    
            Random rand = new Random();
    
            int numAleatorio = rand.nextInt(10) + 1;
    
            int[] listaNumerosAleatorios = new int[numAleatorio];
    
            for(int i = 0 ; i < listaNumerosAleatorios.length ; i++){
                listaNumerosAleatorios[i] = rand.nextInt(20)+1;
            }
    
            for (int i : listaNumerosAleatorios) {
                System.out.println(i);
            }
        }
}
