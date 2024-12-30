package Semana_16_19.Dia_16_12_2024.Ejercicio02.entities;

public class Reptil extends Animal{
    Integer longitud;
    String escamas;
    String veneno;
    String habitat;

    public Reptil() {
    }

    public Reptil(Integer id, String nombre, Integer edad, String piel, String alimentacion, Integer longitud, String escamas, String veneno, String habitat) {
        super(id, nombre, edad, piel, alimentacion);
        this.longitud = longitud;
        this.escamas = escamas;
        this.veneno = veneno;
        this.habitat = habitat;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }

    public String getVeneno() {
        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un réptil");
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "longitud=" + longitud +
                ", escamas='" + escamas + '\'' +
                ", veneno='" + veneno + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
