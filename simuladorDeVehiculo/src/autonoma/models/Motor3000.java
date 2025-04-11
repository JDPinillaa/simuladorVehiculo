/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;

/**
 * Clase que representa un tipo específico de motor: Motor 3000.
 * Este motor tiene una velocidad máxima de 220 km/h, lo que lo hace adecuado
 * para vehículos de alto rendimiento y uso deportivo.
 * 
 * Extiende la clase abstracta Motor.
 * 
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class Motor3000 extends Motor {

    /**
     * Constructor de la clase Motor3000.
     * Establece la velocidad máxima del motor en 220 km/h.
     */
    public Motor3000() {
        this.velocidadMaxima = 220;
    }
}
