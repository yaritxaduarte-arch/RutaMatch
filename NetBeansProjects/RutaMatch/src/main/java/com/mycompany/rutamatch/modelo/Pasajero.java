package com.mycompany.rutamatch.modelo;

public class Pasajero extends Usuario {

    public Pasajero(String estado, String contraseña,
                    String telefono, String correo,
                    String nombre, int idUsuario) {

        super(estado, contraseña, telefono, correo, nombre, idUsuario);
    }
}