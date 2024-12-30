import entities.Producto;
import utils.ProductoUtilades;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();

        Producto tablet = new Producto(1007, "Galaxy Tab S9", "Samsung", "Tablet", 450.00, 649.99, 30);
        Producto ssd = new Producto(1008, "SSD NVMe 1TB", "Western Digital", "Almacenamiento", 95.50, 149.99, 55);
        Producto auriculares = new Producto(1009, "AirPods Pro", "Apple", "Audio", 180.75, 249.99, 40);
        Producto impresora = new Producto(1010, "Impresora Láser Color", "HP", "Impresora", 220.00, 349.99, 20);
        Producto telefono = new Producto(1011, "Telefono", "Apple", "15", 100.00, 2349.99, 200);

        inventario.add(tablet);
        inventario.add(ssd);
        inventario.add(auriculares);
        inventario.add(impresora);
        inventario.add(telefono);

        /*recorre el listado y mayor precio de venta*/
        double minPrecioVenta = Double.MIN_VALUE;
        Producto productoMaxPrecioVenta = null;

        for (Producto producto: inventario ) {
            if (producto.getPrecioVenta() > minPrecioVenta){
                minPrecioVenta = producto.getPrecioVenta();
                productoMaxPrecioVenta = producto;
            }
        }


       // System.out.println("El producto con el mayor precio es " + productoMaxPrecioVenta.getNombre());


        double maxPrecioCosto = Double.MAX_VALUE;
        Producto productoMinPrecioCosto = null;

        for (Producto producto: inventario  ) {
            if (producto.getPrecioCosto() < maxPrecioCosto){
                maxPrecioCosto = producto.getPrecioCosto();
                productoMinPrecioCosto = producto;
            }
        }

       // System.out.println("El producto con el menor precio costo es " + productoMinPrecioCosto.getNombre());

       /* Producto productoEliminado =  inventario.remove(4);

        System.out.println("El prodcuto eliminado es el " + productoEliminado.getNombre());*/

        for (Producto p: inventario ) {
            //System.out.println(p);
        }

        //mayor cantidad de stock del listado inventario
        Integer minStock = Integer.MIN_VALUE;
        Producto productoStock = null;

        for (Producto p: inventario) {
            if (p.getCantidadStock() > minStock){
                minStock = p.getCantidadStock();
                productoStock = p;
            }
        }

        System.out.println("El producto con mayor stock es " + productoStock.getNombre());

        /*Descontar 3 unidades*/

        productoStock.setCantidadStock( productoStock.getCantidadStock() - 3);

        System.out.println(productoStock);


        /*Imprimir valor insertado*/

        ProductoUtilades.imprimirListado(inventario);




    }
}