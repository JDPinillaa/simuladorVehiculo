/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;
import autonoma.exceptions.*;
import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Motor Encendido correctamente", "Motor encendido", JOptionPane.INFORMATION_MESSAGE);
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
        JOptionPane.showMessageDialog(null, "Motor apagado correctamente", "Motor apagado", JOptionPane.INFORMATION_MESSAGE);
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
        JOptionPane.showMessageDialog(null, "Acelerando " + kmh + " km/h. Velocidad actual: " + velocidadActual, "Acelerando", JOptionPane.INFORMATION_MESSAGE);
    }

    public void frenar(int kmh) throws CarroApagadoException, CarroDetenidoException, CarroHaPatinadoException, CarroAccidentadoException {
        if (!encendido) throw new CarroApagadoException("No se puede frenar con el vehículo apagado.");
        if (velocidadActual == 0) throw new CarroDetenidoException("El vehículo ya está detenido.");

        if (haPatinado) {
            JOptionPane.showMessageDialog(null, "El vehículo está patinando, no puedes frenar más hasta detenerse.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (kmh >= 30 || velocidadActual - kmh < 0) {
            haPatinado = true;
            throw new CarroHaPatinadoException("¡El carro patinó al frenar!");
        }

        velocidadActual -= kmh;
        if (velocidadActual == 0) haPatinado = false;
        JOptionPane.showMessageDialog(null, "Frenando " + kmh + " km/h. Velocidad actual: " + velocidadActual, "Frenando", JOptionPane.INFORMATION_MESSAGE);
    }

    public void frenarBruscamente(int kmh) throws CarroHaPatinadoException, CarroApagadoException, CarroDetenidoException, CarroAccidentadoException {
        if (seHaAccidentado) throw new CarroAccidentadoException("El vehículo está accidentado.");
        if (!encendido) throw new CarroApagadoException("El vehículo está apagado.");
        if (velocidadActual == 0) throw new CarroDetenidoException("El vehículo está detenido.");

        if (haPatinado) {
            JOptionPane.showMessageDialog(null, "No puedes frenar bruscamente mientras patinas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (velocidadActual > llantas.getLimitePatinaje() || kmh > velocidadActual || kmh >= 30) {
            haPatinado = true;
            throw new CarroHaPatinadoException("¡Patinazo! El frenado fue muy brusco.");
        }

        velocidadActual -= kmh;
        if (velocidadActual <= 0) {
            velocidadActual = 0;
            haPatinado = false;
        }

        JOptionPane.showMessageDialog(null, "Frenado brusco. Velocidad actual: " + velocidadActual, "Frenado Brusco", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarEstado() {
        JOptionPane.showMessageDialog(null, 
            "=== Estado del Vehículo ===\n" +
            "Encendido: " + encendido + "\n" +
            "Velocidad Actual: " + velocidadActual + " km/h\n" +
            "Patinando: " + haPatinado + "\n" +
            "Accidentado: " + seHaAccidentado + "\n" +
            "===========================", 
            "Estado del Vehículo", JOptionPane.INFORMATION_MESSAGE);
    }
}
