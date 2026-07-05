package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    public List<ServicioTuristico> obtenerServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("Ruta del Kuchen", 4, 5));

        servicios.add(new RutaGastronomica("Ruta Cervecera", 5, 6));

        servicios.add(new PaseoLacustre("Lago Llanquihue", 3, "Catamarán"));

        servicios.add(new PaseoLacustre("Todos los Santos", 2, "Lancha"));

        servicios.add(new ExcursionCultural("Museo Colonial", 2, "Museo Antonio Felmer"));

        servicios.add(new ExcursionCultural("Puerto Varas Histórico", 3, "Centro Histórico"));

        return servicios;

    }

}