import interfaces.Combustion;

public class Moto extends Vehiculo implements Combustion {

    private Integer cilindrada;
    private String tipomotor;

    public Moto() {
    }

    public Moto(Integer id, String placa, String marca, String modelo, Integer annio, double costo, Integer cilindrada, String tipomotor) {
        super(id, placa, marca, modelo, annio, costo);
        this.cilindrada = cilindrada;
        this.tipomotor = tipomotor;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }

    @Override
    public int calcularAntiguedad() {
        Integer annioActual = 2024;
        return annioActual - super.annio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible hasta de la moto con cilindrada " + this.cilindrada);

    }
}
