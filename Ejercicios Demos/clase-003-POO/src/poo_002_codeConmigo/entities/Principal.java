package poo_002_codeConmigo.entities;

public class Principal {

    public static void main(String[] args) {
        Producto producto = new Producto();

        producto.setNombre("Torta");
        producto.setPrecio(100);
        producto.setDescripcion("Una torta rica");
        producto.setStock(200);
        producto.setCategoria("Tortas");

        System.out.println(producto.calcularIVA());

        System.out.println(producto.calcularPrecioFinal(true));


        Producto producto1 = new Producto("Galletitas", 17.20, "Galletas con azucar", 200, "Comestibles");


    }
}
