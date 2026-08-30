package com.mycompany.rutamatch.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de la clase Pasajero.
 */
public class PasajeroTest {

    private Pasajero pasajeroValido() {
        return new Pasajero("Maria", "Lopez", "987654321", "CC",
                "3011112222", "maria@gmail.com", "2001", "2026-01-01");
    }

    @Test
    void constructorAsignaLosCamposEnElOrdenCorrecto() {
        Pasajero p = pasajeroValido();
        // Verifica que super(...) asigne en el orden correcto (bug previo)
        assertEquals("2001", p.getId());
        assertEquals("Maria", p.getNombre());
        assertEquals("Lopez", p.getApellido());
        assertEquals("987654321", p.getDocumento());
        assertEquals("CC", p.getTipoDocumento());
        assertEquals("3011112222", p.getTelefono());
        assertEquals("maria@gmail.com", p.getCorreo());
        assertEquals("2026-01-01", p.getFechaRegistro());
    }

    @Test
    void validarPasajeroConDatosCompletosDevuelveTrue() {
        assertTrue(pasajeroValido().validarPasajero());
    }

    @Test
    void validarPasajeroSinFechaRegistroDevuelveFalse() {
        Pasajero p = pasajeroValido();
        p.setFechaRegistro(null);
        assertFalse(p.validarPasajero());
    }

    @Test
    void toStringIncluyeFechaRegistro() {
        assertTrue(pasajeroValido().toString().contains("fechaRegistro=2026-01-01"));
    }
}
