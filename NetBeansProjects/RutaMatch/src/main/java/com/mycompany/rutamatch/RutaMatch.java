package com.mycompany.rutamatch;

import com.mycompany.rutamatch.controller.UsuarioController;
import com.mycompany.rutamatch.modelo.Pasajero;
import com.mycompany.rutamatch.modelo.Usuario;
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

Pasajero pasajeroActualizado = new Pasajero(
        "Activo",
        "5678",
        "3119876543",
        "laura.nueva@gmail.com",
        "Laura Actualizada",
        1
);

controller.actualizarUsuario(pasajeroActualizado);

System.out.println("Usuario actualizado correctamente.");

Pasajero actualizado = (Pasajero) controller.buscarUsuario(1);

System.out.println(
        "Nombre despues de actualizar: "
        + actualizado.getNombre()
);

System.out.println(
        "Correo despues de actualizar: "
        + actualizado.getCorreo()
);

controller.eliminarUsuario(1);

System.out.println("Usuario eliminado correctamente.");

Usuario eliminado = controller.buscarUsuario(1);

if (eliminado == null) {
    System.out.println("El usuario ya no existe.");
}



        GUIPrincipal gui = new GUIPrincipal();
        gui.setVisible(true);
    }
}


