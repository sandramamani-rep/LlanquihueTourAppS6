package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Clase encargada de crear instancias
 * de prueba de los distintos servicios
 * turísticos.
 */
public class GestorServicios{
    
    /**
    * Crea una excursion cultural de ejemplo.
    *
    * @return objeto ExcursionCultural.
    */
    public ExcursionCultural crearExcursionCulturalUno() {
        return new ExcursionCultural("Ruta Patrimonial de Puerto Montt", 4, "Fuerte Reina Luisa");
    }
    
    /**
    * Crea una excursion cultural de ejemplo.
    *
    * @return objeto ExcursionCultural.
    */
    public ExcursionCultural crearExcursionCulturalDos() {
        return new ExcursionCultural("Historia de Chiloé", 6, "Iglesia de Castro");
    }
    
    /**
    * Crea un paseo lacustre de ejemplo.
    *
    * @return objeto PaseoLacustre.
    */
    public PaseoLacustre crearPaseoLacustreUno() {
        return new PaseoLacustre("Navegación Lago Llanquihue", 3, "Catamarán");
    }
    
    /**
    * Crea un paseo lacustre de ejemplo.
    *
    * @return objeto PaseoLacustre.
    */
    public PaseoLacustre crearPaseoLacustreDos() {
        return new PaseoLacustre("Paseo Río Maullín", 2, "Lancha");
    }
    
    /**
    * Crea una ruta gastronómica de ejemplo.
    *
    * @return objeto RutaGastronomica.
    */
    public RutaGastronomica crearRutaGastronomicaUno(){
        return new RutaGastronomica("Sabores de Puerto Varas", 5, 6);
    }
    
    /**
    * Crea una ruta gastronómica de ejemplo.
    *
    * @return objeto RutaGastronomica.
    */
    public RutaGastronomica crearRutaGastronomicaDos(){
        return new RutaGastronomica("Ruta del Salmón", 4, 5);
    }
}
