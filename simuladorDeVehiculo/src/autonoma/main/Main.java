import autonoma.models.*;
import autonoma.exceptions.*;
import autonoma.views.*;
import autonoma.persistence.PersistenciaVehiculos;

public class Main {

    public static void main(String[] args) {
        try {
            // Leer archivo y obtener configuración
            String[] configuracion = PersistenciaVehiculos.leerConfiguracionVehiculo();
            String tipoLlantas = configuracion[0]; // Bonitas
            String tipoMotor = configuracion[1];   // 3000

            // Instanciar motor
            Motor motor;
            if (tipoMotor.equals("3000")) {
                motor = new Motor3000();
            } else if (tipoMotor.equals("1000")) {
                motor = new Motor1000();
            } else {
                throw new IllegalArgumentException("Tipo de motor no válido: " + tipoMotor);
            }

            // Instanciar llantas
            Llanta llantas;
            if (tipoLlantas.equalsIgnoreCase("Bonitas")) {
                llantas = new LlantasBuenas();
            } else if (tipoLlantas.equalsIgnoreCase("Baratas")) {
                llantas = new LlantasBaratas();
            } else {
                throw new IllegalArgumentException("Tipo de llantas no válido: " + tipoLlantas);
            }

            // Crear el carro
            Carro carro = new Carro(motor, llantas);

            // Usar el carro
            carro.encender();
            carro.acelerar(50);
            carro.frenar(20);
            carro.mostrarEstado();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Mostrar cabina
        java.awt.EventQueue.invokeLater(() -> new Cabina().setVisible(true));
    }
}
