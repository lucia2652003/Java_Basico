package entities;

public class Ave extends Animal{

    private double envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave() {
    }

    public Ave(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "envergaduraAlas=" + envergaduraAlas +
                ", tipoVuelo='" + tipoVuelo + '\'' +
                ", colorPlumaje='" + colorPlumaje + '\'' +
                ", tipoPico='" + tipoPico + '\'' +
                '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }
}
