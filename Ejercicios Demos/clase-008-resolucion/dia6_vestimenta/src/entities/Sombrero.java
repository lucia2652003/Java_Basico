package entities;

public class Sombrero extends Vestimenta{

    private String tipo;
    private String tamannio;
    public Sombrero() {
    }

    public Sombrero(String codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamannio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamannio = tamannio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamannio() {
        return tamannio;
    }

    public void setTamannio(String tamannio) {
        this.tamannio = tamannio;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Soy un sombrero y mi tipo es: " + this.getTipo());
    }

    @Override
    public String toString() {
        return "Sombrero{" +
                "tipo='" + tipo + '\'' +
                ", tamannio='" + tamannio + '\'' +
                '}';
    }
}
