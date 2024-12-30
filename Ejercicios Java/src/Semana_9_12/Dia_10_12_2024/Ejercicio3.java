package Semana_9_12.Dia_10_12_2024;

/*
*
*### Ejercicio N.º 3 - Arreglos: Vectores - Individual

Una web de meteorología necesita de un programa que, al ingresar
* las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

  Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente
* temperatura máxima de cada día. Una vez almacenadas las temperaturas,
* deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.

*
* */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Calculamos el promedio");
        //Declaración
        int [] temperaturas = new int[7];
        int suma = 0; //Acumulador de temperaturas

        //Asignación de las temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce la "+(i+1)+" temperatura:");
            int temp = t.nextInt();
            temperaturas[i] = temp; //Almacena la variable
            suma += temp; // suma = suma + temp
        }// fin for

        System.out.println("El promedio es "+(double)suma / temperaturas.length);
        t.close();
    }
}
