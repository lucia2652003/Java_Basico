package utils;

import entities.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoUtilades {

    public static void imprimirListado(ArrayList<Producto> lista){
        for (Producto p: lista  ) {
            System.out.println(p);
        }
    }
}
