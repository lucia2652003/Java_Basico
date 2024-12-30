package vector_matrices_05_arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        //Declaración e inicialización de una matriz de edades

        int[][] edades = new int[4][4];

        //Asignar variables en la matriz
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce las edades para la matriz de 4x4");
        for (int fila = 0; fila < 4; fila++) { //Recorre las filas
            for(int columna = 0; columna < 4; columna++){ //Recorre las columnas
                System.out.println("Ingresa la edad la fila: "+(fila+1)+", columna "+(columna+1));
                edades[fila][columna] = t.nextInt();

            }// fin for
        }// fin for

        //Imprimir los valores de matriz
        for (int fila = 0; fila < 4; fila++) { //Recorre las filas
            for(int columna = 0; columna < 4; columna++){ //Recorre las columnas
                System.out.println("Estoy en la fila "+(fila+1)+", columna "+(columna+1)+": "+edades[fila][columna]);
            }// fin for
        }// fin for
    }
}
