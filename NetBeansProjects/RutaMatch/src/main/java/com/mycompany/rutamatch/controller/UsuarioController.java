package com.mycompany.rutamatch.controller;

import com.mycompany.rutamatch.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private final List<Usuario> usuarios;

    public UsuarioController() {
        usuarios = new ArrayList<>();
    }

    public void crearUsuario(Usuario usuario) {

        try {

            if (usuario == null) {
                throw new IllegalArgumentException(
                        "No se puede registrar un usuario nulo."
                );
            }

            if (usuario.getIdUsuario() <= 0) {
                throw new IllegalArgumentException(
                        "El ID del usuario debe ser mayor o diferente a  cero."
                );
            }

            if (buscarUsuario(usuario.getIdUsuario()) != null) {
                throw new IllegalArgumentException(
                        "Ya existe un usuario con el ID: " + usuario.getIdUsuario()
                );
            }

            if (usuario.getNombre() == null
                 || usuario.getNombre().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El nombre del usuario es obligatorio."
                );
            }

            if (usuario.getCorreo() == null
                 || usuario.getCorreo().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El correo del usuario es obligatorio."
                );
            }

            usuarios.add(usuario);

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al crear el usuario.",
                    e
            );
        }
    }


    public List<Usuario> listarUsuarios() {

        try {

            return new ArrayList<>(usuarios);

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al obtener los usuarios.",
                    e
            );
        }
    }

    
    public Usuario buscarUsuario(int idUsuario) {

        try {

            if (idUsuario <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor  o diferente a cero."
                );
            }

            for (Usuario usuario : usuarios) {

                if (usuario.getIdUsuario() == idUsuario) {
                    return usuario;
                }
            }

            return null;

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al buscar el usuario.",
                    e
            );
        }
    }


    public void actualizarUsuario(Usuario usuarioActualizado) {

        try {

            if (usuarioActualizado == null) {
                throw new IllegalArgumentException(
                        "El usuario actualizado no puede ser nulo."
                );
            }

            if (usuarioActualizado.getIdUsuario() <= 0) {
                throw new IllegalArgumentException(
                        "El ID del usuario debe ser mayor  o diferente a cero."
                );
            }

            if (usuarioActualizado.getNombre() == null
                    || usuarioActualizado.getNombre().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El nombre del usuario es obligatorio."
                );
            }

            if (usuarioActualizado.getCorreo() == null
                    || usuarioActualizado.getCorreo().trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "El correo del usuario es obligatorio."
                );
            }

            for (int i = 0; i < usuarios.size(); i++) {

                if (usuarios.get(i).getIdUsuario()
                        == usuarioActualizado.getIdUsuario()) {

                    usuarios.set(i, usuarioActualizado);
                    return;
                }
            }

            throw new IllegalArgumentException(
                    "No existe un usuario con el ID:  " + usuarioActualizado.getIdUsuario()
            );

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al actualizar el usuario.",
                    e
            );
        }
    }

 
    public void eliminarUsuario(int idUsuario) {

        try {

            if (idUsuario <= 0) {
                throw new IllegalArgumentException(
                        "El ID debe ser mayor  o diferente a cero."
                );
            }

            Usuario usuario = buscarUsuario(idUsuario);

            if (usuario == null) {
                throw new IllegalArgumentException(
                        "No existe un usuario con el ID:  " + idUsuario
                );
            }

            usuarios.remove(usuario);

        } catch (IllegalArgumentException e) {

            throw e;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Ocurrió un error al eliminar el usuario.",
                    e
            );
        }
    }
}