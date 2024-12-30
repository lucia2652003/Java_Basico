package ejercicio_dia2_1;

import java.util.Scanner;

public class MayorEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        Integer edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }

        /*if (scanner.nextInt() >= 18)  System.out.println("Puede ingresar");
                else System.out.println("No puedes");*/

    }
}
