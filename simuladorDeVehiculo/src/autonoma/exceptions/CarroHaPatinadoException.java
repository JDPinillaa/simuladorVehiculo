/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.exceptions;

/**
 * Excepción personalizada que indica que el carro ha patinado.
 * 
 * Esta excepción se lanza cuando el vehículo pierde tracción al frenar bruscamente
 * o al realizar una acción que excede el límite de patinaje de las llantas.
 * 
 * Extiende la clase Exception.
 * 
 * Su propósito es manejar errores relacionados con el estado de patinaje del vehículo.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class CarroHaPatinadoException extends Exception {

    /**
     * Constructor de la clase CarroHaPatinadoException.
     * 
     * @param message Mensaje descriptivo del error.
     */
    public CarroHaPatinadoException(String message) {
        super(message);
    }
}
