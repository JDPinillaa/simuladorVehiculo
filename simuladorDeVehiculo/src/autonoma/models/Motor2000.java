package autonoma.models;

/**
 * Clase que representa un tipo específico de motor: Motor 2000.
 * Este motor tiene una velocidad máxima de 160 km/h, lo que lo hace adecuado
 * para vehículos de mayor potencia y uso en carretera.
 * 
 * Extiende la clase abstracta Motor.
 * 
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class Motor2000 extends Motor {

    /**
     * Constructor de la clase Motor2000.
     * Establece la velocidad máxima del motor en 160 km/h.
     */
    public Motor2000() {
        this.velocidadMaxima = 160;
    }
}
