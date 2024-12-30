package condicionales_02_switch;

public class Switch {

    public static void main(String[] args) {

        int destino = 44;        // destino numero 4

        double costoEnvio;

        switch (destino){
            case 1:
                costoEnvio = 5.0;
                break;
            case 2:
                costoEnvio = 7.5;
                break;
            case 3:
                costoEnvio = 9.5;
                break;
            case 4:
                costoEnvio = 11.5;
                break;
            default:
                costoEnvio = 0.0;
        }

        System.out.println("El costo de envio a el destino N: " + destino + " es de $" + costoEnvio);


    }
}
