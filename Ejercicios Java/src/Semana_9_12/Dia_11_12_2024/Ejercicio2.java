package Semana_9_12.Dia_11_12_2024;

import Semana_9_12.Dia_11_12_2024.entities.Persona;

/*
*
* ### Ejercicio Nº 2 - POO - Individual
*
* Crear una clase **Persona**, que tenga los siguientes
* atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos,
* constructores y métodos getters y setters).

- a) Crear un vector de tipo **Persona** cinco posiciones.
* Crear cinco personas y guardarlas en él.

- b) Recorrer el vector creado y mostrar por
* pantalla el nombre y edad de cada persona almacenada.

- c) Cambiar el nombre de dos personas.
* Mostrar por pantalla el antes,
* realizar el cambio
* y luego mostrar el después de los datos
* de las dos personas cuyos nombres fueron cambiados.

- d) Recorrer el vector y
* mostrar por pantalla únicamente a las personas
* cuya edad sea mayor de 30 años.

*
* */
public class Ejercicio2 {
    public static void main(String[] args)  {
        //a)
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1,"Lucía",21,"Rúa Peneireiro",609568352);
        personas[1] = new Persona(2,"Mina",12,"Plaza Lugo",638027166);
        personas[2] = new Persona(3,"Jose",65,"Avenida Oza",605452819);
        personas[3] = new Persona(4,"Nori",32,"Plaza Madrid",321257486);
        personas[4] = new Persona(5,"Via",45,"Cuatro Caminos",262251588);

         //b)
       /* for (Persona per : personas) {
            System.out.println(per);
        }// fin for
        System.out.println();*/

        //c)

      /*  System.out.println("Nombres de Antes: \n" +
                ""+personas[0].getNombre()
                +" \n "+personas[2].getNombre());

        personas[0].setNombre("Paolo");
        personas[2].setNombre("Lola");

        System.out.println("Nombres de Antes: \n" +
                ""+personas[0].getNombre()+
                " \n "+personas[2].getNombre());
        */

        //d)
       /* System.out.println("Los mayores de edad de 30 años");
        for (int j = 0; j < personas.length; j++) {
            if(personas[j].getEdad() > 30) System.out.println(personas[j]);

        }// fin for*/
    }
}
