package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre
                + " | Duración (Horas): " + duracionHoras
                + " | Lugar Historico: " + lugarHistorico);
    }

    public String getLugarHistorico() {return lugarHistorico;}
    public void setLugarHistorico(String lugarHistorico) {this.lugarHistorico = lugarHistorico;}

    @Override
    public String toString() {
        return super.toString() + " | Lugar Historico: " + lugarHistorico;
    }
}
