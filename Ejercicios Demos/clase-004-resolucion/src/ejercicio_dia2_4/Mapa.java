package ejercicio_dia2_4;

public class Mapa {

    public static void dibujarMapa(char[][] asientos){
        // dibujar mi pmapa de asientos
        for (int f = 0; f < 5; f++) {
            System.out.println(f + " ");
            for (int c = 0; c < 5; c++) {
                System.out.println("[ " + asientos[f][c] + " ]");
            }
            System.out.println(" ");
        }
    }
}
