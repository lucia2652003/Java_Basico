package ejercicio_dia3_2;

import ejercicio_dia3_2.entities.Persona;

public class PersonaPrincipal {

    public static void main(String[] args) {
        Persona[] personaVector = new Persona[5];

        //crear 5 personas
        personaVector[0] = new Persona(1, "Antonio",41, "Direccion1", "654387690");
        personaVector[1]  = new Persona(2, "Alberto", 30,"Direccion2", "654321876");
        personaVector[2]  = new Persona(3, "Jose Carlos", 20,"Direccion3", "643219876");
        personaVector[3]  = new Persona(4, "Victor", 50,"Direccion4", "632098765");
        personaVector[4]  = new Persona(5, "Laura", 25,"Direccion5", "698765432");

       /* for (Persona persona: personaVector ) {
            System.err.println("Nombre: " + persona.getNombre() + " y su edad es: " + persona.getEdad());
        }*/

        /*System.out.println("Antes: " + personaVector[0].getNombre());
        personaVector[0].setNombre("Antonio David");
        System.out.println("Ahora: " + personaVector[0].getNombre());

        System.out.println("Antes: " + personaVector[2].getNombre());
        personaVector[2].setNombre("Juan Carlos");
        System.out.println("Ahora: " + personaVector[2].getNombre());*/

        for (Persona persona: personaVector ) {
            if (persona.getEdad() > 30)  System.err.println("Nombre: " + persona.getNombre() + " y su edad es: " + persona.getEdad());
        }

      }
}
