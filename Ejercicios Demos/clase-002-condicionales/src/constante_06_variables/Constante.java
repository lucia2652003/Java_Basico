package constante_06_variables;

public class Constante {

    public static final double PI = 3.14151659;
    public static final String NOMBRE_APP = "brianApp";

    public static void main(String[] args) {

        //System.out.println("El no,bre es " + NOMBRE_APP);

        String nombre = "Antonio";

        String nombre2 = "antonio";

        if (nombre.equals(nombre2)){
            System.out.println("Si son iguales");
        }else{
            System.out.println("no son iguales");
        }


        if (nombre.equalsIgnoreCase(nombre2)){
            System.out.println("Si son iguales");
        }else{
            System.out.println("no son iguales");
        }



    }
}
