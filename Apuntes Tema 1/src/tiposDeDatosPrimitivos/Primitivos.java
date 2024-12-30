package tiposDeDatosPrimitivos;

import java.util.function.DoubleToIntFunction;

public class Primitivos {

    public static void main(String[] args){
        /*Tipos de datos*/

        byte numeroByte =127;                  //Máximo para un byte
        short numeroShort = -32767;            //Máximo para un SHORT

        /*Los más importantes*/
        int numeroInt = 2147458258;            //Máximo para un entero
        long numeroLong = 9215251512514222222L;//Máximo para un largo

        /*Tipos de datos primitivos pero decimales*/
        float numeroFloat = 3.15f;
        double numeroDouble = 3.1415165265;

        // Tipos de datos de caracteres
        char caracter = 'A';
        String caracteresConcatenados = "AAAAA";

        //Booleanos
        boolean vardadero = true;
        boolean falso = false;

        System.out.println(numeroDouble);
    }
}
