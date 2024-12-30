package ejercicio_dia3_1.entities;

public class Electrodomestico {
    Integer codigo;
    String marca;
    String modelo;
    Double consumo;
    String color;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer codigo, String marca, String modelo, Double consumo, String color) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String formateo = "Electrodomestico{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", color='" + color + '\'' +
                '}';
        System.out.println(formateo);
        return formateo;
    }
}
