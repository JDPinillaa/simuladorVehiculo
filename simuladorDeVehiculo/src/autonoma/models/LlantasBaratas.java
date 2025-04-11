package autonoma.models;

/**
 * Clase que representa un tipo específico de llantas: Llantas Baratas.
 * Estas llantas tienen un límite de patinaje bajo, lo que significa que son más propensas
 * a patinar al frenar bruscamente o a altas velocidades.
 * 
 * Extiende la clase abstracta Llanta.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class LlantasBaratas extends Llanta {

    /**
     * Constructor de la clase LlantasBaratas.
     * Establece el límite de patinaje en 50 km/h.
     */
    public LlantasBaratas() {
        this.limitePatinaje = 50;
    }
}
