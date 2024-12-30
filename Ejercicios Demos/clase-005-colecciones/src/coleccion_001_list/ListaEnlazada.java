package coleccion_001_list;

import java.util.LinkedList;

public class ListaEnlazada {
    public static void main(String[] args) {

        LinkedList<String> miListaEnlazada = new LinkedList<>();

        // agregar elementos
        miListaEnlazada.add("Manzana");
        miListaEnlazada.add("Banana");
        miListaEnlazada.add("Cereza");

        // agregar en la posicion 1
        miListaEnlazada.add(1,"uva");

        // capturar un elemento con el get
        String valor = miListaEnlazada.get(3);
        System.out.println(valor);

        //Remover un elemento
        miListaEnlazada.remove(2);

        //Tamaño de la lista es con .size()
        int size = miListaEnlazada.size();

        //ver los elementos
        /*for (int i = 0; i < miListaEnlazada.size(); i++) {
            System.out.println(miListaEnlazada.get(i));
        }*/

        for (String elemento: miListaEnlazada) {
            System.out.println(elemento);
        }

    }

}
