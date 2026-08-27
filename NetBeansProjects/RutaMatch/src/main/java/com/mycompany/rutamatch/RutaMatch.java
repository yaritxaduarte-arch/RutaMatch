package com.mycompany.rutamatch;

import com.mycompany.rutamatch.controller.UsuarioController;
import com.mycompany.rutamatch.modelo.Pasajero;
import com.mycompany.rutamatch.view.GUIPrincipal;

public class RutaMatch {

    public static void main(String[] args) {

        
        UsuarioController controller = new UsuarioController();

       
        Pasajero pasajero = new Pasajero(
                "Activo",
                "1234",
                "3001234567",
                "laura@gmail.com",
                "Laura",
                1
        );


        controller.crearUsuario(pasajero);

        System.out.println("Usuario creado correctamente.");

        Pasajero encontrado = (Pasajero) controller.buscarUsuario(1);

        if (encontrado != null) {
            System.out.println(
                    "Usuario encontrado: " + encontrado.getNombre()
            );
        }


        GUIPrincipal gui = new GUIPrincipal();
        gui.setVisible(true);
    }
}


