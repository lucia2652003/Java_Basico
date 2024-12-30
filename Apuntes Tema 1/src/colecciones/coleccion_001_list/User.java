package colecciones.coleccion_001_list;

public class User {
    Integer codigo;
    String nombre;
    Integer edad;

    public User(Integer codigo, String nombre, Integer edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
}
