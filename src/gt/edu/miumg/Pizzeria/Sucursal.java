package gt.edu.miumg.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados= new ArrayList<>();
    private List<Equipo> equipos= new ArrayList<>();
    private List<Ingredientes> ingredientes = new ArrayList<>();
    private List<Pizza> pizzas = new ArrayList<>();

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                ", equipos=" + equipos +
                ", ingredientes=" + ingredientes +
                ", pizzas=" + pizzas +
                '}';
    }

    public void AgregarEmpleado(Empleado empleado) {
        System.out.println("Agregando Equipo.....");
        empleados.add(empleado);

    }

    public void AgregarIngrediente(Ingredientes ingrediente) {
        System.out.println("Agregando ingredientes.....");
        ingredientes.add(ingrediente);
    }

    public void AgregarEquipo(Equipo equipo){
        System.out.println("Agregando Equipo.....");
        equipos.add(equipo);
    }

    public void AgregarEspecialidad(Pizza pizza){
        System.out.println("Agregando Especialidad.....");
        pizzas.add(pizza);
    }
}
