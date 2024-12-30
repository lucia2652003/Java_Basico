package ejercicio_dia1_4;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");

        Integer numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor");
        Integer numero2 = scanner.nextInt();

        System.out.println("Suma: de " + numero1 + " + " +numero2 + " = " + (numero1 + numero2));

        System.out.println("Resta: de " + numero1 + " - " +numero2 + " = " + (numero1 - numero2));

        System.out.println("Multiplicacion: de " + numero1 + " x " +numero2 + " = " + (numero1 * numero2));

        if (numero2 != 0){
            System.out.println("Div: de " + numero1 + " / " +numero2 + " = " + (numero1 / numero2));
        }else{
            System.out.println("No puedes div por 0");
        }


    }
}
