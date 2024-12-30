package Semana_16_19.Dia_17_12_2024.Ejercicio_01;
/*
*
* Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos.
* Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.

* a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos:
* id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehículo.

* b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia()
* y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases,
*  deben mostrar un mensaje de qué tipo de recarga están haciendo.

* c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico.
*  Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs).
*  Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

* d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion.
*  Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible.
*  Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

* e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion.
* Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor.
* Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

* f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos
* (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo.
*  Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.

* g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.

* Nota: Recuerda que la antigüedad de un vehículo se calcula restando del año actual el año de fabricación del auto.
*  Por ejemplo: 2023 - 2018= 5 años de antigüedad
*
* */

import Semana_16_19.Dia_17_12_2024.Ejercicio_01.entities.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Vehiculo> automoviles = new ArrayList<>();
        //if (vehiculo instanceof RecargableElectrico)

        Camioneta camioneta = new Camioneta(25, "2521L2802","Suzuki",2022,999.58F,155,99);
        Moto moto = new Moto(63,"48253LT12","Ford",2015, 75.63F,56, "gasolina");
        Auto auto = new Auto(24, "963LK45D03", "Ford", 2001, 158.30F, 154.20F, 1560);

        //Agregar los valores
        automoviles.add(auto);
        automoviles.add(camioneta);
        automoviles.add(moto);

        //Recorrer los valores
        for (Vehiculo automovile : automoviles) {
            System.out.println(automovile);
            automovile.caculcarAntiguedad();

            if (automovile instanceof Electrico) { //Validamos si el objeto tiene recarga electrica
                ((Electrico) automovile).cargarEnergia();
            } else{
                ((Combustion) automovile).recargarCombustible();
            }

        }// fin for


    }
}
