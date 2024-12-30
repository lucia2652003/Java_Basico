package poo_004_polimorfismo;

import poo_001_abstraccion.Auto;

public class Camion extends Auto {

    private Integer carga;

    public void cargarBasurero(){
        System.out.println("Cargando el basurero");
    }

    @Override
    public void acelerar() {
        System.out.println("el camion esta acelerando, pero ams lento por ser mas pesado por la carga");
    }


}
