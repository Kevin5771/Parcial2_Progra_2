package gt.edu.miumg.Pizzeria;

public class Masa implements Ingredientes{
    private String tipo;
    private int cantidad;

    public Masa(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Masa{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public String ObtenerNombre() {
        return tipo;
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }
}
