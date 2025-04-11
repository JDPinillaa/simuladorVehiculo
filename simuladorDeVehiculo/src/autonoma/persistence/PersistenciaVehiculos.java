package autonoma.persistence;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Clase que gestiona la persistencia de datos relacionados con los vehículos.
 * Permite leer la configuración de un vehículo desde un archivo de texto.
 * 
 * El archivo debe contener especificaciones en el formato:
 * - llantas <tipo_de_llantas>
 * - motor <tipo_de_motor>
 * 
 * Estas configuraciones se utilizan para inicializar las características del vehículo.
 * 
 * @author Santiago
 * @since 20250405
 * @version 1.0
 */
public class PersistenciaVehiculos {

    /**
     * Lee la configuración del vehículo desde el archivo "data/especificaciones.txt".
     * 
     * @return Un arreglo de cadenas donde:
     *         - [0] contiene el tipo de llantas.
     *         - [1] contiene el tipo de motor.
     *         Si ocurre un error o no se encuentra una configuración, los valores serán null.
     */
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



