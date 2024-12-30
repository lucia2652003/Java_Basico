package Semana_16_19.Dia_16_12_2024.Ejercicio03.entities;

public class Zapato extends Vestimenta {
    private String material;
    private String cierre;

    public Zapato(Integer codigo, String nombre, Float precio, String marca, Integer talla, String color, String material, String cierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.cierre = cierre;
    }

    @Override
    public void mostrarArticulo() {
        System.out.println("Estos zapatos son de marca: "+this.getMarca());
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "material='" + material + '\'' +
                ", cierre='" + cierre + '\'' +
                '}';
    }
}
