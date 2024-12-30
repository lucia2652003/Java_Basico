package entities;

public class Animal {

    private Integer id;
    private String nombre;
    private Integer edad;
    private String tipoPiel;
    private String tipoAlimentacion;

    public Animal() {
    }

    public Animal(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
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

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void saludar(){
        System.out.println("Hola, soy un animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                '}';
    }
}
