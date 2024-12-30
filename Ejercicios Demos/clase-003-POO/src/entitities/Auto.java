package entitities;

public class Auto {

    // Atributos
    String color;
    String marca;
    int velocidad;

    // constructor vacio
    public Auto() {
    };

    public Auto(String color, String marca, int velocidad) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    };

    // Getters y Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Métodos
    void acelerar (){
        // codigo que ustedes quieren que haga
    };

    int frenar(int frenado){
        int calcule = frenado *1000;
        return calcule;
    };

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    };

    public String acelerarAfondo(){
        int velocidadMaxima = this.velocidad * 2;
        this.setVelocidad(velocidadMaxima);
        return "Usted ahora va a " + velocidadMaxima + "Km/h";
    }

    public String frenarUnPoco(int frenado){
       int velocidadFrenado = this.velocidad - frenado;
       int velocidadAnterior = this.getVelocidad();
       this.setVelocidad(velocidadFrenado);
       return "Usted bajo la velocidad desde " + velocidadAnterior + " hasta " + velocidadFrenado + "Km/h" ;
    }

}
