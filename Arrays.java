import java.util.Scanner;
import java.util.ArrayList;

public class Arrays {

    //Funciones

    public static void imprimirArray (String[] lista){
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    public static void imprimirArrayInt (int[] lista){

        for (int elemento : lista) {
            System.out.println(elemento);
        }
    }
    public static void imprimirArrayChar (char[] lista){

        for (char elemento : lista) {
            System.out.println(elemento);
        }
    }
    
    public static void main(String[] args) {

            //Arrays dinamicas

        String color;

        ArrayList<String> arraycolores = new ArrayList<String>();
        ArrayList<String> arraycolores2 = arraycolores;

        //El tamaño de la lista
        System.out.println("La lista tiene " + arraycolores.size() + " elementos");

        arraycolores.add("azul");
        arraycolores.add("verde");
        arraycolores.add("amarillo");
        arraycolores.add("rojo");
        arraycolores.add("blanco");
        arraycolores.add("negro");

        //como cambiar un valor concreto en listas dinamicas
        arraycolores.set(2,"4m4r1ll0");

        //Vamos a borrar
        arraycolores.remove(1);

        //Vamos a borrar todo
        arraycolores.clear();

        System.out.println(arraycolores);
        System.out.println(arraycolores2);

        //Coger una posicion concreta con una dinamica
        color = arraycolores.get(0);
        System.out.println(color);

            //Arrays estaticas

        String[] colores = {"azul","amarillo","rojo","verde"};// para mostrarlas por pantalla, hay que usar un for

        //El tamaño de la lista
        System.out.println("La lista tiene " + colores.length + " elementos");


        System.out.println("Imprimo colores: \n");

        colores[1] = "4m4r1ll0";
        color =  colores[0];

        imprimirArray(colores);

        int[] numero = {1,2,3,4,5};
        imprimirArrayInt(numero);

        char[] letra = {'a','b','c','d'};
        imprimirArrayChar(letra);

        int[] numeros; //Se pone así
        numeros = new int[10];

        char[] letras = new char[10]; //Se declara y luego se crea
       
    }
}
