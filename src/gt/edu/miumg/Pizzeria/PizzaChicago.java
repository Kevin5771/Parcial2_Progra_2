package gt.edu.miumg.Pizzeria;

public class PizzaChicago extends Pizza{

    private String grosorMasa;

    public PizzaChicago(String nombre, int cantidad, double precio, String grosorMasa) {
        super(nombre, cantidad, precio);
        this.grosorMasa = "Mediano";
        ingredientes.add(new Masa("Clásico", 2));
        ingredientes.add(new Salsa("Queso", 5));
        ingredientes.add(new Queso("Mozarrella", 5));
    }

    @Override
    public void Preparar() {
        super.Preparar();
        System.out.println("Preparando Chicago");
    }
}
