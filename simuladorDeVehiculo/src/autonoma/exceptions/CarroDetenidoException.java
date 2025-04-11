/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.exceptions;

/**
 * Excepción personalizada que indica que el carro ya está detenido.
 * 
 * Esta excepción se lanza cuando se intenta frenar un vehículo que ya tiene
 * una velocidad de 0 km/h.
 * 
 * Extiende la clase Exception.
 * 
 * Su propósito es manejar errores relacionados con intentos de frenado innecesarios.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class CarroDetenidoException extends Exception {

    /**
     * Constructor de la clase CarroDetenidoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public CarroDetenidoException(String message) {
        super(message);
    }
}
