package poo_002_codeConmigo.entities;

public class Producto {

    //atributos
    String nombre = "Sin Nombre";
    double precio= 0.0;
    String descripcion = "Sin descripcion";
    int stock = 0;
    String categoria = "Sin Categoria";

    // constructor por defecto
    public Producto() {

    }

    //Constructor con parametros
    public Producto(String nombre, double precio, String descripcion, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.categoria = categoria;
    }

    //Getter y setter


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

    // Luego de los Getters y Setters van los metodos propios de la clase
    public double calcularIVA(){
        double precioInicial = this.getPrecio();
        double iva = this.getPrecio() * 0.21;
        this.setPrecio(iva + precioInicial);
        return iva;
    }

    public double calcularPrecioFinal(boolean clienteRegistrado){

        if (clienteRegistrado) return this.precio * 0.5;
        else return this.precio;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
