package com.mycompany.rutamatch.modelo;

public class Pasajero extends Persona {
    private String fechaRegistro;

    public Pasajero(String nombre, String apellido, String documento, String tipoDocumento,
                     String telefono, String correo, String id, String fechaRegistro) {
        super(id, nombre, apellido, documento, tipoDocumento, telefono, correo);
        this.fechaRegistro=fechaRegistro;
    }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public boolean validarDatosPasajero() {
        // Verificar que ningún campo esté vacío
        if (getId() == null || getId().isBlank()
                || getNombre() == null || getNombre().isBlank()
                || getApellido() == null || getApellido().isBlank()
                || getDocumento() == null || getDocumento().isBlank()
                || getTipoDocumento() == null || getTipoDocumento().isBlank()
                || getTelefono() == null || getTelefono().isBlank()
                || getCorreo() == null || getCorreo().isBlank()
                || getFechaRegistro() == null || getFechaRegistro().isBlank()) {

            return false;
        }

        return true; // Si pasa el "if", los datos son válidos
    } // 

    
    @Override
    public String toString() {
        return "Pasajero [" + super.toString() + ", fechaRegistro=" + fechaRegistro + "]";
    }
}
