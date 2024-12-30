package colecciones.coleccion_001_list;

import java.util.LinkedList;

public class ListaEnlazada {

    public static void main(String[] args) {
        LinkedList <String> miLista = new LinkedList<>();

        //Agregar elementos
        miLista.add("Manzana");
        miLista.add("Banana");
        miLista.add("Cereza");

        //Agregar en una posición 1
        miLista.add(1,"Uva");

        //Ver los elementos con el get
        System.out.println(miLista.get(1));


        //Remover un elemento
        miLista.remove(2);

        //Tamaño de la lista .size()
        int tamano = miLista.size();



        //Recorrer lista enlazada
        //1 forma
        /*for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }*/

        //2 forma
        for(String item: miLista){
            System.out.println(item);
        }


    }
}
