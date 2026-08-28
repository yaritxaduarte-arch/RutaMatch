package com.mycompany.rutamatch.controller;

import com.mycompany.rutamatch.modelo.Conductor;
import com.mycompany.rutamatch.modelo.IActualizable;
import com.mycompany.rutamatch.modelo.Vehiculo;
import com.mycompany.rutamatch.modelo.Viaje;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControllerViaje {

    private final List<Viaje> viajes;
    private final List<IActualizable> guiActualiza;

    public ControllerViaje() {
        viajes = new ArrayList<>();
        guiActualiza = new ArrayList<>();
    }
    public Viaje crearViaje(int idViaje, Date fecha, LocalTime hora, int cuposDisponibles,
                             Conductor conductor, Vehiculo vehiculo) {

        try {

            if (conductor == null) {
                throw new IllegalArgumentException(
                        "El conductor no puede ser nulo."
                );
            }

            if (vehiculo == null) {
                throw new IllegalArgumentException(
                        "El vehículo no puede ser nulo."
                );
            }

            if (idViaje <= 0) {
                throw new IllegalArgumentException(
                        "El ID del viaje debe ser mayor a cero."
                );
            }

            if (buscarViaje(idViaje) != null) {
                throw new IllegalArgumentException(
                        "Ya existe un viaje con el ID: " + idViaje
                );
            }

            if (cuposDisponibles <= 0) {
                throw new IllegalArgumentException(
                        "Los cupos deben ser mayores a cero."
                );
            }
            if (cuposDisponibles > vehiculo.getCapacidad()) {
                throw new IllegalArgumentException(
                        "Los cupos (" + cuposDisponibles + ") no pueden superar la capacidad del vehículo ("
                                + vehiculo.getCapacidad() + ")."
                );
            }

            Viaje viaje = conductor.publicarViaje(idViaje, fecha, hora, cuposDisponibles, vehiculo);
            viajes.add(viaje);
            actualizar();

            return viaje;

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al crear el viaje.",
                    e
            );
        }
    }
    public List<Viaje> listarViajes() {

        try {

            return new ArrayList<>(viajes);

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al obtener los viajes.",
                    e
            );
        }
    }

    public Viaje buscarViaje(int idViaje) {

        try {

            if (idViaje <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            for (Viaje v : viajes) {

                if (v.getIdViaje() == idViaje) {
                    return v;
                }
            }

            return null;

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al buscar el viaje.",
                    e
            );
        }
    }
    public void actualizarCuposViaje(int idViaje, int nuevosCupos) {

        try {

            if (idViaje <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            if (nuevosCupos < 0) {
                throw new IllegalArgumentException(
                        "Los cupos no pueden ser negativos."
                );
            }

            Viaje viaje = buscarViaje(idViaje);

            if (viaje == null) {
                throw new IllegalArgumentException(
                        "No existe un viaje con el ID: " + idViaje
                );
            }

            if (nuevosCupos > viaje.getVehiculo().getCapacidad()) {
                throw new IllegalArgumentException(
                        "Los cupos (" + nuevosCupos + ") no pueden superar la capacidad del vehículo ("
                                + viaje.getVehiculo().getCapacidad() + ")."
                );
            }

            viaje.actualizarCupos(nuevosCupos);
            actualizar();

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al actualizar el viaje.",
                    e
            );
        }
    }
    public void eliminarViaje(int idViaje) {

        try {

            if (idViaje <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            Viaje viaje = buscarViaje(idViaje);

            if (viaje == null) {
                throw new IllegalArgumentException(
                        "No existe un viaje con el ID: " + idViaje
                );
            }

            viaje.cancelarViaje();
            viajes.remove(viaje);
            actualizar();

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al eliminar el viaje.",
                    e
            );
        }
    }

    // ---------- Observer ----------
    public void actualizar() {
        for (IActualizable act : guiActualiza) {
            act.actualizar();
        }
    }

    public void addActualizable(IActualizable actualizable) {
        guiActualiza.add(actualizable);
    }
}