package Semana_16_19.Dia_16_12_2024.Ejercicio03.entities;

public class Sombrero extends Vestimenta{
    private String tipo;
    private String tamano;

    public Sombrero(Integer codigo, String nombre, Float precio, String marca, Integer talla, String color, String tipo, String tamano) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public void mostrarArticulo() {
        System.out.println("Este sombrero es de tipo: "+this.getTipo());
    }

    @Override
    public String toString() {
        return "Sombrero{" +
                "tipo='" + tipo + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
