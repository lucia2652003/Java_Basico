import interfaces.Combustion;
import interfaces.Electrico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Auto autoElectrico = new Auto(1,"df4545df", "Tesla", "S", 2020, 100000.00, 75000, 5);
        Camioneta camionetaCombustion = new Camioneta(2,"f45fd45", "Mack", "R", 2000, 50000.00, 70000, 5.5);
        Moto motoCombustion = new Moto(3, "gf32", "Harley", "Q", 2015, 20000.00, 1000, "gasolina");

        vehiculos.add(autoElectrico);
        vehiculos.add(camionetaCombustion);
        vehiculos.add(motoCombustion);

        for (Vehiculo vehiculo: vehiculos) {
            System.out.println("Antiguedad del vehiculo: " + vehiculo.calcularAntiguedad());

            if (vehiculo instanceof Electrico){
                ((Electrico) vehiculo).cargarEnergia();
            }else if(vehiculo instanceof Combustion){
                ((Combustion) vehiculo).recargarCombustible();
            }else {
                System.err.println("No es un tipo de dato aceptable apra la condicion");
            }

        }

    }
}