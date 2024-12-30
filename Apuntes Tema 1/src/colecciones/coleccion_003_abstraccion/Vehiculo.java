package colecciones.coleccion_003_abstraccion;

public abstract class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    //metodo implementado
    public void limpiaParabrisas(){
        System.out.println("Limpiando parabrisas");
    }


    public abstract void arrancar();
    public abstract void frenar();
}
