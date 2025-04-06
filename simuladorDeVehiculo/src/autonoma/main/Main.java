package autonoma.main;

import autonoma.models.*;
import autonoma.exceptions.*;

public class Main {

    public static void main(String[] args) {
        try {
            
            Motor motor = new Motor3000(); 
            Llanta llantas = new LlantasBaratas(); 

            Carro carro = new Carro(motor, llantas);

            // Encender el carro
            carro.encender();

            // Acelerar el carro
            carro.acelerar(50);

            // Frenar el carro
            carro.frenar(20);

            // Mostrar el estado del carro
            carro.mostrarEstado();

        } catch (CarroYaEncendidoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (CarroApagadoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (CarroAccidentadoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (CarroDetenidoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (CarroHaPatinadoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
