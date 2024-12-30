package Semana_16_19.Dia_17_12_2024.Ejercicio_02;

import Semana_16_19.Dia_17_12_2024.Ejercicio_02.entities.Producto;

import java.util.ArrayList;

/*
* Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario.
*  Para ello, necesita la creación de una clase Producto que cuente
* con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

* A partir de esto, realizar las siguientes acciones en el programa desarrollado:

* a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados
* (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

* b) Guardar estos objetos creados en un ArrayList.

* c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

* d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

* e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

* f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto,
* descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.

* g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
*
* */
public class Main {
    public static void main(String[] args) {

        //a.)
        Producto p1 = new Producto(1,"Teléfono","Sony","Samsung",100.00F,65.20F, 50);
        Producto p2 = new Producto(2,"Laptop","IBM","Gamer",1200.05F,745.00f, 10);
        Producto p3 = new Producto(3,"Tablet","HP","Huawei",60.50F,38.24F, 35);
        Producto p4 = new Producto(4,"Cascos","SKIVE","Inalámbrico",78.23F,65.99F, 44);
        Producto p5 = new Producto(5,"Auriculares","Android","Inalámbrico",50.20F,44.20F, 25);
        Producto p6 = new Producto(6,"Televisión","Sony","LED",500.99F,366.20F, 5);
        Producto p7 = new Producto(7,"Cargador","Apple","USB C",80.30F,133.67F, 73);
        Producto p8 = new Producto(8,"Teléfono","Apple","Xiami",75.32F,55.66F, 67);
        Producto p9 = new Producto(9,"Televisión","Toshiba","LCD",2000.00F,1599.00F, 22);
        Producto p10 = new Producto(10,"Laptop","Asus","Notebook",350.00F,245.00F, 68);

        //b.)
        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(p1);
        inventario.add(p2);
        inventario.add(p3);
        inventario.add(p4);
        inventario.add(p5);
        inventario.add(p6);
        inventario.add(p7);
        inventario.add(p8);
        inventario.add(p9);
        inventario.add(p10);

       //c.)
       /*
        float precVentMax = Float.MIN_VALUE;
        Producto pBuscar = null;
        //Hallar el precio de venta máximo
        for (Producto value : inventario) {
            if (value.getPrecio_venta() > precVentMax) {
                precVentMax = value.getPrecio_venta();
                pBuscar = value;
            }
        }// fin for
        System.out.println("El producto con el precio de venta máximo es "+pBuscar.getNombre()+" con "+pBuscar.getPrecio_venta() +" €");*/

        //d.)

       /* float precCostMin = Float.MAX_VALUE;
        Producto pBusc = null;
        //Hallar el precio de coste mínimo
        for (Producto producto: inventario) {
            if(producto.getPrecio_costo() < precCostMin){
                precCostMin = producto.getPrecio_costo();
                pBusc = producto;
            }
        }// fin for
        System.out.println("El producto con el menor precio de coste es "+pBusc.getNombre()+" con "+pBusc.getPrecio_costo()+" €");*/

        //e.()

        /*int id_pos5 = inventario.get(5).getCodigo();
        inventario.remove(5); //Elimina el producto de la posición asignada, como si fuera un array

        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i));
        }
        System.out.println("El producto con el código "+id_pos5+" ha sido eliminado");*/


        //f.)

        /*int stockMax = Integer.MIN_VALUE;
        Producto prodctBusc = null;
        for(Producto producto: inventario){
            if(producto.getStock() > stockMax){//Hallar el stock máximo
                stockMax = producto.getStock();
                prodctBusc = producto; //Declararle el producto con el stock max
            }
        }
        prodctBusc.setStock(prodctBusc.getStock() - 3);
        System.out.println("Producto actualizado \n"+prodctBusc);
        System.out.println();
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i));
        }*/
    }
}
