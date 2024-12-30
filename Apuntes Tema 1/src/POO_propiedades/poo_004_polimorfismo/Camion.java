package POO_propiedades.poo_004_polimorfismo;

import POO_propiedades.poo1_001_abstraccion.Auto;

public class Camion extends Auto {

    private Integer carga;

    public void cargaBasurero(){
        System.out.println("Cargando el basurero");
    }


    @Override
    public void acelerar() {
        System.out.println("El camión esta acelerando, pero más lento por ser más pesado por la carga");
    }
}
