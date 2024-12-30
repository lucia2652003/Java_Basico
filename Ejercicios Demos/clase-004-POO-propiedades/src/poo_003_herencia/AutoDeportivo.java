package poo_003_herencia;

import poo_001_abstraccion.Auto;

/*                          hija de */
public class AutoDeportivo extends Auto {
    private boolean turboActivado;

    public void activarTurbo(){
        turboActivado = true;
        System.out.println("Turbo activado!");
    }

    @Override
    public void acelerar() {
       if (turboActivado){
           System.out.println("El auto deportivo utilizo el turbo");
       }else{
           System.out.println("El auto deportivo acelero, pero no utilizo el turbo");
       }
    }
}
