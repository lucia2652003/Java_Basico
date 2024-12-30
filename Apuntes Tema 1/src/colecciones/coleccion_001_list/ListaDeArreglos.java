package colecciones.coleccion_001_list;

import java.util.ArrayList;

public class ListaDeArreglos {
    public static void main(String[] args) {
        ArrayList <String> listaArreglos = new ArrayList();

        //Agregar elementos
        listaArreglos.add("Manzana");
        listaArreglos.add("Banana");
        listaArreglos.add("Cereza");

        //Obtener un valor
        String valor = listaArreglos.get(0);
        System.out.println(valor);

        //Remover un elemento
        listaArreglos.remove(1);

        //Tamaño
        int size = listaArreglos.size();

        //Recorrer array
        for (int i = 0; i < listaArreglos.size(); i++) {
            System.out.println(listaArreglos.get(i));
        }

        for (String el: listaArreglos) {
            System.out.println(el);
        }

        ArrayList <User> usuarios = new ArrayList();

        usuarios.add(new User(1,"Pablo", 21));
        usuarios.add(new User(2, "Laura", 12));

        for (User u : usuarios) {
            System.out.println(u.getNombre() + " tiene "+u.getEdad()+" años.");
        }
    }
}
