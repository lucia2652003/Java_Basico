package colecciones.Ejercicio;

public class Jugador {
    private String nombre;
    private String posicion;
    private Integer camiseta;

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, Integer camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.camiseta = camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Integer camiseta) {
        this.camiseta = camiseta;
    }

    @Override
    public String toString() {
        return "El jugador "+nombre+" juega en la posición de "+posicion+" y viste la camiseta nº "+camiseta;
    }
}
