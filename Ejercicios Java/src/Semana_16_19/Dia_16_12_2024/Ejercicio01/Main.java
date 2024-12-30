package Semana_16_19.Dia_16_12_2024.Ejercicio01;

import Semana_16_19.Dia_16_12_2024.Ejercicio01.entities.Verdura;
/*
* Trabajando en equipos de 3 o 4 integrantes, deberán crear una clase llamada Verdura,
* que tenga los siguientes atributos: id, nombre, color, calorías, debeCocinarse
* (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
Luego, realiza las siguientes acciones:

a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras.
* Crear 5 verduras y guardarlas en el vector.

b) Recorrer el vector creado y mostrar por pantalla
* el nombre y las calorías de las verduras almacenadas.

c) Cambiar todos los datos de dos verduras.
* Mostrar por pantalla los datos de todas las verduras luego del cambio.

d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.
*
*
* */
public class Main {
    public static void main(String[] args) {

        Verdura[] verduras = new Verdura[5];

        //a.)
        verduras[0] = new Verdura(12,"lechuga","morada",123,false);
        verduras[1] = new Verdura(35, "espinaca","verde",62, true);
        verduras[2] = new Verdura(100, "guisante","verde",25,true);
        verduras[3] = new Verdura(2,"tomate","roja",64, false);
        verduras[4] = new Verdura(45, "brécol","verde",99, true);

        //b.)
        for (Verdura item : verduras) {
            System.out.println("La/El " + item.getNombre() + " tiene " + item.getCalorias() + " Kcal");
        }

        //c.)
        System.out.println("Antes : \n"+verduras[0]+"\n"+verduras[3]);

        verduras[0].setId(333);
        verduras[0].setNombre("pepino");
        verduras[0].setColor("verde");
        verduras[0].setCalorias(20);
        verduras[0].setDebeCocinarse(false);

        verduras[3].setId(55);
        verduras[3].setNombre("calabaza");
        verduras[3].setColor("naranja");
        verduras[3].setCalorias(75);
        verduras[3].setDebeCocinarse(true);

        System.out.println("Ahora : \n");
        for (Verdura value : verduras) {
            System.out.println(value);
        }
        System.out.println();
        //d.)
        for(Verdura verdura: verduras){
            if(verdura.getColor().equals("verde")){
                System.out.println(verdura);
            }
        }
    }
}
