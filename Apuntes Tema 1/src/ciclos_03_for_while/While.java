package ciclos_03_for_while;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        String[] peliculas={"Iron Man","Titanic", "Interstellar","El padrino", "Matrix", "Pulp Fiction"};

        int i = 0;
        //No hay indice ni modificador
        while(i < peliculas.length){
            System.out.println(peliculas[i]);
            i++;//Modificador (i+=1)
        }
    }
}
