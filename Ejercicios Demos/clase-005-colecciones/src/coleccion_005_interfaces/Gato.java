package coleccion_005_interfaces;

public class Gato implements Animal {

    public Gato() {
    }

    @Override
    public String hacerSonido() {
        String msj = "Miauu";
        System.out.println(msj);
        return msj;
    }

    @Override
    public void moverse() {
        System.out.println("El gato sube un arbol");
    }
}
