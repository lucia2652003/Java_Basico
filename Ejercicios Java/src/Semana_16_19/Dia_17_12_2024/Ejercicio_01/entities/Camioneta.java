package Semana_16_19.Dia_17_12_2024.Ejercicio_01.entities;

import java.time.Year;

public class Camioneta extends Vehiculo implements Combustion{
    Integer carga;
    Integer consumo;

    public Camioneta(Integer id, String placa, String modelo, Integer ano, Float costo, Integer carga, Integer consumo) {
        super(id, placa, modelo, ano, costo);
        this.carga = carga;
        this.consumo = consumo;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recarga de combustión hasta "+this.consumo+" l");
    }

    @Override
    public void caculcarAntiguedad() {
        int antiguedad = Year.now().getValue() - this.ano; //Coger el año actual y restar el año del auto
        System.out.println("La camioneta "+this.modelo+" tiene una antiguedad de "+antiguedad+" años");
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", costo=" + costo +
                ", carga=" + carga +
                ", consumo=" + consumo +
                '}';
    }
}
