package coleccion_004_abstraccion;

public abstract class Vehiculo {

    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    //metodo implementado
    public void limpiarParabrisas(){
        System.out.println("Limpiando parabrisas");
    }

    public abstract void arrancar();

    public abstract void detener();
}
