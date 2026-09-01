package com.mycompany.rutamatch.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yarit
 */
public class Conductor extends Persona {

    private String licencia;
    private String categoriaLicencia;
    private String fechaVenciLicencia;
    private Boolean estado;
    private List<Vehiculo> vehiculos;

    public Conductor(String id, String nombre, String apellido, String documento,
            String tipoDocumento, String telefono, String correo,
            String licencia, String categoriaLicencia, String fechaVenciLicencia) {
        super(id, nombre, apellido, documento, tipoDocumento, telefono, correo);
        this.licencia = licencia;
        this.categoriaLicencia = categoriaLicencia;
        this.fechaVenciLicencia = fechaVenciLicencia;
        this.estado = true;
        this.vehiculos = new ArrayList<>();
    }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public String getCategoriaLicencia() { return categoriaLicencia; }
    public void setCategoriaLicencia(String categoriaLicencia) { this.categoriaLicencia = categoriaLicencia; }

    public String getFechaVenciLicencia() { return fechaVenciLicencia; }
    public void setFechaVenciLicencia(String fechaVenciLicencia) { this.fechaVenciLicencia = fechaVenciLicencia; }

    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    // Setter "de reemplazo" completo de la lista (opcional, útil si cargas desde BD)
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = (vehiculos != null) ? vehiculos : new ArrayList<>();
    }

    // Métodos para manejar la relación 0..N de forma más natural que un setter plano
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null && !this.vehiculos.contains(vehiculo)) {
            this.vehiculos.add(vehiculo);
        }
    }

    public boolean quitarVehiculo(Vehiculo vehiculo) {
        return this.vehiculos.remove(vehiculo);
    }

    public boolean tieneVehiculos() {
        return !this.vehiculos.isEmpty();
    }

    public boolean validarConductor() {
        return this.getNombre() != null &&
                this.getApellido() != null &&
                this.getTipoDocumento() != null &&
                this.getDocumento() != null &&
                this.getTelefono() != null &&
                this.getCorreo() != null &&
                this.getLicencia() != null &&
                this.getCategoriaLicencia() != null &&
                this.getFechaVenciLicencia() != null;
    }

    @Override
    public String toString() {
        String infoVehiculos = this.vehiculos.isEmpty()
                ? "sin vehiculos asignados"
                : this.vehiculos.size() + " vehiculo(s) asignado(s)";
        return "Conductor [" + super.toString() +
                ", licencia=" + licencia +
                ", categoria=" + categoriaLicencia +
                ", venceLicencia=" + fechaVenciLicencia +
                ", vehiculos=" + infoVehiculos + "]";
    }
}