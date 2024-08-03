
import gt.edu.miumg.Pizzeria.*;
public class Main {
    public static void main(String[] args) {

        //Agregar Empleados
        Empleado empleado1 = new Empleado("Juan","Cajero",1000);
        Empleado empleado2 = new Empleado("Chris","Mesero",1100);

        //System.out.println("Empleado 1: " + empleado1);
        //System.out.println("Empleado 2: " + empleado2);


        //Agregar Equipo
        Equipo equipo1 = new Equipo("Apagado","Cocina");
        Equipo equipo2 = new Equipo("Encendido","Cocina");

        //System.out.println("Equipo 1: " + equipo1);
        //System.out.println("Equipo 2: " + equipo2);

        //Agregar Ingredientes
        Ingredientes masa = new Masa("Clásica", 2);
        Ingredientes sabor = new Salsa("Picante", 10);
        Ingredientes queso = new Queso("Queso", 5);

        //Especialidades
        PizzaNuevaYork pizzaNY = new PizzaNuevaYork("Pizza Nueva York", 2,10.99,"Tradicional");
        PizzaChicago PizzaCHI = new PizzaChicago("Pizza Chicago", 2,13.99,"Tradicional");

        //Sucursal
        Sucursal sucursalNY = new Sucursal("Pizzería Nueva York","Zona 10");
        //System.out.println("Sucursal: " + sucursalNY.toString());

        //Datos
        System.out.println("Datos Sucursal:");
        System.out.println(sucursalNY);
        sucursalNY.AgregarEmpleado(empleado1);
        sucursalNY.AgregarEmpleado(empleado2);
        sucursalNY.AgregarEquipo(equipo1);
        sucursalNY.AgregarEquipo(equipo2);
        sucursalNY.AgregarIngrediente(masa);
        sucursalNY.AgregarIngrediente(sabor);
        sucursalNY.AgregarIngrediente(queso);
        sucursalNY.AgregarEspecialidad(pizzaNY);

    }
}