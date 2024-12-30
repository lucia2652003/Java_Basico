package Semana_16_19.Dia_16_12_2024.Ejercicio02.entities;

public class Ave extends Animal{
    private Float envergadura;
    private String vuelo;
    private String colorPluma;
    private String pico;


    public Ave(){
    }

    public Ave(Integer id, String nombre, Integer edad, String piel, String alimentacion, Float envergadura, String vuelo, String colorPluma, String pico) {
        super(id, nombre, edad, piel, alimentacion);
        this.envergadura = envergadura;
        this.vuelo = vuelo;
        this.colorPluma = colorPluma;
        this.pico = pico;
    }

    public Float getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Float envergadura) {
        this.envergadura = envergadura;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getColorPluma() {
        return colorPluma;
    }

    public void setColorPluma(String colorPluma) {
        this.colorPluma = colorPluma;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }

    @Override
    public String toString() {
        return "Ave{" +
                "envergadura=" + envergadura +
                ", vuelo='" + vuelo + '\'' +
                ", colorPluma='" + colorPluma + '\'' +
                ", pico='" + pico + '\'' +
                '}';
    }
}
