package colecciones.coleccion_004_interfaz;

public class Gato implements Animal{

    public Gato() {
    }

    @Override
    public String hacerSonido() {
        return "Miauu";
    }

    @Override
    public void moverse() {
        System.out.println("El gato sobe a un árbol");
    }
}
