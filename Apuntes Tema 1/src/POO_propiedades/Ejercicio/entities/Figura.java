package POO_propiedades.Ejercicio.entities;

public class Figura {
    private Float radio= -0.25F;
    private Integer vertice;//Donde se ocurren los lados de un ángulo

    public Figura() {
    }

    public Figura(Float radio, Integer vertice) {
        this.radio = radio;
        this.vertice = vertice;
    }
    
    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public Integer getVertice() {
        return vertice;
    }

    public void setVertice(Integer vertices) {
        this.vertice = vertices;
    }

    public void calcularArea(){
        System.out.println("Calcular el área");
    }
}
