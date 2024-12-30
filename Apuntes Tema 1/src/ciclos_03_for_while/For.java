package ciclos_03_for_while;

public class For {

    public static void main(String[] args) {
        //Iterar en colecciones y rangos de valor (array)
        // TODO: 10/12/2024 UN CICLO CON LIMITE

        // inicio, condicion, modificador
        /*for (int i = 0; i < 5; i++){
            System.out.println("Estoy en la vuelta N: "+i);
        }*/

        String[] peliculas={"Iron Man","Titanic", "Interstellar","El padrino", "Matrix", "Pulp Fiction"};

        /*for (int i = 0; i < peliculas.length; i++) {
            System.out.println(i +" -> "+peliculas[i]);
        }*/

        // TODO: 10/12/2024 UN CICLO QUE NO IMPORTA  EL LIMITE
        for (String pelicula: peliculas) {//For each
            System.out.println(pelicula);
        }
    }

}
