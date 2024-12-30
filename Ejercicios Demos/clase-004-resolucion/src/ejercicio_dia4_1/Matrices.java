package ejercicio_dia4_1;

import java.util.Scanner;

public class Matrices {
    /*
    * filas y columnas
    * ---------------------> Filas = f i j k
    * |
    * |
    * |
    * Columna = c
    *
    * 1) variable = 22   24  23  25  27     => 0
    *               31   32  33  34  35     => 1
    *               52   58  59  57  57
    *               80   50  52  54  56
    *               40   42  45  47  47
    *
    * * 2) Sout =    22   24  23  25  27
     *               31   32  33  34  35
     *               52   58  59  57  57
     *               80   50  52  54  56
     *               40   42  45  47  47
    *
    * */

    public static void main(String[] args) {
        char[][] edades = new char[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los numeros");

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.println("Ingresa la edad para la fila " + (fila + 1) + " y la columna " + (columna + 1));
                //edades[fila][columna] = scanner.nextInt();
                edades[fila][columna]= 'O';
            }
        }

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
              //  System.out.println("Fila: " + (fila + 1) + " y la Columna: " + (columna + 1) + " tiene un valor de: " + edades[fila][columna] );
                System.out.println(" [ " + edades[fila][columna]  + " ]");
            }
        }
    }



}
