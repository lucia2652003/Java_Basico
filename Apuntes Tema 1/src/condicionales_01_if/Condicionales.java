package condicionales_01_if;

public class Condicionales {

    public static void main(String[] args) {
        //Condicionales if
        /*double estaturaJuego = 0.67;

        if (estaturaJuego >= 1.50){ //true
            System.out.println("Puedes subir al juego");
        }else{
            System.out.println("No puedes subir al juego");
        }*/

        double estatura = 1.47;
        double edad = 12;

        if (estatura >= 1.50) {
           //posibilidades
            if (estatura <= 1.95) {
                System.out.println("Puedes subir al juego");
            }else{
                System.out.println("Si bien cumples con la estatura, eres muy grande para este juego");
            }
        }else{
            if(edad <= 12){
                System.out.println("Usted no tiene la altura min. Pero puedes jugar a los juegos infantiles");
            }else{
                System.out.println("Usted no tiene la altura min. Pero puedes jugar a los juegos de adolescentes");
            }
        }
    }
}
