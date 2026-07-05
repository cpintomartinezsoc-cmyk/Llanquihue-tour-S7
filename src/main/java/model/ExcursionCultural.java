package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre,
                             int duracionHoras,
                             String lugarHistorico) {

        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("...::: Excursión Cultural :::...");
        super.mostrarInformacion();
        System.out.println("Lugar histórico: " + lugarHistorico);

    }
}