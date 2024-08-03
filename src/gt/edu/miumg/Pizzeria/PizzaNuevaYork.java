package gt.edu.miumg.Pizzeria;

public class PizzaNuevaYork extends Pizza{

    private String estiloCorte;


    public PizzaNuevaYork(String nombre, int cantidad, double precio, String estiloCorte) {
        super(nombre, cantidad, precio);
        this.estiloCorte = estiloCorte;
        ingredientes.add(new Masa("Clásica", 1));
        ingredientes.add(new Salsa("Picante", 2));
        ingredientes.add(new Queso("Mozarella", 5));
    }

    @Override
    public void Preparar() {
        super.Preparar();
        System.out.println("Preparando Pizza Nueva York");
    }
}
