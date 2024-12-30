package ejercicio_dia2_2;

import java.util.Scanner;

public class CarritoCompra {

    public static void main(String[] args) {
        Boolean continuar = false;
        Double total = 0.0;
        Double precioProducto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, recuerde que si ingresa un 0 o algun numero negativo termina la compra");

        while (!continuar){
            System.out.println("Ingrese el precio de un producto");
            precioProducto = scanner.nextDouble();

            if (precioProducto > 0)   total = total + precioProducto;
                else continuar = true;

        }

        System.out.println("El total de su compra es : " + total);
    }
}
