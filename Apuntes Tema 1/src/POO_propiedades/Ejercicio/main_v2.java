package POO_propiedades.Ejercicio;

import POO_propiedades.Ejercicio.entities.Circunferencia;
import POO_propiedades.Ejercicio.entities.Figura;
import POO_propiedades.Ejercicio.entities.Rectangulo;

public class main_v2 {
    public static void main(String[] args) {

        //Abstracción
        Figura f1 = new Figura(52.6F,0);
        System.out.println(f1.getRadio());

        Figura fnuevo = new Figura();
        System.out.println(fnuevo.getRadio());

        //Polimorfismo
        Rectangulo r2 = new Rectangulo(12.5F,26.3F);
        r2.calcularArea();

        //Herencia
        Circunferencia c1 = new Circunferencia();
        System.out.println("Antes el radio :"+c1.getRadio());
        c1.calcularArea();

        c1.setRadio(25.16F);
        System.out.println("Ahora :"+c1.getRadio());
        c1.calcularArea();
    }
}