package vector_matrices_05_arreglos;

public class ArreglosVectores {

    public static void main(String[] args) {

        // Declarar e iniciar un vector
        int[] numeros = new int[5];

        // asignar valores a cada indice

        System.out.println(numeros[3]);

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

       int[] numerosCorridos = {45,56,76,87,87,65,34,23,21,12}; // si lo crean ustedes

        System.out.println("Imprimir valores");

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Este es el indice " + i + " y su valor es " + numeros[i]);
        }
    }
}
