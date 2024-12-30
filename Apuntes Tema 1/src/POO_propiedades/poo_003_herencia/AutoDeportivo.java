package POO_propiedades.poo_003_herencia;

import POO_propiedades.poo1_001_abstraccion.Auto;

public class AutoDeportivo extends Auto {

    private boolean turboActivado;

    public void activarTurbo(){
        turboActivado = true;
        System.out.println("Turbo activado!");
    }

    @Override
    public void acelerar() {
        if(turboActivado){
            System.out.println("El auto deportivo utlizo el turbo");
        }else{
            System.out.println("El auto deportivo acelero, pero no utilizo el turbo");
        }
        //super.acelerar();
    }

    @Override
    public void frenar() {
        super.frenar();
    }
}
