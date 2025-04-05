/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;
import autonoma.exceptions.*;

/**
 * Clase que representa un carro.
 * 
 * @author juand
 * @since 20250402
 * @version 1.1
 */
public class Carro {
    private Motor motor;
    private Llanta llantas;
    private boolean encendido;
    private int velocidadActual;
    private boolean haPatinado;
    private boolean seHaAccidentado;
    
    public Carro(Motor motor, Llanta llantas) {
        this.motor = motor;
        this.llantas = llantas;
        this.encendido = false;
        this.velocidadActual = 0;
        this.haPatinado = false;
        this.seHaAccidentado = false;
    }
    
    public void encender() throws CarroYaEncendidoException {
        if (encendido) throw new CarroYaEncendidoException("El vehículo ya está encendido.");
        encendido = true;
        System.out.println("Vehículo encendido.");
    }

    public void apagar() throws CarroYaApagadoException, CarroAccidentadoException {
        if (!encendido) throw new CarroYaApagadoException("El vehículo ya está apagado.");
        if (velocidadActual > 60) {
            seHaAccidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new CarroAccidentadoException("¡Accidente! No se puede apagar a esa velocidad.");
        }
        encendido = false;
        System.out.println("Vehículo apagado.");
    }

    public void acelerar(int kmh) throws CarroApagadoException, CarroAccidentadoException {
        if (!encendido) throw new CarroApagadoException("No se puede acelerar con el vehículo apagado.");
        velocidadActual += kmh;
        if (velocidadActual > motor.getVelocidadMaxima()) {
            seHaAccidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new CarroAccidentadoException("¡El motor falló! Aceleró más de lo permitido.");
        }
        System.out.println("Acelerando " + kmh + " km/h. Velocidad actual: " + velocidadActual);
    }

    public void frenar(int kmh) throws CarroApagadoException, CarroDetenidoException, CarroHaPatinadoException, CarroAccidentadoException {
        if (!encendido) throw new CarroApagadoException("No se puede frenar con el vehículo apagado.");
        if (velocidadActual == 0) throw new CarroDetenidoException("El vehículo ya está detenido.");

        if (haPatinado) {
            System.out.println("El vehículo está patinando, no puedes frenar más hasta detenerse.");
            return;
        }

        if (kmh >= 30 || velocidadActual - kmh < 0) {
            haPatinado = true;
            throw new CarroHaPatinadoException("¡El vehículo patinó al frenar!");
        }

        velocidadActual -= kmh;
        if (velocidadActual == 0) haPatinado = false;

        System.out.println("Frenando " + kmh + " km/h. Velocidad actual: " + velocidadActual);
    }

    public void frenarBruscamente(int kmh) throws CarroHaPatinadoException, CarroApagadoException, CarroDetenidoException, CarroAccidentadoException {
        if (seHaAccidentado) throw new CarroAccidentadoException("El vehículo está accidentado.");
        if (!encendido) throw new CarroApagadoException("El vehículo está apagado.");
        if (velocidadActual == 0) throw new CarroDetenidoException("El vehículo está detenido.");

        if (haPatinado) {
            System.out.println("No puedes frenar bruscamente mientras patinas.");
            return;
        }

        if (velocidadActual > llantas.getLimitepatinaje() || kmh > velocidadActual || kmh >= 30) {
            haPatinado = true;
            throw new CarroHaPatinadoException("¡Patinazo! El frenado fue muy brusco.");
        }

        velocidadActual -= kmh;
        if (velocidadActual <= 0) {
            velocidadActual = 0;
            haPatinado = false;
        }

        System.out.println("Frenado brusco. Velocidad actual: " + velocidadActual);
    }

    public void mostrarEstado() {
        System.out.println("=== Estado del Vehículo ===");
        System.out.println("Encendido: " + encendido);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Patinando: " + haPatinado);
        System.out.println("Accidentado: " + seHaAccidentado);
        System.out.println("===========================");
    }
}
