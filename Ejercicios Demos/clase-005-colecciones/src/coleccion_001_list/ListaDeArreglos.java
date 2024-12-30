package coleccion_001_list;

import java.util.ArrayList;

public class ListaDeArreglos {

    public static void main(String[] args) {
        ArrayList<String> miLista = new ArrayList<>();

        miLista.add("Manzana");
        miLista.add("Banana");
        miLista.add("Cereza");

        // Obtener un elemento
        String fruta = miLista.get(0);

        //Remover un elemento
        miLista.remove(1);

        int size = miLista.size();


        for (String e: miLista) {
            System.out.println(e);
        }

        ArrayList<User> userCreate = new ArrayList<>();

        userCreate.add(new User(4, "Brian", 31));
        userCreate.add(new User(1,"Antonio", 50));

        for (User u: userCreate ) {
            System.out.println(u.getName() + " y tiene " + u.getAge() + " años de edad");
        }

    }
}
