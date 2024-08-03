package gt.edu.miumg.Pizzeria;

public class Queso implements Ingredientes{
    private String tipo;
    private int cantidad;


    public Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Queso{" +
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
