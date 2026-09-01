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

        public String validarDatosConductor() {

        if (getId() == null || getId().isBlank()) {
            return "El ID es obligatorio.";
        }

        if (getNombre() == null || getNombre().isBlank()) {
            return "El nombre es obligatorio.";
        }

        if (getApellido() == null || getApellido().isBlank()) {
            return "El apellido es obligatorio.";
        }

        if (getDocumento() == null || getDocumento().isBlank()) {
            return "El documento es obligatorio.";
        }

        if (getTipoDocumento() == null || getTipoDocumento().isBlank()) {
            return "Debe seleccionar un tipo de documento.";
        }

        if (getTelefono() == null || getTelefono().isBlank()) {
            return "El teléfono es obligatorio.";
        }

        if (getCorreo() == null || getCorreo().isBlank()) {
            return "El correo es obligatorio.";
        }

        if (getLicencia() == null || getLicencia().isBlank()) {
            return "La licencia es obligatoria.";
        }

        if (getCategoriaLicencia() == null || getCategoriaLicencia().isBlank()) {
            return "Debe seleccionar una categoría de licencia.";
        }

        if (getFechaVenciLicencia() == null || getFechaVenciLicencia().isBlank()) {
            return "La fecha de vencimiento de la licencia es obligatoria.";
        }

        // =========================
        // DATOS PERSONALES
        // =========================

        if (!getNombre().matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")) {
            return "El nombre solo debe contener letras.";
        }

        if (!getApellido().matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")) {
            return "El apellido solo debe contener letras.";
        }

        if (!getDocumento().matches("[0-9]+")) {
            return "El documento solo debe contener números.";
        }

        if (!getTelefono().matches("[0-9]+")) {
            return "El teléfono solo debe contener números.";
        }

        if (!getCorreo().matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            return "Ingrese un correo electrónico válido.";
        }

        // =========================
        // LICENCIA
        // =========================

        if (!getLicencia().matches("[A-Za-z0-9]+")) {
            return "La licencia solo debe contener letras y números.";
        }

        return null;
    }

    public boolean validarConductor() {
        return validarDatosConductor() == null;
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