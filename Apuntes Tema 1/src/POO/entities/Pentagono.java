package POO.entities;

//Pentágono es una figura geométrica de 5 lados

public class Pentagono {

    //Atributos
    float lado;
    float apotema;
    double radio;

   //Constructores
    public Pentagono() {
    }

    public Pentagono(float lado, float apotema, double radio) {
        this.lado = lado;
        this.apotema = apotema;
        this.radio = radio;
    }

    //Getters y Setters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Métodos
    public String calcularRadio(){ //r^2 = ap^2 + l^2
        double r = Math.pow(apotema,2)+ Math.pow(lado,2); //Calcular los exponenciales
        setRadio(Math.sqrt(r)); //Calcular la raíz cuadrada
        return "Su radio es de "+radio+" cm";
    }

    public String calcularApotema(){
        float ap = this.lado / 1.45F;
        setApotema(ap);
        return "La apotema "+ap+ " cm";
    }

    //Calcular el area del Pentágono A =  P * ap / 2
    public String calcularArea(){
        float area = ((this.lado * 5) * this.apotema)/ 2;
        return "El área de este pentágono es de "+area+ " cm^2";
    }

    //toString()
    @Override
    public String toString() {
        return "Pentagono{" +
                "lado= " + lado +
                " cm, apotema=" + apotema +
                " cm, radio=" + radio +
                " cm}";
    }
}
