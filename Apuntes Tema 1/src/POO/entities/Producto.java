package POO.entities;

public class Producto {

    //Atributos

    String nombre;
    double precio;
    String descripcion;
    int stock;
    String categoria;

    //Constructores

    public Producto() {
    }

    public Producto(String categoria, int stock, String descripcion, double precio, String nombre) {
        this.categoria = categoria;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
    }

    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Métodos

    public double calcularIVA () {
        double iva = this.getPrecio() * 0.21;
        return iva;
    }

    public double calcularPrecioFinal(boolean registrado){
        if(registrado){ // registrado == true
            return this.precio * 0.5;
        }
        return this.precio;
    }

    //toString()
    @Override
    public String toString() {
        return "Producto: " + nombre + '\'' +
                ", Precio: " + precio +
                ", Descripción: '" + descripcion;
    }
}
