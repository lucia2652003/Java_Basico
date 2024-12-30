package poo_001_abstraccion;

public class Auto {

    private String marca;
    private String modelo;
    private String color;
    private Integer velocidad;

    private boolean life;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, Integer velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    /*Metodos personalizados*/

    public  void acelerar(){
        velocidad += 10;
        System.out.println("El auto esta acelerando. Velocidad actual: " + velocidad + "Km/h");
    }
    public void frenar(){
        velocidad -= 10;
        System.out.println("El auto esta frenando. Velocidad actual: " + velocidad + "Km/h");

    }


}
