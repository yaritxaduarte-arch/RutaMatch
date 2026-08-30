/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rutamatch.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.mycompany.rutamatch.modelo.Conductor;
import com.mycompany.rutamatch.modelo.IActualizable;

/**
 *
 * @author yarit
 */
public class ControllerConductor {
    
    private static final List<Conductor> conductores = new ArrayList<>();
    private static final List<IActualizable> guiActualiza = new ArrayList<>();

    public static void registrarGUI(IActualizable gui) {
        if (gui != null && !guiActualiza.contains(gui)) {
            guiActualiza.add(gui);
        }
    }
    
    public static void crearConductor(Conductor conductor) throws RuntimeException {
        if (conductor == null || !conductor.validarConductor()) {
            throw new RuntimeException("ERROR: ingrese los datos correctamente!");
        }
        if (buscarConductor(conductor.getId()) != null) {
            throw new RuntimeException("ERROR: ya existe un conductor con el ID " + conductor.getId());
        }
        conductores.add(conductor);
        actualizar();
    }
    
    public static List<Conductor> listarConductores() {
        return Collections.unmodifiableList(conductores);
    }
    
    public static void eliminarConductor(String id) {
        boolean eliminado = conductores.removeIf(c -> Objects.equals(c.getId(), id));
        if (eliminado) {
            actualizar();
        } else {
            throw new RuntimeException("No se encontró ningún usuario con ese ID.");
        }
    }
    
    public static Conductor buscarConductor(String id) {
        for (Conductor conductor : conductores) {
            if (Objects.equals(conductor.getId(), id)) {
                return conductor;
            }
        }
        return null;
    }
    
    public static void modificarConductor(Conductor conductorActualizado) {
        if (conductorActualizado == null || !conductorActualizado.validarConductor()) {
            throw new RuntimeException("ERROR: ingrese los datos correctamente!");
        }
        for (int i = 0; i < conductores.size(); i++) {
            if (Objects.equals(conductores.get(i).getId(), conductorActualizado.getId())) {
                conductores.set(i, conductorActualizado);
                actualizar();
                return;
            }
        }
        throw new RuntimeException("No se encontró ningún conductor con ese ID.");
    }
    
    public static void actualizar() {
        for (IActualizable act : guiActualiza) {
            act.actualizar();
        }
    }
}
