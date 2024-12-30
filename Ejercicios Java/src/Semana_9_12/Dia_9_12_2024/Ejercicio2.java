package Semana_9_12.Dia_9_12_2024;

/*
* ### Ejercicio N.º 2 - Tipos de Datos - Grupal

 **a)** Crea un programa que declare una variable para cada uno de
 * los siguientes tipos de datos: _int_, _double_, _boolean_ y _String_.
 * Asigna un valor a cada variable y muestra su contenido en la consola.

 **b)** Ahora, asigna valores que no correspondan al tipo de dato.
 * Por ejemplo, un _int_ en un _String_ o un _String_ en un _double_…
 * ¿Qué sucede con el programa? ¿Se produce algún error?
 * ¿En qué situaciones se genera error y en cuáles no? Justificar el porqué de cada caso. Debatir con otros compañeros.

 * */
public class Ejercicio2 {
    public static void main(String[] args) {
        // a.)
        int num =55; //Valor entero
        double dec = 2.526515253;
        String cadena = "Lucia";
        boolean bol = false;

        System.out.println("El valor de int es: "+num);
        System.out.println("El valor de double es: "+dec);
        System.out.println("El valor de Boolean es: "+bol);
        System.out.println("El valor de string es: "+cadena);

        // b)
        /*Cuando el programa lee los datos que no son correctos por ejemplo el String con el int lanza un error
        * en el que no es capaz de entender y se detiene completamente.
        * Se genera el error:
        *    / Si introducimos in string en un int
        *    / Un float en double
        *    / Metemos un int 0 o 1 en boolean
        * No se genera un error
        *    / Cuando introducimos un valor grande en double y ponemos decimales
        *    / Cuando introducimos números en una cadena de texto String cad21
        *
        * */
    }
}
