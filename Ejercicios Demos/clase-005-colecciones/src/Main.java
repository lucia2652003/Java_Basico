import coleccion_004_abstraccion.Auto;
import coleccion_005_interfaces.Perro;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("Ferrari");
        auto.arrancar();
        auto.detener();

        Perro perro = new Perro();

        perro.hacerSonido();
        perro.moverse();


    }
}