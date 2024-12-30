package POO_propiedades.Ejercicio.entities;

public class Rectangulo extends Figura {

    Float base;
    Float altura;

    public Rectangulo(Float altura, Float base) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    @Override
    public void calcularArea() {
        if(base <= 0 || altura <= 0){//No se puede calcular el area con números negativos o 0
            System.out.println("No se puede calcular el área");
        }else{
            double area = base * altura;
            System.out.println("El área es "+area+" cm^2");
        }
    }
}
