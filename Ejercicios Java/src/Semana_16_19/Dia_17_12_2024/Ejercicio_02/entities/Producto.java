package Semana_16_19.Dia_17_12_2024.Ejercicio_02.entities;

public class Producto {
    private Integer codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private Float precio_costo;
    private Float precio_venta;
    private Integer stock;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, String marca, String tipo, Float precio_costo, Float precio_venta, Integer stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.stock = stock;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(Float precio_costo) {
        this.precio_costo = precio_costo;
    }

    public Float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio_costo=" + precio_costo +
                ", precio_venta=" + precio_venta +
                ", stock=" + stock +
                '}';
    }
}
