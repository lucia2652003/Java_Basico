package operadores;

public class Comparacion {
    public static void main(String[] args){
        //declaramos 2 variables

        int a = 10;
        int b = 5;

        System.out.println("A es igual a B?: "+ (a == b));

        System.out.println("A es distinto a B?: "+ (a != b));

        System.out.println("A es mayor a B?: "+ (a > b));

        System.out.println("A es menor a B?: "+ (a < b));

        System.out.println("A es mayor o igual a B?: "+ (a >= b));
        System.out.println("A es menor o igual a B?: "+ (a <= b));
    }
}
