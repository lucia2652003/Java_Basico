package operadores;

public class Logicos {
    public static void main(String[] args){
        //2 variables logicos

        boolean esMayorDeEdad = true;
        boolean tieneCarnet = false;

        System.out.println("Puede conducir? "+(esMayorDeEdad  && tieneCarnet)); // TRUE == TRUE
        System.out.println("Puede conducir? "+(esMayorDeEdad  || tieneCarnet)); // FALSE || TRUE -> TRUE

        System.out.println("Comparar "+ (tieneCarnet == true));

        System.out.println("Negación total: "+(!esMayorDeEdad));
    }
}
