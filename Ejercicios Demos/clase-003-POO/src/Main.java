import entitities.Auto;

public class Main {

    /*
    *
    *   // HolaComoEstas    PascalCase      Clases
        // holaComoEstas    camelCase       atributos
        // hola_como_estas  snake_case      nombre de las columans de la DB
    * */

    public static void main(String[] args) {

        //Instancia vacia
        Auto autoVacio = new Auto();

        autoVacio.setColor("Rojo");
        autoVacio.setMarca("Ford");
        autoVacio.setVelocidad(200);

        System.err.println(autoVacio.getMarca().toString());


        //Instancia con todos los atributos
        Auto autoLleno = new Auto("verde", "ferrari", 300);

        String capturarValorDeColor = autoLleno.getColor();
        System.err.println(autoLleno.getColor());

        //Quiero crear un metodo que duplique la velocidad del auto y que
        // me de un mensaje diciendo "Usted ahora va a 400km/h"
        System.out.println( autoLleno.acelerarAfondo() ); //600

        System.out.println(autoLleno.frenarUnPoco(115));

        System.out.println(autoLleno.getVelocidad());
    }
}