package model;

/**
 * Representa una ruta gastronómica ofrecida
 * por la agencia.
 *
 * Hereda de ServicioTuristico.
 */
public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;
    
    /**
    * Constructor de la clase RutaGastronomica.
    *
    * @param nombre nombre de la ruta.
    * @param duracionHoras duración en horas.
    * @param numeroDeParadas cantidad de paradas gastronómicas.
    */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Numero de paradas: " + numeroDeParadas;
    }
    
}
