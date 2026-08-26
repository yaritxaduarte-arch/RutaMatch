/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rutamatch.modelo;

/**
 *
 * @author yarit
 */
public class Pasajero extends Usuario {
    
    public Pasajero(String estado, String nombre, String correo, 
                    String telefono, String contraseña, int idUsuario) 
    {
        super(estado, contraseña, telefono, correo, nombre, idUsuario);
    }
}


