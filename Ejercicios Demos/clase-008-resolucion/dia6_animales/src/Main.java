import entities.Animal;
import entities.Ave;
import entities.Mamifero;
import entities.Reptil;

public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(1, "Leon", 20, "Dura", "carnivoro", 4 , "viviparos", "Amarillo", "Sabana" );
        Ave ave = new Ave(5, "Aguila", 10, "Dura", "Carnivoro", 100.10, "xxxxx", "Blanca", "Blando");
        Reptil reptil = new Reptil(10, "Cocodrilo", 50, "Dura", "Carnivoro", 50.4, "Fuerte", "No aplica", "lagunas");

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        Animal animal;

        animal = mamifero;

        animal.saludar();

    }
}