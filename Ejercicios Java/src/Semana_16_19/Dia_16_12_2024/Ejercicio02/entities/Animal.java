package Semana_16_19.Dia_16_12_2024.Ejercicio02.entities;

public class Animal {
    private Integer id;
    private String nombre;
    private Integer edad;
    private String piel;
    private String alimentacion;

    public Animal() {
    }

    public Animal(Integer id, String nombre, Integer edad, String piel, String alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.piel = piel;
        this.alimentacion = alimentacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    public void saludar(){ System.out.println("Hola, soy un animal"); }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", piel='" + piel + '\'' +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }
}
