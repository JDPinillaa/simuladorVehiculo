/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juand
 * @since 20250402
 * @version 1.0
 */
public class Carro {
    private String modelo;
    private double cc;
    private String tipoLlanta;

    public Carro(String modelo, double cc, String tipoLlanta) {
        this.modelo = modelo;
        this.cc = cc;
        this.tipoLlanta = tipoLlanta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }
    
    
    
}
