package org.example.controllers;

import org.example.entities.Empleado;
import org.example.persistence.EmpleadoJPA;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

//Las operaciones CRUD sobre la entidad Empleado
public class EmpleadoController {
    EmpleadoJPA empJPA = new EmpleadoJPA();

    public void crearEmpleado(Empleado emp) {
        empJPA.create(emp);
    }

    public List<Empleado> listarEmpleados() {
        return empJPA.findAll();
    }

    public void buscarCargo(Scanner t) {
       t.nextLine();//Evita el salto
       List<String> todosCargos = empJPA.findAllJob();
       System.out.println("--- Mostrar cargos disponibles ---");
       todosCargos.forEach(System.out::println);
       String cargo = validationTexto(t, "cargo");

       List<Empleado> empleados = empJPA.findAll();
       //Buscar a los empleados por cargo
        System.out.println("-----Lista empleados :"+cargo+" -----");
       for(Empleado empleado: empleados){
           if(empleado.getJob().equalsIgnoreCase(cargo)){
               System.out.println(empleado.toStringJob());
           }
       }// fin for
    }

    public void eliminarEmpleado(Integer idBuscar) {
        empJPA.delete(idBuscar);
    }

    public Empleado bucarEmpleado(int id) {
        return empJPA.find(id);
    }

    //Tanto en actualización como eliminación necesitan el ID para buscar el usuario
    public void gestionEmpleado(Scanner t, String opcion) {
        System.out.println("Inserta el id del empleado para "+opcion);
        int idBuscar = t.nextInt();
        if(opcion.equals("actualizar")){ //Actualiza el usuario
            Empleado encontrado = bucarEmpleado(idBuscar);
            if(encontrado == null){//No existe el empleado
                System.out.println("Empleado con el id "+idBuscar+" no existe");
            }else{//Actualización
                System.out.println("Empleado encontrado");
                actualizarEmpleado(t,encontrado);
            }
        }else{// Elimina el usuario
            eliminarEmpleado(idBuscar);
        }
    }

    //Elegir una de las opciones para actualizar al empleado
    public void actualizarEmpleado(Scanner t, Empleado buscar) {
        //Mostrar el empleado antes, para ver los datos
        System.out.println("Mostrar: \n"+buscar);

        int opcion;
        do{
            System.out.println("Que quieres cambiar: " +
                "\n 1. Nombre" +
                "\n 2. Apellido "+
                "\n 3. Trabajo"+
                "\n 4. Salario "+
                "\n 5. Fecha de inicio ");
            opcion = t.nextInt();
            switch(opcion){
               case 1:
                   t.nextLine();//Evita el salto de linea
                   String nombre = validationTexto(t,"nombre");
                   buscar.setName(nombre); //Parámetro modificado
                break;
              case 2:
                  t.nextLine();
                  String apellido = validationTexto(t,"apellido");
                  buscar.setSurname(apellido);
                break;
              case 3:
                  t.nextLine();
                  String cargo = validationTexto(t,"trabajo que ocupa");
                  buscar.setJob(cargo);
                break;
              case 4:
                  int salario = validationSalario(t, "salario");
                  buscar.setMiWage(salario);
                  break;
              case 5:
                  LocalDate fecha = validationFechaInicio(t,"fecha de inicio");
                  buscar.setStart_date(fecha);
                  break;
              default:
                 System.out.println("Lo siento pero no existe ese valor. Debes introducir valores (1 a 5)");
                 break;
            }// fin switch

        }while(opcion < 1 || opcion > 5);// fin do...while

        empJPA.update(buscar);//Actualizar empleado
    }

    public LocalDate validationFechaInicio(Scanner t, String fechaDeIncio) {
        // Debemos comprobar la fecha por separado, el año YYYY, el mes MM y el día DD
        // * El año debe ser mayor a 0 y menor que el año actual
        // * El mes 1 - 12
        // * El día 1 - 31
        int ano = 0, mes = 0, dia = 0;

        while ((ano <= 0 || ano > LocalDate.now().getYear()) || (mes < 1 || mes > 12) || (dia < 1 || dia > 31)) {
            System.out.println("Introduce la "+fechaDeIncio+" correctamente siguiendo los parámetros: " +
                        "\n Año -> YYYY 0001 hasta " + LocalDate.now().getYear());
            ano = t.nextInt();
            System.out.println("Mes -> MM o M 01-12");
            mes = t.nextInt();
            System.out.println("Introduce el dia DD o D 01-31");
            dia = t.nextInt();
        } // fin while

        System.out.println("Fecha válida");
        //Pasarlo a fecha
        return LocalDate.of(ano ,mes, dia);
    }

    public Integer validationSalario(Scanner t, String opcion) {
        //Salario inválido
        // * Introducimos valor negativo o 0
        System.out.println("Introduce el "+opcion);
        int valor = t.nextInt(); //No va a salir del escaneo hasta teclear un número entero

        while(valor <= 0){
            System.out.println("No puedes introducir un salario negativo o 0");
            valor = t.nextInt();
        }// fin while

        System.out.println("Salario válido");
        return valor;
    }

    public String validationTexto(Scanner t, String opcion) {
        //String inválido
        // * Si es un campo vacío
        String valor;

        do { //Si no está vacío se detiene el ciclo
            System.out.println("Debes introducir un " + opcion);
            valor = t.nextLine();
        }while(valor.isEmpty());// fin do...while

        //Darle el formato, la primera letra en Mayúscula y el resto minúscula, también quitar los espacios en blanco
        valor = valor.substring(0,1).toUpperCase().trim()+valor.substring(1).toLowerCase().trim();
        opcion = opcion.substring(0,1).toUpperCase().trim()+opcion.substring(1).toLowerCase().trim();
        System.out.println(opcion+" válido");
        return valor;
    }
}
