package coleccion_002_map;

import coleccion_001_list.User;

import java.util.HashMap;
import java.util.Map;

public class MapasTren {

    public static void main(String[] args) {

        //          Cualquier tipo de datos que se te ocurra
        Map<Integer, String> tren = new HashMap<>();

        //52 => d45fg54ggfg45d45d45g45g45d45d
        tren.put(52, "Libros");
        tren.put(1, "Juego de mesa");
        tren.put(14, "Telefono");
        tren.put(14, "ropa");

        Integer vagon = 14;


        System.out.println("Contido del vagon numero " + vagon + " es un " + tren.get(vagon));

/*        tren.values()
                .stream()
                .forEach(valor -> System.out.println(valor));*/


    }
}
