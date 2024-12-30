package ejercicio_dia2_3;

import java.util.Scanner;

public class Meteorologia {

    public static void main(String[] args) {
        Double[] temperaturas = new Double[7];
        Scanner scanner = new Scanner(System.in);
        Double sumaTemp = 0.0;
        Double promTemp = 0.0;

        for (int i = 0; i < temperaturas.length ; i++) {
            System.out.println("Ingrese la temp. del dia N"+ (i +1));
            temperaturas[i] = scanner.nextDouble();
        }

        System.out.println("Estamos calculando el promedio");

        for (int i = 0; i < temperaturas.length ; i++) {
            sumaTemp = sumaTemp + temperaturas[i];
        }
        promTemp = sumaTemp / temperaturas.length;

        System.out.println("El promedio de las temps de la semana es: " + promTemp);

        scanner.close();
    }
}
