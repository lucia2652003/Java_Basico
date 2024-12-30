package ejercicio_dia2_4;

import java.util.Scanner;

public class Teatro {

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        char[][] asientos = new char[5][5];
        Integer fila, asiento, opcion;
        Boolean continuar = false;

        Scanner scanner = new Scanner(System.in);

        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[0].length; c++) {
                asientos[f][c] = 'O';
            }
        }

        Mapa.dibujarMapa(asientos);

        while(continuar != true){
            System.out.println("Ingrese la fila. Entre 0 y 4 ");
            fila = scanner.nextInt();

            System.out.println("Ingrese el asiento. Entre 0 y 4 ");
            asiento = scanner.nextInt();

            //filas
            if (fila >=0 && fila <= 4) {
                   // asientos
                if (asientos[fila][asiento] == 'O') {
                    asientos[fila][asiento] = 'X';
                    System.out.println("Asiento asignado");
                }else{
                    System.out.println("Esta ocupado");
                }

            }
            else{
                System.out.println("Esta fila no es validad, debe ser entre 0 y 4");
            }

            System.out.println("Desea continuar?? Ingrese 1 para seguir u otro numero para salir");
            opcion = scanner.nextInt();

            if (opcion != 1){
                Mapa.dibujarMapa(asientos);
                continuar = true;
            }else{
                System.out.println("Desea ver el mapa de las reservas. ingrese 1 si quiere continuar u otro numero para salir");
                opcion = scanner.nextInt();
                if (opcion == 1) {
                    Mapa.dibujarMapa(asientos);
                }
            }

        }




    }


}
