public abstract class Vehiculo {

    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    protected Integer annio;
    private double costo;

    public Vehiculo() {
    }

    public Vehiculo(Integer id, String placa, String marca, String modelo, Integer annio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.costo = costo;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnnio() {
        return annio;
    }

    public void setAnnio(Integer annio) {
        this.annio = annio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Por lo menos 1 que sea abstracto
    public abstract int calcularAntiguedad();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", annio=" + annio +
                ", costo=" + costo +
                '}';
    }
}
