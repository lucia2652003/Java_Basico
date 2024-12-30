package Semana_9_12.Dia_11_12_2024;

import Semana_9_12.Dia_11_12_2024.entities.Electrodomestico;

/*
*
* ### Ejercicio N.º 1 - Clases y Objetos - Individual

Crear una clase llamada **Electrodoméstico**
* (sin tilde, recuerda que los nombres de clases y
* variables no llevan tilde) con los siguientes atributos:
* cod, marca, modelo, consumo y color.

Luego, realiza las siguientes acciones:

- a) Crea 3 objetos de la clase Electrodoméstico
* utilizando parámetros.

- b) Crea 1 objeto de la clase Electrodoméstico
* sin parámetros.

- c) Muestra por pantalla la
*  marca, modelo y consumo energético
* de los 3 electrodomésticos creados con parámetros.

- d) Intenta obtener la marca del electrodoméstico sin parámetros.
* ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?

* */
public class Ejercicio1 {
    public static void main(String[] args) {

        // a.)
        Electrodomestico elec1 = new Electrodomestico(1,"BOSCH","GL13JJHJJ2J",45,"blanco");
        Electrodomestico elec2 = new Electrodomestico(2,"Miele","KT567177192",120,"negro");
        Electrodomestico elec3 = new Electrodomestico(3,"Pando","PO764JHJDJJ1",63,"azul");

        // b)
        Electrodomestico nuevo = new Electrodomestico();

        // c)
        System.out.println(elec1+"\n"+elec2+"\n"+elec3);

        // d)
        System.out.println("La marca es de constructor 'nuevo' "+nuevo.getMarca());
        //Cuando ejecutamos el parametro de marca del constructor vacío se muestra null
        // porque no presenta ningún valor de momento.

    }
}
