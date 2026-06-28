package model;

/**
 * Representa un paseo lacustre realizado
 * por la agencia.
 * 
 * Hereda de ServicioTuristico.
 */
public class PaseoLacustre extends ServicioTuristico{
    
    private String tipoEmbarcacion;
    
    /**
    * Constructor de la clase PaseoLacustre.
    *
    * @param nombre nombre del paseo.
    * @param duracionHoras duración en horas.
    * @param tipoEmbarcacion tipo de embarcación utilizada.
    */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo embarcacion: " + tipoEmbarcacion;
    }
    
}
