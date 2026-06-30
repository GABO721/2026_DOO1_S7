package model;

public class ServicioTuristico {
    protected String nombre;
    protected int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Duración (Horas): " + duracionHoras);
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getDuracionHoras() {return duracionHoras;}
    public void setDuracionHoras(int duracionHoras) {this.duracionHoras = duracionHoras;}

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Duracion (Horas): " + duracionHoras;
    }
}
