package tiposDeDatosReferencia;

import tiposDeDatosReferencia.persona.Persona;

public class Referencia {

    public static void main(String[] args) {
        String nombre = "Juan perez";

       // System.out.println("Cuantas letras tiene la variable : " + nombre.length());

        //Clase personalizada
        Persona persona = new Persona("Ana", 35);

        System.out.println("El nombre es:"+ persona.nombre);
    }
}
