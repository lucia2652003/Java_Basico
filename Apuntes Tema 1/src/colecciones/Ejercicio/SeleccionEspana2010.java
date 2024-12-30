package colecciones.Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class SeleccionEspana2010 {

    public static void main(String[] args) {
        ArrayList <Jugador> jugadores = new ArrayList<>();

        jugadores.add(new Jugador("Iker Casillas","Portero",1));
        jugadores.add(new Jugador("Xavi Hernández","Mediocampista",8));
        jugadores.add(new Jugador("Andrés Iniesta","Mediocampista",6));
        jugadores.add(new Jugador("Carles Puyol","Defensa",5));
        jugadores.add(new Jugador("Sergio Ramos","Defensa",15));

        int camiseta = 6;
        for (Jugador jugador : jugadores) {
            if (jugador.getCamiseta() == camiseta) {
                System.out.println(jugador);
                break;
            }

        }
    }
}
