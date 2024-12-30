package Semana_9_12.Dia_11_12_2024.entities;

public class Persona {

    //Atributos
    int id;
    String nombre;
    int edad;
    String direccion;
    int telefono;

    //Constructores
    public Persona(){
    }

    public Persona(int id, String nombre, int edad, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Getters y Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + ' ' +
                ", Edad: " + edad + " años";
    }

}
