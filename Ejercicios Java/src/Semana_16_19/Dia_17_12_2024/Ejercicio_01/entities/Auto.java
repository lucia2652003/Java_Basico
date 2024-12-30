package Semana_16_19.Dia_17_12_2024.Ejercicio_01.entities;

import java.time.LocalDateTime;

public class Auto extends Vehiculo implements Electrico{

    private Float mah;
    private Integer autonomia;

    public Auto(Integer id, String placa, String modelo, Integer ano, Float costo, Float mah, Integer autonomia) {
        super(id, placa, modelo, ano, costo);
        this.mah = mah;
        this.autonomia = autonomia;
    }

    @Override
    public void caculcarAntiguedad() {
        int antiguedad = LocalDateTime.now().getYear() - super.ano; //Coger el año actual y restar el año del auto
        System.out.println("El auto "+super.modelo+" tiene una antiguedad de "+antiguedad+" años");
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Recarga eléctrica de hasta "+this.mah+" mAh");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", costo=" + costo +
                ", mah=" + mah +
                ", autonomia=" + autonomia +
                '}';
    }
}
