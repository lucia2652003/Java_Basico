package claseScanner;

import java.util.Scanner;

public class LeccionScanner {
    public static void main(String[] args){

        Scanner t = new Scanner(System.in); //Creamos una instancia de scanner

        /*System.out.println("Introduce tu nombre completo");
        String nombre = t.nextLine();

        System.out.println(nombre);*/

        System.out.println("Introduce tu edad");
        int edad = t.nextInt();//Introducir numero

        System.out.println("Tienes "+edad+" años");




        t.close();   //optativa
    }
}
