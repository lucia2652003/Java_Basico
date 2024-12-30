package Semana_9_12.Dia_10_12_2024;

/*
*
* ### Ejercicio Nº 4 - Matrices

Imagina que estás trabajando en un sistema de reservas de asientos para un teatro.
* Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5
* y ten en cuenta lo siguiente:

- Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

- Permite al usuario ingresar por teclado donde quiere sentarse,
*  indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
* El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

- Si el asiento elegido por el usuario está ocupado,
* el sistema debe informar que elija otro diferente.

- A medida que los asientos se ocupen, el programa debe actualizar el mapa de
* asientos y mostrarlo por pantalla luego de cada reserva.

- Intenta hacer pruebas con otros compañeros, imagina que ellos son los
* compradores y tú el encargado del teatro.
* ¿Funciona para todos los casos? ¿Encontraste errores que resolver?
* ¿Considera tu programa los asientos ya reservados?

- El sistema deberá seguir corriendo hasta que el encargado de cargar
* las reservas de los asientos determine que ha finalizado.

    **Pista:** Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
*
* */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        char[][] teatro = new char[5][5];
        //Los array y matrices empiezan en la posición 0 como 1.
        Scanner t = new Scanner(System.in);

        //Todos los asientos vacíos
        for (int fila = 0; fila < teatro.length; fila++) {
            for (int asientos = 0; asientos < teatro[0].length; asientos++) {
                teatro[fila][asientos] = 'O';
            }// fin for números de asientos
        }// fin for filas

        int fl , n_asiento, eleccion = 0;
        System.out.println("Bienvenido al teatro. Los asientos están enumeradas y limitadas. " +
                "Son de 5 filas. \n Por favor reserve su entrada");
        do{
            System.out.println("Te muestro el plano de los asientos (O -> Vacíos y X -> Ocupados)");

            dibujarMapa(teatro);

            System.out.println("Introduce la fila que quieres estar. Entre 1 y 5:");
            fl = t.nextInt() - 1; //Para que se coloque en la posición
            System.out.println("Introduce el asiento que quieres sentar. Entre 1 y 5:");
            n_asiento = t.nextInt() -1;

            //Comprobar si están en ese rango
            if(fl >= 1 && fl <= 5){
                //Comprobar asientos libres
                if(teatro[fl][n_asiento] == 'O'){//Ese asiento está vacío
                    teatro[fl][n_asiento] = 'X';
                    System.out.println("Este asiento esta libre. Que disfrute del espectáculo");
                    //Preguntar al encargado
                    System.out.println("¿Esta es ha sido la última compra? (Pulsa -1 para finalizar o seguir con otro numero)");
                    eleccion = t.nextInt();
                }else{
                    System.out.println("Este asiento esta ocupado. Debes escoger otro");
                }
            }else{
                System.out.println("Lo siento mucho. Esa fila no se encuentra");
            }

        }while(eleccion != -1); // fin do {...} while()

        System.out.println("Ya no hay reservas. Se han agotados");
        t.close();
    }

    public static void dibujarMapa(char[][] teatro){ //Representación gráfica de los asientos
        for (int fila = 0; fila < teatro.length; fila++) {
            System.out.print("Fila "+(fila+1)+": ");
            for (int asientos = 0; asientos < teatro[fila].length; asientos++) {
                System.out.print(teatro[fila][asientos]+" ");
            }// fin for números de asientos
            System.out.println();
        }// fin for filas
    }
}
