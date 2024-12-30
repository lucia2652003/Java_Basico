package POO;

import POO.poo_001_clases.Coche;

public class Main {
    public static void main(String[] args) {

        //Instancia con todos los atributos
        Coche c1 = new Coche("Ferrari","Verde",300);

        String capturaValorDeColor = c1.getColor();
        System.out.println(capturaValorDeColor);

        //Nuevos métodos
        System.out.println(c1.acelerarAfondo());
        System.out.println(c1.frenarUnPoco(115));

        Coche c2 = new Coche(); //Instancia vacío
        c2.setMarca("Ford");
        c2.setColor("Rojo");
        c2.setVelocidad(200);

        c2.acelerarAfondo();
        System.out.println(c2);

    }
}
