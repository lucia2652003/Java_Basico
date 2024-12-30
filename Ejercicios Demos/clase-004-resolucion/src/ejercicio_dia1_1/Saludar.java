package ejercicio_dia1_1;

import java.util.Scanner;

public class Saludar {

    public static void main(String[] args) {
        System.out.println("Hola bienvenidos al Sitemas, dame tu nombre");
        Scanner scanner = new Scanner(System.in);
        String capturarInfo = scanner.nextLine();

        System.out.println("Hola, " + capturarInfo + " bienvenidos al Sitemas");

    }
}
