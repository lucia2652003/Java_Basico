package entities;

public class Mamifero extends Animal {

    private Integer numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Integer numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "numeroPatas=" + numeroPatas +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamifero");
    }
}
