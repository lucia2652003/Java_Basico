package coleccion_004_abstraccion;

public class Auto extends Vehiculo   {

    private String modelo;
    private String color;

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El auto " + marca + " esta arrancando");
    }

    @Override
    public void detener() {
        System.out.println("El auto " + marca + "  esta detenido");
    }
}
