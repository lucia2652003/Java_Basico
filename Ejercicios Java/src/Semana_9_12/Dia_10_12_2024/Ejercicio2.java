package Semana_9_12.Dia_10_12_2024;

import java.util.Scanner;

/*
* ### Ejercicio Nº 2 - Estructuras Repetitivas - Individual

**a)** Imagina que eres un cajero en un supermercado.
* Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.

Utiliza una estructura repetitiva (la que quieras) para continuar
* pidiendo precios hasta que el usuario decida finalizar.
* Luego, muestra el total de la compra que debe abonar.

**Pista:** _Recuerda que existen dos tipos de bucles,
* los controlados por un contador (cuando sabemos un número exacto de productos por ejemplo)
* o por centinela (cuando no sabemos cuántos productos va a comprar el cliente).
* En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se ingresa un
* número negativo o un 0 como monto de un producto._

*
* */
public class Ejercicio2 {

    /*
    * Productos que hay en la tienda:
    * 1. Carne -> 15.30 €
    * 2. Bebida -> 1.20 €
    * 3. Pescado -> 18.30 €
    * 4. Postre -> 5.40 €
    * 5. Verdura -> 3.20 €
    * */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Bienvenido al mercado");

        float importe = 0;
        String msg = """
                Lista de productos: \
                
                  1. Carne -> 15.30 €
                    2. Bebida -> 1.20 €
                    3. Pescado -> 18.30 €
                    4. Postre -> 5.40 €
                    5. Verdura -> 3.20 €\s
                 ¿Qué productos quieres comprar? (Pulsa 0 para finalizar)""";
        System.out.println(msg);
        int opcion =t.nextInt();

        while(!(opcion <= 0)){//Mientras que no se cumpla la condición, si no introducimos número negativos o 0
            String anhadido = "";
            switch (opcion){
                case 1:
                    importe = importe + 15.30F; // importe += 15.30F;
                    anhadido += "Producto añadido";
                    break;
                case 2:
                    importe = importe + 1.20F;
                    anhadido += "Producto añadido";
                    break;
                case 3:
                    importe = importe + 18.30F;
                    anhadido += "Producto añadido";
                    break;
                case 4:
                    importe = importe + 5.40F;
                    anhadido += "Producto añadido";
                    break;
                case 5:
                    importe = importe + 3.20F;
                    anhadido += "Producto añadido";
                    break;
                default:
                    anhadido = anhadido + null;
                    System.out.println("Dato inválido. Debes introducir números de 1 a 4");
                    break;
            }// fin del switch

            System.out.println(anhadido);
            System.out.println(msg);
            opcion = t.nextInt();

        }// fin del while

        System.out.println("Finalizado la compra.\n El importe que debe pagar es de "+importe+" €");
        t.close();
    }
}
