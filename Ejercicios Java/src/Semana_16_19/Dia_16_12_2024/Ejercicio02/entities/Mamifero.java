package Semana_16_19.Dia_16_12_2024.Ejercicio02.entities;

public class Mamifero extends Animal{
    private Integer patas;
    private String reproduccion;
    private String pelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(Integer id, String nombre, Integer edad, String piel, String alimentacion, Integer patas, String reproduccion, String pelaje, String habitat) {
        super(id, nombre, edad, piel, alimentacion);
        this.patas = patas;
        this.reproduccion = reproduccion;
        this.pelaje = pelaje;
        this.habitat = habitat;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero");
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "patas=" + patas +
                ", reproduccion='" + reproduccion + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
