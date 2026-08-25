package com.mycompany.rutamatch.modelo;

public class Conductor extends Usuario {
    
    private int licencia;

    public Conductor(String estado, String contraseña,
                     String telefono, String correo,
                     String nombre, int idUsuario, int licencia) {
        
        super(estado, contraseña, telefono, correo, nombre, idUsuario);
        this.licencia = licencia;
    }

    public Conductor(int licencia) {
        this.licencia = licencia;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }
}
