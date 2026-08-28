package com.mycompany.rutamatch.controller;

import com.mycompany.rutamatch.modelo.Conductor;
import java.util.ArrayList;
import java.util.List;

public class ControllerConductor {

    private final List<Conductor> conductores;

    public ControllerConductor() {
        conductores = new ArrayList<>();
    }
    public void crearConductor(Conductor conductor) {

        try {
            

            if (conductor == null) {
                throw new IllegalArgumentException(
                        "El conductor no puede ser nulo."
                );
            }

            if (conductor.getIdUsuario() <= 0) {
                throw new IllegalArgumentException(
                        "El ID del conductor debe ser mayor a cero."
                );
            }

            if (buscarConductor(conductor.getIdUsuario()) != null) {
                throw new IllegalArgumentException(
                        "Ya existe un conductor con el ID: "
                        + conductor.getIdUsuario()
                );
            }

            if (conductor.getNombre() == null
                    || conductor.getNombre().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El nombre del conductor es obligatorio."
                );
            }

            if (conductor.getCorreo() == null
                    || conductor.getCorreo().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El correo del conductor es obligatorio."
                );
            }

            if (conductor.getLicencia() <= 0) {
                throw new IllegalArgumentException(
                        "La licencia del conductor debe ser válida."
                );
            }

            conductores.add(conductor);

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al crear el conductor.",
                    e
            );
        }
    }
    public List<Conductor> listarConductores() {

        try {

            return new ArrayList<>(conductores);

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al obtener los conductores.",
                    e
            );
        }
    }
    public Conductor buscarConductor(int idUsuario) {

        try {

            if (idUsuario <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            for (Conductor conductor : conductores) {

                if (conductor.getIdUsuario() == idUsuario) {
                    return conductor;
                }
            }

            return null;

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al buscar el conductor.",
                    e
            );
        }
    }

    public void actualizarConductor(Conductor conductorActualizado) {

        try {

            if (conductorActualizado == null) {
                throw new IllegalArgumentException(
                        "El conductor actualizado no puede ser nulo."
                );
            }

            if (conductorActualizado.getIdUsuario() <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            if (conductorActualizado.getNombre() == null
                    || conductorActualizado.getNombre().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El nombre del conductor es obligatorio."
                );
            }

            if (conductorActualizado.getCorreo() == null
                    || conductorActualizado.getCorreo().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El correo del conductor es obligatorio."
                );
            }

            if (conductorActualizado.getLicencia() <= 0) {
                throw new IllegalArgumentException(
                        "La licencia del conductor debe ser válida."
                );
            }

            for (int i = 0; i < conductores.size(); i++) {

                if (conductores.get(i).getIdUsuario()
                        == conductorActualizado.getIdUsuario()) {

                    conductores.set(i, conductorActualizado);
                    return;
                }
            }

            throw new IllegalArgumentException(
                    "No existe un conductor con el ID: "
                    + conductorActualizado.getIdUsuario()
            );

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al actualizar el conductor.",
                    e
            );
        }
    }


    // =========================
    // DELETE
    // =========================
    public void eliminarConductor(int idUsuario) {

        try {

            if (idUsuario <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor a cero."
                );
            }

            Conductor conductor = buscarConductor(idUsuario);

            if (conductor == null) {
                throw new IllegalArgumentException(
                        "No existe un conductor con el ID: "
                        + idUsuario
                );
            }

            conductores.remove(conductor);

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al eliminar el conductor.",
                    e
            );
        }
    }
}