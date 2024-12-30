package condicionales_04_codeaConmigo;

import java.util.Scanner;

public class ControlAccesoDisco {

    public static void main(String[] args) {
        //  CodeaConmigo - Controll de Acceso a Discoteca
        Scanner scanner = new Scanner(System.in);

        String msj = "Ingrese una edad entre 1 y 100";

        System.out.println(msj);
        int edadUsuario = scanner.nextInt();

        // chequea si la edad no es menor 1 o mayor a 100
        while (edadUsuario < 1 || edadUsuario > 100){
            System.out.println("Edad invalidad, " + msj);
            edadUsuario = scanner.nextInt();
        }


        //validar edad real
        if (edadUsuario >= 18){
            System.out.println("Puedes ingresar a la fiesta");

        }else if(edadUsuario >= 16 && edadUsuario <18){
            System.out.println("Puedes ingresar con un mayor de edad");
        }else{
            System.out.println("Lo siento, no puedes ingresar");
        }


        scanner.close();

    }
}
