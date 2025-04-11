package autonoma.exceptions;

/**
 * Excepción personalizada que indica que el carro está apagado.
 * 
 * Esta excepción se lanza cuando se intenta realizar una acción que requiere
 * que el vehículo esté encendido, como acelerar o frenar.
 * 
 * Extiende la clase Exception.
 * 
 * Su propósito es manejar errores relacionados con el estado del motor del vehículo.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class CarroApagadoException extends Exception {

    /**
     * Constructor de la clase CarroApagadoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public CarroApagadoException(String message) {
        super(message);
    }
}
