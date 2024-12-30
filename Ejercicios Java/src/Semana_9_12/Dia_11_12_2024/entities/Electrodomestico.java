package Semana_9_12.Dia_11_12_2024.entities;

public class Electrodomestico {

    //Atributos
    int cod;
    String marca;
    String modelo;
    int consumo;
    String color;

    //Constructores

    //Constructor vacío
    public Electrodomestico() {
    }

    //Constructor con parámetros
    public Electrodomestico(int cod, String marca, String modelo, int consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    //Getters y Setters

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //toString()
    @Override
    public String toString() {
        return "Electrodomestico: " +
                "Marca: '" + marca + '\'' +
                ", Modelo: '" + modelo + '\'' +
                ", Consumo: " + consumo +" kW";
    }
}
