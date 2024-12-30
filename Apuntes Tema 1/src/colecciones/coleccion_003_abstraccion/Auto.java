package colecciones.coleccion_003_abstraccion;

public class Auto extends Vehiculo{

    private String modelo;
    private String color;

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El auto "+this.marca+" esta encendido");
    }

    @Override
    public void frenar() {
        System.out.println("El auto "+this.marca+" esta detenido");
    }
}
