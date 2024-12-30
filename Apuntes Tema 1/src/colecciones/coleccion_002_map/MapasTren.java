package colecciones.coleccion_002_map;

import java.util.HashMap;
import java.util.Map;

public class MapasTren {

    public static void main(String[] args) {
        Map <Integer, String> tren = new HashMap<>();

        // 52 => ajshakjaljdlsjdlksjalksj
        tren.put(52, "Libros");
        tren.put(1, "Juego de mesa");
        tren.put(14, "Telefono");

        //Obtener un elemento
        System.out.println(tren.get(52));


        //Recorrer elementos
        for (int i = 0; i < tren.size(); i++) {
            System.out.println(tren.get(i));
        }

    }
}
