package model;

/**
 * Representa una excursión cultural
 * organizada por la agencia.
 * 
 * Hereda de ServicioTuristico.
 */
public class ExcursionCultural extends ServicioTuristico{
    
    private String lugarHistorico;

    /**
    * Constructor de la clase ExcursionCultural.
    *
    * @param nombre nombre de la excursión.
    * @param duracionHoras duración en horas.
    * @param lugarHistorico lugar histórico.
    */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Lugar historico: " + lugarHistorico;
    }
    
}
