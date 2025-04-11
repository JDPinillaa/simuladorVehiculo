/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;

/**
 * Clase abstracta que representa una Llanta.
 * Define el límite de patinaje de la llanta, que puede ser utilizado para determinar
 * si un vehículo patina al frenar bruscamente.
 * 
 * Esta clase debe ser extendida por clases concretas que representen tipos específicos de llantas.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public abstract class Llanta {

    /**
     * Límite de patinaje de la llanta.
     * Representa la velocidad máxima a la que la llanta puede frenar sin patinar.
     */
    protected int limitePatinaje;

    /**
     * Obtiene el límite de patinaje de la llanta.
     * 
     * @return El límite de patinaje en km/h.
     */
    public int getLimitePatinaje() {
        return limitePatinaje;
    }
}
