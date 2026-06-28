package model;

/**
 * Representa un servicio turístico ofrecido por
 * la agencia Llanquihue Tour.
 *
 */
public class ServicioTuristico {
    
    private String nombre;
    private int duracionHoras;
    
    
    /**
    * Constructor de la clase ServicioTuristico.
    *
    * @param nombre nombre del servicio.
    * @param duracionHoras duración del servicio en horas.
    */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
    
    /**
    * Devuelve la información básica del servicio.
    *
    * @return información del servicio en formato texto.
    */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " | Duracion horas: " + duracionHoras + " hrs";
    }

}
