package POO_propiedades.Ejercicio.entities;

import static constante_06_variables.Constante.PI;

public class Circunferencia extends Figura{


    @Override
    public void calcularArea() {
        if(getRadio() <= 0){ //Si radio es un número negativo o 0
            System.out.println("Lo siento. No se puede calcular el área porque dará un resultado negativo o 0");
        }else{
            double area = PI * Math.pow(getRadio(),2);
            System.out.println("El área de la circunferencia es "+area+"cm^2");
        }
    }
}

