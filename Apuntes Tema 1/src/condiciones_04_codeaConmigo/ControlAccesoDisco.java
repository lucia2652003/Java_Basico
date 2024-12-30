package condiciones_04_codeaConmigo;

import java.util.Scanner;
/*
 Consigna: Vamos a la Discoteca
Crear un programa en Java que simule el control de acceso a una fiesta.
El programa debe solicitar al usuario su edad mediante la terminal. A continuación, debe determinar si el usuario
puede ingresar a la fiesta según las siguientes reglas:

Sí son mayores de edad: Pueden ingresar sin restricciones.
Entre 16 y 18 años: Pueden ingresar acompañados por un adulto.
Menores de 16 años: No pueden ingresar.

El programa debe mostrar un mensaje claro indicando si el usuario puede o no acceder a la fiesta.
:advertencia: Ten en cuenta esta restricción: Si el usuario ingresa un número menos a 1 o mayor a
100 pídele de nuevo que ingrese el número con un while.
* */
public class ControlAccesoDisco {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce tu edad (1 a 100)");
        int edad = t.nextInt();

        while(edad < 1 || edad > 100){// Edad inválida
            System.out.println("Edad inválida. Vuelve a introducir (1 a 100)");
            edad = t.nextInt();
        } // fin while

        //Comprobación de las edades
        if(edad < 16){
            System.out.println("No puedes ingresar");
        }else if(edad >= 18){
            System.out.println("Puedes ingresar a  la fiesta");
        }else{ // edad >= 16 && edad < 18
            System.out.println("Puedes ingresar acompañado de un adulto");
        }

        t.close(); //Cerrar el scanner (opcional)
    }
}
