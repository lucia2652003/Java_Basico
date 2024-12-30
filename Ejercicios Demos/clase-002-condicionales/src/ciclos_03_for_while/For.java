package ciclos_03_for_while;

public class For {


    public static void main(String[] args) {
        // TODO: 10/12/2024 UN CICLO CON LIMITES

    /*    String nombre = "Brian";             // scope global

        // inicio; condicion; modificador
        for (int i = 0; i < 5; i++){
            System.out.println("Estoy en la vuelta N " + i);
        }*/

        String[] peliculas = { "El padrino", "Matrix" , "Interstellar" , "Pulp Fiction"};

        /*for ( int i = 0; i < peliculas.length ; i++ ){ // scope local
            System.out.println(peliculas[i]);
           // System.out.println(peliculas[5]);       // no se deberia hacer
        }*/


        // TODO: 10/12/2024 UN CICLO QUE NO ME IMPORTA EL LIMITE

        for (String pelicula : peliculas  ) {
            System.out.println(pelicula);
        }

    }


}
