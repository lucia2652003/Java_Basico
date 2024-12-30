import entities.*;

public class Main {
    public static void main(String[] args) {

        Vestimenta[] prendas = new Vestimenta[9];

        prendas[0] = new Zapato("dd45", "Deportivo", 59.99, "Nike", "29", "Negros", "Cuero", "cordon");
        prendas[1] = new Zapato("asd45", "Deportivo", 859.99, "Adidas", "29", "Marrones", "Cuero", "cordon");
        prendas[2] = new Zapato("as54d", "Casuales", 159.99, "Clark", "29", "Negros", "Cuero", "Cierre");

        prendas[3] =  new Pantalon("sdf54dfs45", "Lee", 19.9, "Lee", "xxl", "Azul", "recto", "Algodon");
        prendas[4] =  new Pantalon("sd45", "Levis", 19.9, "Lee", "xxl", "Azul", "recto", "Algodon");
        prendas[5] =  new Pantalon("s24d", "Levis", 19.9, "Lee", "xxl", "Azul", "recto", "Algodon");

        prendas[6] = new Camiseta("sd45", "Camiseta Clásica", 19.99, "Nike", "42", "Blanco", "Corta", "Redondo");
        prendas[7] = new Camiseta("sd45d", "Camisa Polo", 29.99, "Lacoste", "40", "Azul", "Larga", "Polo");
        prendas[8] = new Sombrero("asd88", "Gorra de Béisbol", 24.99, "New Era", "58", "Gris", "Deportivo", "56");

        for (Vestimenta prenda: prendas ) {
            prenda.mostrarMensaje();
        }


    }
}