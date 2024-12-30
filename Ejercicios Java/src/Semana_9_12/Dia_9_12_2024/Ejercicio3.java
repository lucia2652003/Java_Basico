package Semana_9_12.Dia_9_12_2024;

import java.util.Scanner;

/*
*
* ### Ejercicio Nº 3 - Variables y Operadores - Individual

Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla..
*  Recuerda que la fórmula para calcular esto es: (base * altura) / 2
* (base por altura dividido dos).

**Pista:** _Debes declarar variables para la base y la altura del triángulo, asignarles valores y
*  luego calcular el área utilizando la fórmula._

*
* */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in); //Insertemos valores en pantalla

        // Area de triángulo => (base * altura)/2
        System.out.println("Buenas, vamos a calcular el área del triángulo \n" +
                "Introduce la base:");
        double base = t.nextDouble(); //Leer valor double, debes introducir con comas si quieres poner decimales 15,8

        System.out.println("Introduce la altura");
        double altura = t.nextDouble();

        double area = (double) (base * altura) / 2;
        System.out.println("Área del triángulo con base de "+base+" cm " +
                "\n y  altura de "+altura+" cm es de "+area+" cm^2");

        t.close();

    }
}
