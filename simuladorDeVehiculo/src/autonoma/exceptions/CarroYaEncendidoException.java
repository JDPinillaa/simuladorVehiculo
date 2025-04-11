/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.exceptions;

/**
 * Excepción personalizada que indica que el carro ya está encendido.
 * 
 * Esta excepción se lanza cuando se intenta encender un vehículo que ya se encuentra encendido.
 * 
 * Extiende la clase {@link Exception}.
 * 
 * Su propósito es manejar errores relacionados con intentos redundantes de encender el motor del vehículo.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class CarroYaEncendidoException extends Exception {

    /**
     * Constructor de la clase CarroYaEncendidoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public CarroYaEncendidoException(String message) {
        super(message);
    }
}
