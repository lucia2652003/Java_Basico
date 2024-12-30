package vector_matrices_05_arreglos;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        // Declaracion e inicializacion de una matriz de edades

        int[][] edades = new int[4][4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las edades para la matriz de 4x4");


        //es insertar los datos
        for (int fila = 0; fila < 4; fila++){ // recorrer las filas

            for (int columna = 0; columna < 4; columna++){ // recorrer las filas
                System.out.println("Ingresa la edad de la fila: " + ( fila + 1) + ", columna: " + (columna + 1));
                edades[fila][columna] = scanner.nextInt();
            }
        }




        //imprimir
        for (int fila = 0; fila < 4; fila++){ // recorrer las filas

            for (int columna = 0; columna < 4; columna++){ // recorrer las filas
                System.out.println("Estoy en la fila: " + ( fila + 1) + ", columna: " + (columna + 1) + " y su valor es " + edades[fila][columna]);

            }
        }



    }
}
