package ciclos_03_for_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int numeroIngresado;

        do {
            System.out.println("Ingresa un nº mayor a 0");
            numeroIngresado = t.nextInt();
        }while(numeroIngresado >= 0);

        System.out.println("Has ingresado un numero negativo "+numeroIngresado);
    }
}
