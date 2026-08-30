package com.mycompany.rutamatch.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de la clase Conductor.
 */
public class ConductorTest {

    private Conductor conductorValido() {
        return new Conductor("1001", "Carlos", "Perez", "123456789", "CC",
                "3001234567", "carlos@gmail.com", "LIC001", "C1", "2030-12-31");
    }

    @Test
    void constructorAsignaTodosLosCampos() {
        Conductor c = conductorValido();
        assertEquals("1001", c.getId());
        assertEquals("Carlos", c.getNombre());
        assertEquals("Perez", c.getApellido());
        assertEquals("123456789", c.getDocumento());
        assertEquals("CC", c.getTipoDocumento());
        assertEquals("3001234567", c.getTelefono());
        assertEquals("carlos@gmail.com", c.getCorreo());
        assertEquals("LIC001", c.getLicencia());
        assertEquals("C1", c.getCategoriaLicencia());
        assertEquals("2030-12-31", c.getFechaVenciLicencia());
        assertEquals(Boolean.TRUE, c.getEstado());
    }

    @Test
    void validarConductorConDatosCompletosDevuelveTrue() {
        assertTrue(conductorValido().validarConductor());
    }

    @Test
    void validarConductorSinLicenciaDevuelveFalse() {
        Conductor c = conductorValido();
        c.setLicencia(null);
        assertFalse(c.validarConductor());
    }

    @Test
    void validarConductorSinNombreDevuelveFalse() {
        Conductor c = conductorValido();
        c.setNombre(null);
        assertFalse(c.validarConductor());
    }

    @Test
    void toStringMuestraSinVehiculoAsignado() {
        assertTrue(conductorValido().toString().contains("sin vehiculo asignado"));
    }
}
