package Model;

public  abstract class Usuario {

    private int idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private String contraseña;
    private String estado;

    public Usuario(String estado, String contraseña,
                   String telefono, String correo,
                   String nombre, int idUsuario) {
        this.estado = estado;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }

    protected Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
