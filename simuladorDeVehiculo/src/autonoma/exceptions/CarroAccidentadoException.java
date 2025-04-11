package autonoma.exceptions;

/**
 * Excepción personalizada que indica que el carro ha sufrido un accidente.
 * 
 * Esta excepción se lanza cuando el vehículo excede los límites de velocidad
 * permitidos o realiza una acción que provoca un accidente.
 * 
 * Extiende la clase Exception.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class CarroAccidentadoException extends Exception {

    /**
     * Constructor de la clase CarroAccidentadoException.
     * 
     * @param message Mensaje descriptivo del motivo del accidente.
     */
    public CarroAccidentadoException(String message) {
        super(message);
    }
}
