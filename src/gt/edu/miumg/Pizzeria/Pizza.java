package gt.edu.miumg.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private int cantidad;
    private double precio;
    protected List<Ingredientes> ingredientes=new ArrayList<>();

    public Pizza(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void Preparar(){
        System.out.println("Preparando...");
    }
    public void Hornear(){
        System.out.println("Horneando...");
    }
    public void Cortar(){
        System.out.println("Cortando...");
    }
    public void Empacar(){
        System.out.println("Empacando...");
    }

}
