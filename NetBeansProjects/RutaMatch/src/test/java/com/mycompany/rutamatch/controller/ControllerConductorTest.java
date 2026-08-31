package com.mycompany.rutamatch.controller;

import com.mycompany.rutamatch.modelo.Conductor;
import com.mycompany.rutamatch.modelo.IActualizable;
import java.lang.reflect.Field;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias del ControllerConductor.
 */
public class ControllerConductorTest {

    @BeforeEach
    void limpiarEstado() throws Exception {
        vaciarLista("conductores");
        vaciarLista("guiActualiza");
    }

    // Limpia las listas estaticas del controlador para que cada prueba sea independiente.
    private void vaciarLista(String nombreCampo) throws Exception {
        Field campo = ControllerConductor.class.getDeclaredField(nombreCampo);
        campo.setAccessible(true);
        ((List<?>) campo.get(null)).clear();
    }

    private Conductor conductorValido() {
        return new Conductor("1001", "Carlos", "Perez", "123456789", "CC",
                "3001234567", "carlos@gmail.com", "LIC001", "C1", "2030-12-31");
    }

    @Test
    void crearConductorAgregaALaLista() {
        ControllerConductor.crearConductor(conductorValido());
        assertEquals(1, ControllerConductor.listarConductores().size());
    }

    @Test
    void crearConductorNuloLanzaExcepcion() {
        assertThrows(RuntimeException.class, () -> ControllerConductor.crearConductor(null));
    }

    @Test
    void crearConductorInvalidoLanzaExcepcion() {
        Conductor invalido = conductorValido();
        invalido.setLicencia(null);
        assertThrows(RuntimeException.class, () -> ControllerConductor.crearConductor(invalido));
    }

    @Test
    void crearConductorDuplicadoLanzaExcepcion() {
        ControllerConductor.crearConductor(conductorValido());
        assertThrows(RuntimeException.class, () -> ControllerConductor.crearConductor(conductorValido()));
        assertEquals(1, ControllerConductor.listarConductores().size());
    }

    @Test
    void buscarConductorEncuentraPorId() {
        ControllerConductor.crearConductor(conductorValido());
        Conductor encontrado = ControllerConductor.buscarConductor("1001");
        assertNotNull(encontrado);
        assertEquals("Carlos", encontrado.getNombre());
    }

    @Test
    void buscarConductorInexistenteDevuelveNull() {
        assertNull(ControllerConductor.buscarConductor("9999"));
    }

    @Test
    void listarConductoresDevuelveListaInmutable() {
        ControllerConductor.crearConductor(conductorValido());
        List<Conductor> lista = ControllerConductor.listarConductores();
        assertThrows(UnsupportedOperationException.class, () -> lista.add(conductorValido()));
    }

    @Test
    void modificarConductorActualizaLosDatos() {
        ControllerConductor.crearConductor(conductorValido());
        Conductor actualizado = conductorValido();
        actualizado.setNombre("Carlos Eduardo");
        ControllerConductor.modificarConductor(actualizado);
        assertEquals("Carlos Eduardo", ControllerConductor.buscarConductor("1001").getNombre());
    }

    @Test
    void modificarConductorInexistenteLanzaExcepcion() {
        assertThrows(RuntimeException.class, () -> ControllerConductor.modificarConductor(conductorValido()));
    }

    @Test
    void eliminarConductorReduceLaLista() {
        ControllerConductor.crearConductor(conductorValido());
        ControllerConductor.eliminarConductor("1001");
        assertEquals(0, ControllerConductor.listarConductores().size());
    }

    @Test
    void eliminarConductorInexistenteLanzaExcepcion() {
        assertThrows(RuntimeException.class, () -> ControllerConductor.eliminarConductor("9999"));
    }

    @Test
    void crearConductorNotificaALosObservadores() {
        Contador contador = new Contador();
        ControllerConductor.registrarGUI(contador);
        ControllerConductor.crearConductor(conductorValido());
        assertEquals(1, contador.veces);
    }

    private static class Contador implements IActualizable {
        int veces = 0;

        @Override
        public void actualizar() {
            veces++;
        }
    }
}
