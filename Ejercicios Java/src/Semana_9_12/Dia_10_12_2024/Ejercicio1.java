package Semana_9_12.Dia_10_12_2024;

/*
*
* ### Ejercicio Nº 1 - Estructuras Condicionales - Individual
*
 **a)** Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
  a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
  El programa debe mostrar (según cada caso) un mensaje informando la situación.

*
* */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Para participar en el recital debes cumplir si eres mayor de edad (+18) \n" +
                "Por favor, introduce tu edad: ");
        int edad = t.nextInt();

        if (edad >=18) {
            System.out.println("Tienes acceso al recital");
        }else{
            System.out.println("No puedes participar en el recital");
        }

       /* // 2 FORMA
        if(t.nextInt() >= 18)System.out.println("Tienes acceso al recital");
        else  System.out.println("No puedes participar en el recital");*/

        t.close();
    }
}
