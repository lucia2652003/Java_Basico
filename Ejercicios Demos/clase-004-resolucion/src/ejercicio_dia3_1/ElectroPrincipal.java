package ejercicio_dia3_1;

import ejercicio_dia3_1.entities.Electrodomestico;

public class ElectroPrincipal {


    public static void main(String[] args) {
        System.out.println("");

        // Intancias con parametros
        Electrodomestico electroPrincipal = new Electrodomestico(1,"Samsung","sd54",150.8,"Negro");
        Electrodomestico electroPrincipal1 = new Electrodomestico(23, "Bosh", "sda54", 150.8, "Blanco");
        Electrodomestico electroPrincipal2 = new Electrodomestico(23, "Antonio", "sda54", 150.8, "Rojo");

        // Intancias sin parametros
        Electrodomestico electrodomestico = new Electrodomestico();

        electroPrincipal.toString();
        electroPrincipal1.toString();
        electroPrincipal2.toString();

        // capturar info de un obj sin parametros
        System.out.println(electrodomestico);

    }
}
