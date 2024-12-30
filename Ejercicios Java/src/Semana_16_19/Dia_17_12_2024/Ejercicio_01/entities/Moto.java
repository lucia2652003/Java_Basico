package Semana_16_19.Dia_17_12_2024.Ejercicio_01.entities;

import java.time.Year;

public class Moto extends Vehiculo implements Combustion{

    Integer cilindrada;
    String motor;

    public Moto(Integer id, String placa, String modelo, Integer ano, Float costo, Integer cilindrada, String motor) {
        super(id, placa, modelo, ano, costo);
        this.cilindrada = cilindrada;
        this.motor = motor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recarga de combustión hasta "+this.cilindrada);
    }

    @Override
    public void caculcarAntiguedad() {
        int ant = Year.now().getValue() - this.ano;
        System.out.println("La moto "+this.modelo+" tiene una antiguedad de "+ant+" años");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", costo=" + costo +
                ", cilindrada=" + cilindrada +
                ", motor='" + motor + '\'' +
                '}';
    }
}
