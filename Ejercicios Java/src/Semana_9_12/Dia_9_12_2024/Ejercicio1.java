package Semana_9_12.Dia_9_12_2024;

import java.util.Scanner;

/*
* Ejercicio N.º 1 - Sintaxis básica - Individual
*
* a) Escribir un programa en Java que muestre por pantalla un mensaje de
* Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
*
* b) Una vez logrado esta primera parte, permitir que se almacene el nombre
* del usuario en una variable y se muestre el mismo en el mensaje.
* Por ejemplo: “Hola Eduardo, bienvenido al sistema”.

* */
public class Ejercicio1 {
    public static void main(String[] args) {
        // a.)
        System.out.println("Hola, bienvenido al sistema");

        // b)
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce tu nombre :");
        String nombre = t.nextLine();

        System.out.println("Hola "+nombre+", bienvenido al sistema");
        t.close();
    }
}
