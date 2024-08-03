package gt.edu.miumg.Pizzeria;

public class Equipo {
    private String estado;
    private String tipo;

    public Equipo(String estado, String tipo) {
        this.estado = estado;
        this.tipo = tipo;

    }

    @Override
    public String toString() {
        return "Equipo{" +
                "estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void Encender(){
        estado= "Encendido";
        System.out.println("Equipo: " + estado);
    }

    public void Apagar(){
        estado= "Apagado";
        System.out.println("Equipo: " + estado);
    }

    public void Preparar(){
        estado= "Preparando";
        System.out.println("Equipo: " + estado + " orden!!!");
    }
}
