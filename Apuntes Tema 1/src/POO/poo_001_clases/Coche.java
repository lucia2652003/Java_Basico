package POO.poo_001_clases;

public class Coche {

    //Atributos
    String marca;
    String color;
    int velocidad;

    //Constructores
    public Coche(String marca, String color, int velocidad) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    public Coche() {
    }


    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Métodos
    boolean acelerar(){
        System.out.println("Tu coche esta encendido");
        return true;
    }

    int frenar(int frenado){
        int calculo = frenado * 1000;
        return calculo;// Devuelve un valor entero
    }

    //Doblar la velocidad
    public String acelerarAfondo(){
        setVelocidad(this.velocidad*2);
        return "Usted ahora va a "+this.velocidad+" km/h";
    }

    //
    public String frenarUnPoco(int frenado){
        int velMax = this.velocidad, velocFrenado = this.velocidad-frenado;
        setVelocidad(velocFrenado);
        return "Usted bajo la velocidad desde "+velMax+" km/h hasta "+velocFrenado+" km/h";
    }


    //toString()
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
