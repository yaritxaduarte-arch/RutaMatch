package com.mycompany.rutamatch.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje<EstadoViaje> {

    private int idViaje;
    private LocalDate fecha;
    private LocalTime hora;
    private int cuposDisponibles;
    private EstadoViaje estado;

    public Viaje(int idViaje, LocalDate fecha,
                 LocalTime hora, int cuposDisponibles, EstadoViaje estado) {
        
        this.idViaje = idViaje;
        this.fecha = fecha;
        this.hora = hora;
        this.cuposDisponibles = cuposDisponibles;
        this.estado = estado;
        
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public EstadoViaje getEstado() {
        return estado;
    }

    public void setEstado(EstadoViaje estado) {
        this.estado = estado;
    }
}