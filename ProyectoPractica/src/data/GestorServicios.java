package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    public void instanciacion() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("Ruta del Completo", 4, 5));
        servicios.add(new RutaGastronomica("Ruta de la Empanada", 3, 6));
        servicios.add(new PaseoLacustre("Paseo del Lago Ness", 6, "Barco"));
        servicios.add(new PaseoLacustre("Paseo del Lago Llanquihue", 6, "Bote"));
        servicios.add(new ExcursionCultural("Excursion del Carrete", 12, "Ruta Baco"));
        servicios.add(new ExcursionCultural("Excursion Trasandina", 12, "Los andes"));

        for(ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }

    }
}
