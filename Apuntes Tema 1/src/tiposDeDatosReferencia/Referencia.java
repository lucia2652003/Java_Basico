package tiposDeDatosReferencia;


import tiposDeDatosReferencia.persona.Persona;

public class Referencia {

    public static void main(String[] args){
        String nombre = "Lucía Blanco";

       // System.out.println("Mi nombre es: "+nombre);

        //Clase Personalizada
        Persona p1 = new Persona("Alvaro",25);
        System.out.println("El nombre es: "+p1.nombre);
    }
}
