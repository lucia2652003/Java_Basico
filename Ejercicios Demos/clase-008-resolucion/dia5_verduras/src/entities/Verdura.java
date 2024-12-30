package entities;

public class Verdura {

    private Integer id;
    private String nombre;
    private String color;
    private double calorias;
    private boolean debeCocinarse;

    public Verdura() {
    }

    public Verdura(Integer id, String nombre, String color, double calorias, boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public boolean isDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

    @Override
    public String toString() {
        return "Verdura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", calorias=" + calorias +
                ", debeCocinarse=" + debeCocinarse +
                '}';
    }

    public String toStringPersonalizado() {
        return "Verdura{" +
                "nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
