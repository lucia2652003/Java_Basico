package Semana_16_19.Dia_16_12_2024.Ejercicio03.entities;

public class Pantalon extends Vestimenta{
    private String estilo;
    private String tejido;

    public Pantalon(Integer codigo, String nombre, Float precio, String marca, Integer talla, String color, String estilo, String tejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tejido = tejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    @Override
    public void mostrarArticulo() {
        System.out.println("Estos pantalones son de estilo: "+this.getEstilo());
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "estilo='" + estilo + '\'' +
                ", tejido='" + tejido + '\'' +
                '}';
    }
}
