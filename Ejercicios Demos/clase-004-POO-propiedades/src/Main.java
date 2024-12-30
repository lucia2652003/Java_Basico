import poo_001_abstraccion.Auto;
import poo_003_herencia.AutoDeportivo;
import poo_004_polimorfismo.Camion;

public class Main {

    public static void main(String[] args) {

        // TODO: 16/12/2024 abstraccion
        Auto autoNormal = new Auto("toyota", "corolla", "negro", 0);

       /* autoNormal.acelerar();
        autoNormal.acelerar();*/

        // TODO: 16/12/2024 Encapsulamiento
       /* autoNormal.frenar();*/

        // TODO: 16/12/2024 Herencia
        AutoDeportivo ferrari = new AutoDeportivo();

        /*ferrari.acelerar();
        ferrari.activarTurbo();
        ferrari.acelerar();
        ferrari.frenar();*/

        // TODO: 16/12/2024 Polimorfismo
        Camion camion = new Camion();
        camion.acelerar();


    }
}