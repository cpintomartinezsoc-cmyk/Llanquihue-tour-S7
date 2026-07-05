package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        List<ServicioTuristico> servicios = gestor.obtenerServicios();

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

            System.out.println("--------------------------------");

        }

    }

}