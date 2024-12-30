package coleccion_003_codeaConmigo;

import java.util.ArrayList;

public class Seleccion {

    public static void main(String[] args) {

        ArrayList<Jugador> jugadores = new ArrayList<>();

        // creamos a los Jugadores
        Jugador casillas = new Jugador("Iker", "portero", 1);
        Jugador xaviH = new Jugador("xavi Hernandez", "medio", 8);
        Jugador iniesta = new Jugador("Iniesta", "medio", 6);
        Jugador puyol = new Jugador("Puyol", "defensa", 5);
        Jugador ramos = new Jugador("Ramos", "defensa", 15);

        //Agregar
        jugadores.add(casillas);
        jugadores.add(xaviH);
        jugadores.add(iniesta);
        jugadores.add(puyol);
        jugadores.add(ramos);

        //Buscar jugador
        int numeroBuscar = 6;

        for (Jugador jugador: jugadores) {
           if (jugador.getCamiseta() == numeroBuscar){
               System.out.println(jugador);
               break;
           }
        }



    }
}
