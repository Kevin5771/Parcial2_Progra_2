package gt.edu.miumg.Pizzeria;

public class Salsa implements Ingredientes{
    private String sabor;
    private int cantidad;

    public Salsa(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Salsa{" +
                "sabor='" + sabor + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public String ObtenerNombre() {
        return ("Sabor de la Salsa: " + this.sabor);
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }
}
