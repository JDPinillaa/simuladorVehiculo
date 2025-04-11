/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.models;
import autonoma.exceptions.*;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 * Clase que representa un carro.
 * Contiene la lógica para encender, apagar, acelerar, frenar y mostrar el estado del vehículo.
 * También maneja situaciones como accidentes y patinaje.
 * 
 * @author juand
 * @since 20250402
 * @version 1.1
 */
public class Carro {

    /**
     * Motor del carro.
     */
    private Motor motor;

    /**
     * Llantas del carro.
     */
    private Llanta llantas;

    /**
     * Estado del motor (encendido o apagado).
     */
    private boolean encendido;

    /**
     * Velocidad actual del carro en km/h.
     */
    private int velocidadActual;

    /**
     * Indica si el carro está patinando.
     */
    private boolean haPatinado;

    /**
     * Indica si el carro ha sufrido un accidente.
     */
    private boolean seHaAccidentado;

    /**
     * Constructor de la clase Carro.
     * 
     * @param motor Motor del carro.
     * @param llantas Llantas del carro.
     */
    public Carro(Motor motor, Llanta llantas) {
        this.motor = motor;
        this.llantas = llantas;
        this.encendido = false;
        this.velocidadActual = 0;
        this.haPatinado = false;
        this.seHaAccidentado = false;
    }

    /**
     * Enciende el motor del carro.
     * 
     * @throws CarroYaEncendidoException Si el carro ya está encendido.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void encender() throws CarroYaEncendidoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (encendido) throw new CarroYaEncendidoException("El vehículo ya está encendido.");
        encendido = true;
        try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(
            getClass().getResourceAsStream("/autonoma/sounds/startEngine.wav"))) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        }
        JOptionPane.showMessageDialog(null, "Motor Encendido correctamente", "Motor encendido", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Apaga el motor del carro.
     * 
     * @throws CarroYaApagadoException Si el carro ya está apagado.
     * @throws CarroAccidentadoException Si el carro está accidentado.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void apagar() throws CarroYaApagadoException, CarroAccidentadoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!encendido) throw new CarroYaApagadoException("El vehículo ya está apagado.");
        if (velocidadActual > 60) {
            seHaAccidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new CarroAccidentadoException("¡Accidente! No se puede apagar a esa velocidad.");
        }
        encendido = false;
        try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(
            getClass().getResourceAsStream("/autonoma/sounds/stopEngine.wav"))) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        }
        JOptionPane.showMessageDialog(null, "Motor apagado correctamente", "Motor apagado", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Acelera el carro en una cantidad específica de km/h.
     * 
     * @param kmh Cantidad de km/h a acelerar.
     * @throws CarroApagadoException Si el carro está apagado.
     * @throws CarroAccidentadoException Si el carro está accidentado.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void acelerar(int kmh) throws CarroApagadoException, CarroAccidentadoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!encendido) throw new CarroApagadoException("No se puede acelerar con el vehículo apagado.");
        velocidadActual += kmh;
        if (velocidadActual > motor.getVelocidadMaxima()) {
            seHaAccidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new CarroAccidentadoException("¡El motor falló! Aceleró más de lo permitido.");
        }
        try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(
            getClass().getResourceAsStream("/autonoma/sounds/engineAccelerating.wav"))) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        }
        JOptionPane.showMessageDialog(null, "Acelerando " + kmh + " km/h. Velocidad actual: " + velocidadActual, "Acelerando", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Frena el carro en una cantidad específica de km/h.
     * 
     * @param kmh Cantidad de km/h a frenar.
     * @throws CarroApagadoException Si el carro está apagado.
     * @throws CarroDetenidoException Si el carro ya está detenido.
     * @throws CarroHaPatinadoException Si el carro patina al frenar.
     * @throws CarroAccidentadoException Si el carro está accidentado.
     * @throws UnsupportedAudioFileException Si el archivo de audio no es compatible.
     * @throws IOException Si ocurre un error al cargar el archivo de audio.
     * @throws LineUnavailableException Si no se puede reproducir el audio.
     */
    public void frenar(int kmh) throws CarroApagadoException, CarroDetenidoException, CarroHaPatinadoException, CarroAccidentadoException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!encendido) throw new CarroApagadoException("No se puede frenar con el vehículo apagado.");
        if (velocidadActual == 0) throw new CarroDetenidoException("El vehículo ya está detenido.");
        if (seHaAccidentado) throw new CarroAccidentadoException("El vehículo está accidentado y no puede realizar esta acción.");
        if (haPatinado) {
            JOptionPane.showMessageDialog(null, "El vehículo está patinando, no puedes frenar más hasta detenerse.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean esFrenadoBrusco = kmh > 30;

        if (esFrenadoBrusco && velocidadActual > llantas.getLimitePatinaje()) {
            haPatinado = true;
            throw new CarroHaPatinadoException("¡El vehículo patinó al frenar bruscamente!");
        }

        if (kmh > velocidadActual) {
            haPatinado = true;
            throw new CarroHaPatinadoException("¡El vehículo patinó porque el frenado fue mayor que la velocidad actual!");
        }

        velocidadActual -= kmh;

        if (velocidadActual <= 0) {
            velocidadActual = 0;
            haPatinado = false;
        }

        JOptionPane.showMessageDialog(null, "Frenando " + kmh + " km/h. Velocidad actual: " + velocidadActual, "Frenando", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Muestra el estado actual del carro.
     */
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
