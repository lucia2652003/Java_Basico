package colecciones.coleccion_004_interfaz;


public class Perro implements Animal, OtraInterfaz {

    public Perro() {
    }

    @Override
    public String hacerSonido() {
        String msj = "Guau";
        return msj;
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre y juega");
    }

    @Override
    public void saludar() {

    }

    @Override
    public void saludarPata() {

    }

    @Override
    public void saludarLengua() {

    }
}