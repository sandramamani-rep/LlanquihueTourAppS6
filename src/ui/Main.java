package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase principal del sistema.
 *
 * Permite ejecutar el programa y mostrar
 * los servicios turísticos creados.
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestorServicios gestor = new GestorServicios();

        ServicioTuristico excursion1 = gestor.crearExcursionCulturalUno();
        ServicioTuristico excursion2 = gestor.crearExcursionCulturalDos();
        ServicioTuristico paseo1 = gestor.crearPaseoLacustreUno();
        ServicioTuristico paseo2 = gestor.crearPaseoLacustreDos();
        ServicioTuristico ruta1 = gestor.crearRutaGastronomicaUno();
        ServicioTuristico ruta2 = gestor.crearRutaGastronomicaDos();


        System.out.println("=== SISTEMA DE LLANQUIHUE TOUR ===");

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();
        
        System.out.println(ruta1);
        System.out.println();
        
        System.out.println(ruta2);

    }    
}
