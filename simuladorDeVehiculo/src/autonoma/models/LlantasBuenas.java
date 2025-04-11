package autonoma.models;

/**
 * Clase que representa un tipo específico de llantas: Llantas Buenas.
 * Estas llantas tienen un límite de patinaje alto, lo que significa que son muy resistentes
 * al patinaje incluso al frenar bruscamente o a altas velocidades.
 * 
 * Extiende la clase abstracta Llanta.
 * 
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class LlantasBuenas extends Llanta {

    /**
     * Constructor de la clase LlantasBuenas.
     * Establece el límite de patinaje en 110 km/h.
     */
    public LlantasBuenas() {
        this.limitePatinaje = 110;
    }
}
