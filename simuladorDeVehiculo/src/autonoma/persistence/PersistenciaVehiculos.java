package autonoma.persistence;

import java.io.BufferedReader;
import java.io.FileReader;

public class PersistenciaVehiculos {

    public static String[] leerConfiguracionVehiculo() {
        String[] configuracion = new String[2]; // [0] = llantas, [1] = motor

        try (BufferedReader lector = new BufferedReader(new FileReader("data/especificaciones.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split("\\s+"); // Divide por espacios
                if (partes.length == 2) {
                    if (partes[0].equalsIgnoreCase("llantas")) {
                        configuracion[0] = partes[1];
                    } else if (partes[0].equalsIgnoreCase("motor")) {
                        configuracion[1] = partes[1];
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        return configuracion;
    }
}

    

