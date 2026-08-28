    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.rutamatch.modelo;
    import java.time.LocalTime;
    import java.util.Date;

    /**
     *
     * @author yarit
     */
    public class Viaje {
        public enum EstadoDeViaje {
        COMPLETO,
        PUBLICADO,
        FINALIZADO,
        CANCELADO
    }
        private int idViaje;
        private Date fecha;
        private LocalTime hora;
        private int cuposDisponibles;
        private EstadoDeViaje estado;

        private Conductor conductor;
        private Vehiculo vehiculo;


        public Viaje(int idViaje, Date fecha, LocalTime hora, int cuposDisponibles,
                     Conductor conductor, Vehiculo vehiculo) {
            this.idViaje = idViaje;
            this.fecha = fecha;
            this.hora = hora;
            this.cuposDisponibles = cuposDisponibles;
            this.conductor = conductor;
            this.vehiculo = vehiculo;
            this.estado = EstadoDeViaje.PUBLICADO;
        }


        public int getIdViaje() {
            return idViaje;
        }

        public void setIdViaje(int idViaje) {
            this.idViaje = idViaje;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
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

        public EstadoDeViaje getEstado() {
            return estado;
        }

        public void setEstado(EstadoDeViaje estado) {
            this.estado = estado;
        }

        public Conductor getConductor() {
            return conductor;
        }

        public void setConductor(Conductor conductor) {
            this.conductor = conductor;
        }

        public Vehiculo getVehiculo() {
            return vehiculo;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }

        public void actualizarCupos(int nuevosCupos) 
        {
            if (nuevosCupos < 0) {
                throw new IllegalArgumentException(
                        "Los cupos no pueden ser negativos."
                );
            }

            if (nuevosCupos > vehiculo.getCapacidad()) {
                throw new IllegalArgumentException(
                        "Los cupos no pueden superar la capacidad del vehículo."
                );
            }

            this.cuposDisponibles = nuevosCupos;

            if (nuevosCupos == 0) {
                this.estado = EstadoDeViaje.COMPLETO;
            } else {
                this.estado = EstadoDeViaje.PUBLICADO;
            }
        }
        public void cancelarViaje() {
        this.estado = EstadoDeViaje.CANCELADO;
        }

    }
