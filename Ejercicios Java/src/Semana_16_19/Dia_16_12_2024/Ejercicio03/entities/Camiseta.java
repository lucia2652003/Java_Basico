package Semana_16_19.Dia_16_12_2024.Ejercicio03.entities;

public class Camiseta extends Vestimenta{
    private String manga;
    private String cuello;

    public Camiseta(Integer codigo, String nombre, Float precio, String marca, Integer talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    @Override
    public void mostrarArticulo() {
        System.out.println("Esta camiseta es de manga: "+this.getManga());
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "manga='" + manga + '\'' +
                ", cuello='" + cuello + '\'' +
                '}';
    }
}
