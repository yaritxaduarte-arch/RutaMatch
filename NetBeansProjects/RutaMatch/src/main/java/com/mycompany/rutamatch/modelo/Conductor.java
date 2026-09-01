/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rutamatch.modelo;

/**
 *
 * @author yarit
 */
public class Conductor extends Persona {
    
    private String licencia;
    private String categoriaLicencia;
    private String fechaVenciLicencia;
    private Boolean estado;
    // private Vehiculo vehiculo; 

    public Conductor(String id, String nombre, String apellido, String documento,
            String tipoDocumento, String telefono, String correo,
            String licencia, String categoriaLicencia, String fechaVenciLicencia) {
        super(id, nombre, apellido, documento, tipoDocumento, telefono, correo);
        this.licencia = licencia;
        this.categoriaLicencia = categoriaLicencia;
        this.fechaVenciLicencia = fechaVenciLicencia;
        this.estado = true;
    }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public String getCategoriaLicencia() { return categoriaLicencia; }
    public void setCategoriaLicencia(String categoriaLicencia) { this.categoriaLicencia = categoriaLicencia; }

    public String getFechaVenciLicencia() { return fechaVenciLicencia; }
    public void setFechaVenciLicencia(String fechaVenciLicencia) { this.fechaVenciLicencia = fechaVenciLicencia; }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
    //public Vehiculo getVehiculo() { return vehiculo; }
    //public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    
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
        //String infoVehiculo = (vehiculo == null) ? "sin vehiculo asignado" : vehiculo.getPlaca();
        String infoVehiculo = "sin vehiculo asignado";
        return "Conductor [" + super.toString() +
                ", licencia=" + licencia +
                ", categoria=" + categoriaLicencia +
                ", venceLicencia=" + fechaVenciLicencia +
                ", vehiculo=" + infoVehiculo + "]";
    }
}
