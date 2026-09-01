package com.mycompany.rutamatch.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de la clase Vehiculo.
 */
public class VehiculoTest {

    private Vehiculo vehiculoValido() {
        return new Vehiculo("ABC123", 2020, "Toyota", "Corolla", "Rojo", "Gasolina", "CHASIS001");
    }

    @Test
    void constructorAsignaTodosLosCampos() {
        Vehiculo v = vehiculoValido();
        assertEquals("ABC123", v.getPlaca());
        assertEquals(2020, v.getAnio());
        assertEquals("Toyota", v.getMarca());
        assertEquals("Corolla", v.getModelo());
        assertEquals("Rojo", v.getColor());
        assertEquals("Gasolina", v.getTipoCombustible());
        assertEquals("CHASIS001", v.getNumeroChasis());
    }

    @Test
    void validarVehiculoConDatosCompletosDevuelveTrue() {
        assertTrue(vehiculoValido().validarVehiculo());
    }

    @Test
    void validarVehiculoConAnioInvalidoDevuelveFalse() {
        Vehiculo v = new Vehiculo("ABC123", 0, "Toyota", "Corolla", "Rojo", "Gasolina", "CHASIS001");
        assertFalse(v.validarVehiculo());
    }

    @Test
    void validarVehiculoConPlacaEnBlancoDevuelveFalse() {
        Vehiculo v = vehiculoValido();
        v.setPlaca("   ");
        assertFalse(v.validarVehiculo());
    }
}
