import interfaces.Combustion;

public class Camioneta extends Vehiculo implements Combustion  {

    private  Integer capacidadTanque;
    private double consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(Integer id, String placa, String marca, String modelo, Integer annio, double costo, Integer capacidadtanque, double consumoCombustible) {
        super(id, placa, marca, modelo, annio, costo);
        this.capacidadTanque = capacidadtanque;
        this.consumoCombustible = consumoCombustible;
    }

    public Integer getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(Integer capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int calcularAntiguedad() {
        Integer annioActual = 2024;
        return annioActual - super.annio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible hasta " + this.capacidadTanque +" Listros.");
    }
}
