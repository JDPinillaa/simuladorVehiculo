/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;

/**
 * Clase que representa un tipo específico de motor: Motor 1000.
 * Este motor tiene una velocidad máxima de 100 km/h, lo que lo hace adecuado
 * para vehículos de baja potencia o uso urbano.
 * 
 * Extiende la clase abstracta Motor.
 * 
 * 
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class Motor1000 extends Motor {

    /**
     * Constructor de la clase Motor1000.
     * Establece la velocidad máxima del motor en 100 km/h.
     */
    public Motor1000() {
        this.velocidadMaxima = 100;
    }
}
