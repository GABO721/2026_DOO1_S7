package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numParadas) {
        super(nombre, duracionHoras);
        this.numParadas = numParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre
                + " | Duración (Horas): " + duracionHoras
                + " | Num. de Paradas: " + numParadas);
    }

    public int getNumParadas() {return numParadas;}
    public void setNumParadas(int numParadas) {this.numParadas = numParadas;}

    @Override
    public String toString() {
        return super.toString() + " | Num. de Paradas: " + numParadas;
    }
}
