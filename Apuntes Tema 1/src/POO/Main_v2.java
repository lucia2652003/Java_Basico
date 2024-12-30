package POO;

import POO.entities.Pentagono;
import java.util.Scanner;

public class Main_v2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        Pentagono p1 = new Pentagono();

        //Calcular la apotema
        p1.setLado(12.67F);
        System.out.println(p1.calcularApotema());

        //Calcular el radio (Teorema de Pitágoras) r^2 = ap^2 + l^2
        System.out.println(p1.calcularRadio());

        System.out.println(p1);
        System.out.println(p1.calcularArea()); //Imprimir el area del pentagono

        System.out.println();

        //Inicialización con parámetros
        Pentagono p2 = new Pentagono(9.02F,4.5F, 0);

        System.out.println("Su apotema del 2ºpentagono es de "+p2.getApotema()+" cm");

        System.out.println(p2.calcularRadio());

        p2.setLado(1.52F);
        System.out.println("El perímetro de este pentágono con lado "+p2.getLado()+"\n" +
                " cm es de "+(p2.getLado() * 5)+" cm");

        System.out.println(p2.calcularArea());
    }
}
