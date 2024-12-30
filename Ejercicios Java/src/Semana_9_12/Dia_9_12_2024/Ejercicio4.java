package Semana_9_12.Dia_9_12_2024;


import java.util.Scanner;

/*
*
* ### Ejercicio Nº 4 - Operaciones de Lectura - Grupal

Crea un programa que pida al usuario que ingrese por teclado dos números enteros y
* realice las siguientes operaciones con ellos: suma, resta, multiplicación y división.
* Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

- **Sugerencia:** Compara los resultados que obtengas con otros compañeros.
* Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.


**Extra:** ¿Qué sucede si como segundo número de una división se ingresa 0?
* Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?

* */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Vamos a realizar operaciones con dos valores " +
                "\n Introduce el primer valor");
        int primer = t.nextInt();

        System.out.println("Introduce el segundo");
        int segundo = t.nextInt();

        int suma = primer + segundo;
        int resta = primer - segundo;
        int multi = primer * segundo;
        double dividir = (double) primer / primer;

        System.out.println(" Suma de "+primer+" y "+segundo+":  "+suma+
                "\n Resta de "+primer+" y "+segundo+": "+resta+
                "\n Multiplicación de "+primer+" y "+segundo+": "+multi);

        if(segundo != 0){
            System.out.println("División de "+segundo+" y "+primer+": "+dividir);
        }else{
            System.out.println("No puede dividir entre 0");
        }

        t.close();
        /* Cuando introducimos en el segundo valor un 0 me muestra un error que
           no se puede dividir entre cero porque está colocado
           el segundo valor como divisor y se detiene el programa (int dividir = primer / segundo);

           Y si ponemos la operación de la división como double mostrar Infinity.
             double dividir = (double) primer / segundo;

           Para solucionarlo podemos poner al revés los valores,
           de esta manera no se rompe o condicion de que si el segundo valor es 0 muestre un mensaje que no
           puede dividir entre 0.
             double dividir = (double) segundo / primer;

         */
    }
}
