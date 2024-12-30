package tiposDeDatosPrimitivos;

public class Primitivos {

    public static void main(String[] args){
       /*Tipos de datos*/

        byte numeroByte = 127;                  //Maximo valor para un byte
        short numeroShort = -32767;             //Maximo valor para un short

        /*Los mas importantes*/
        int numeroInt = 2147458258;             //Maximo valor para un Entero
        long numeroLargo = 925477852855555555L; //Maximo valor para un Largo

        /*Tipos de datos primitivos pero decimales*/
        float numeroFloat = 3.15f;
        double numeroDouble = 3.1415165485245;

        // Tipos de datos de caracteres
        char caracter = 'A';

        // TODO: 09/12/2024 OJO esta es una clase de referencia
        String caracteresConcatenados = "AAAAAA";

        //Booleanos
        boolean verdadero = true;
        boolean falsa = false;

        System.out.println(numeroDouble);
    }
}
