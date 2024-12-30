package POO_propiedades;

import POO_propiedades.poo1_001_abstraccion.Auto;
import POO_propiedades.poo_003_herencia.AutoDeportivo;
import POO_propiedades.poo_004_polimorfismo.Camion;

public class main {


    public static void main(String[] args) {

        //Abstracción
        Auto autoNormal = new Auto("Toyota","corolla","negro",0);

        autoNormal.acelerar();
        autoNormal.acelerar();

        //Encapsulamiento
        autoNormal.frenar();

        //Herencia
        AutoDeportivo ferrari = new AutoDeportivo();

        ferrari.acelerar();
        ferrari.activarTurbo();
        ferrari.acelerar();

        //Polimorfismo
        Camion camion = new Camion();
        camion.acelerar();
    }
}