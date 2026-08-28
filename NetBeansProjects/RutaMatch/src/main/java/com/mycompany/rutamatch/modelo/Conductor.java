/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rutamatch.modelo;

 
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.util.Date;  


/**
 *
 * @author yarit
 */
public class Conductor extends Usuario{
    private int licencia;
    
    private List<Vehiculo> vehiculos;
    private List<Viaje> viajesPublicados;
    
    public Conductor(String estado, String nombre, String correo, 
                String telefono, String contraseña,int idUsuario,int licencia)
    { super(estado,contraseña, telefono, correo, nombre, idUsuario);
    this.licencia = licencia;
    this.vehiculos = new ArrayList<>();
    this.viajesPublicados = new ArrayList<>();
    }
    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }
    
    
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
 
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
 
    public List<Viaje> getViajesPublicados() {
        return viajesPublicados;
    }
 
    public void setViajesPublicados(List<Viaje> viajesPublicados) {
        this.viajesPublicados = viajesPublicados;
    }
    
    public Viaje publicarViaje(
        int idViaje,
        Date fecha,
        LocalTime hora,
        int cuposDisponibles,
        Vehiculo vehiculo) {

    Viaje viaje = new Viaje(
            idViaje,
            fecha,
            hora,
            cuposDisponibles,
            this,
            vehiculo
    );

    viajesPublicados.add(viaje);

    return viaje;
}
}
