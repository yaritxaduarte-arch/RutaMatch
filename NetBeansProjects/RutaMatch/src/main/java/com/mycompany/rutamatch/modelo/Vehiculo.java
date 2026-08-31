/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rutamatch.modelo;

/**
 *
 * @author yarit
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int capacidad;
 
    // Dueño del vehículo (lado "1" de la relación Conductor 1 -- 1..* Vehiculo)
    private Conductor conductor;
 
    public Vehiculo(String placa, String marca, String modelo, int capacidad, Conductor conductor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.conductor = conductor;
    }
 
    public String getPlaca() {
        return placa;
    }
 
    public void setPlaca(String placa) {
        this.placa = placa;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getCapacidad() {
        return capacidad;
    }
 
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
 
    public Conductor getConductor() {
        return conductor;
    }
 
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
 