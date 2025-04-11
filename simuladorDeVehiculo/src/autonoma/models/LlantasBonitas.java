/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;

/**
 * Clase que representa un tipo específico de llantas: Llantas Bonitas.
 * Estas llantas tienen un límite de patinaje más alto en comparación con otras,
 * lo que significa que son menos propensas a patinar al frenar bruscamente o a altas velocidades.
 * 
 * Extiende la clase abstracta Llanta.
 * 
 * @author juand
 * @since 20250405
 * @version 1.0
 */
public class LlantasBonitas extends Llanta {

    /**
     * Constructor de la clase LlantasBonitas.
     * Establece el límite de patinaje en 70 km/h.
     */
    public LlantasBonitas() {
        this.limitePatinaje = 70;
    }
    
}
