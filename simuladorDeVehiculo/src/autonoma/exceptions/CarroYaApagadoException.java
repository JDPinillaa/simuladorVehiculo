/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.exceptions;

/**
 * Excepción personalizada que indica que el carro ya está apagado.
 * 
 * Esta excepción se lanza cuando se intenta apagar un vehículo que ya se encuentra apagado.
 * 
 * Extiende la clase Exception.
 * 
 * Su propósito es manejar errores relacionados con intentos redundantes de apagar el motor del vehículo.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class CarroYaApagadoException extends Exception {

    /**
     * Constructor de la clase CarroYaApagadoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public CarroYaApagadoException(String message) {
        super(message);
    }
}
