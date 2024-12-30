package ejercicio_dia1_3;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double base;
        Double altura;

        System.out.println("Ingrese la base del triangulo");
        base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triangulo");
        altura = scanner.nextDouble();

        Double area = (base * altura)/ 2;

        System.out.println("El area del triangulo es: " + area);

        scanner.close();
    }
}
