package ciclos_03_for_while;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        // TODO: 10/12/2024 pedir al scanner para ingresar datos

        Scanner scanner = new Scanner(System.in);

        int numeroIngresado;

        do {
            System.out.println("Ingresa un numero mayor a 0");
            numeroIngresado = scanner.nextInt();

        }while (numeroIngresado >= 0);


        System.out.println("Has ingresado un numero negativo " + numeroIngresado);


    }
}
