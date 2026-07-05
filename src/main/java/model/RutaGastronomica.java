package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre,
                            int duracionHoras,
                            int numeroDeParadas) {

        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("...::: Ruta Gastronómica :::...");
        super.mostrarInformacion();
        System.out.println("Número de paradas: " + numeroDeParadas);

    }
}