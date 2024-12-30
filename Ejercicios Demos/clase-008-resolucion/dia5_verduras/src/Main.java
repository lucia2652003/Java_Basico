import entities.Verdura;

public class Main {
    public static void main(String[] args) {

        /*Verduras*/
        Verdura[] verduras= new Verdura[5];

        verduras[0] = new Verdura(1, "Zanahoria", "naranja", 35.5, false);
        verduras[1] = new Verdura(2, "Brocoli", "verde", 35.5, true);
        verduras[2] = new Verdura(3, "Espinaca", "naranja", 35.5, false);
        verduras[3] = new Verdura(4, "Tomate", "rojo", 35.5, false);
        verduras[4] = new Verdura(5, "Pimiento", "verde", 35.5, true);

        for (Verdura v: verduras) {
            System.out.println(v.toStringPersonalizado());
        }

        //Cambiar los datos de 2 verduras
        verduras[0].setId(111);
        verduras[0].setNombre("Pepino");
        verduras[0].setColor("Blanco");
        verduras[0].setCalorias(16.5);
        verduras[0].setDebeCocinarse(true);

        verduras[2].setId(222);
        verduras[2].setNombre("Coliflor");
        verduras[2].setColor("verde");
        verduras[2].setCalorias(11);
        verduras[2].setDebeCocinarse(true);

        for (Verdura v: verduras) {
            System.err.println(v.toString());
        }

        //Recorrer el vector e imprimir las de color verde
        for (Verdura verdura: verduras) {
            if (verdura.getColor().equalsIgnoreCase("verde")){
                System.out.println(verdura);
            }
        }






    }
}