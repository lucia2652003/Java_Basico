package claseScanner;

import java.util.Scanner;

public class LecturaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // Creamos una instancia de scanner

        System.out.println("Dame tu nombre completo");

        String nombre = scanner.nextLine();

        System.out.println("Hola como estas " + nombre);

        System.out.println("Ahora dame tu edad");

        int edad = scanner.nextInt();           // leemos un numero entero

        System.out.println("Tienes " + edad + " años");

        scanner.close();                                // optativo



    }
}
