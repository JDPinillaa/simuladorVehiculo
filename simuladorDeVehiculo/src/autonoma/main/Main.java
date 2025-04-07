package autonoma.main;

import autonoma.models.*;
import autonoma.persistence.PersistenciaVehiculos;
import autonoma.views.*;

public class Main {

    public static void main(String[] args) {
        try {
            // Leer archivo y obtener configuración
            String[] configuracion = PersistenciaVehiculos.leerConfiguracionVehiculo();
            String tipoLlantas = configuracion[0]; // Ej: "Bonitas"
            String tipoMotor = configuracion[1];   // Ej: "3000"

            // Instanciar motor
            Motor motor;
            switch (tipoMotor) {
                case "3000":
                    motor = new Motor3000();
                    break;
                case "2000":
                    motor = new Motor2000();
                    break;
                case "1000":
                    motor = new Motor1000();
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de motor no válido: " + tipoMotor);
            }

            // Instanciar llantas
            Llanta llantas;
            if (tipoLlantas.equalsIgnoreCase("Bonitas")) {
                llantas = new LlantasBonitas();
            } else if (tipoLlantas.equalsIgnoreCase("Buenas")) {
                llantas = new LlantasBuenas();
            } else if (tipoLlantas.equalsIgnoreCase("Baratas")) {
                llantas = new LlantasBaratas();
            } else {
                throw new IllegalArgumentException("Tipo de llantas no válido: " + tipoLlantas);
            }

            // Crear el carro
            Carro carro = new Carro(motor, llantas);

            // Mostrar cabina
            java.awt.EventQueue.invokeLater(() -> new Cabina(carro).setVisible(true));

        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        }
    }
}

