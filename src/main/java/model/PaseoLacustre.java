package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre,
                         int duracionHoras,
                         String tipoEmbarcacion) {

        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("...::: Paseo Lacustre :::...");
        super.mostrarInformacion();
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);

    }
}