package vector_matrices_05_arreglos;

public class ArreglosVectores {
    public static void main(String[] args) {

        //Declarar e iniciar un vector
        int[] numeros = new int[5];

        //Asignar valores a cada indice
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Imprimir valor de posición "+i+": "+numeros[i]);
        }

        int[] numeroCorridos = {45,65,58,15,77,36,88,66,59,23};
    }
}
