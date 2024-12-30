import interfaces.Electrico;

public class Auto extends Vehiculo implements Electrico {

    private Integer capacidadBateria;
    private Integer autonomia;

    public Auto() {
    }

    public Auto(Integer id, String placa, String marca, String modelo, Integer annio, double costo, Integer capacidadBateria, Integer autonomia) {
        super(id, placa, marca, modelo, annio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad() {
        Integer annioActual = 2024;
        return annioActual - super.annio;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("cargando la energia hasta el " + this.capacidadBateria + " mAh.");
    }
}
