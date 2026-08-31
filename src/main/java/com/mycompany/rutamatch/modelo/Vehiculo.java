package com.mycompany.rutamatch.modelo;

public class Vehiculo {
    private String placa;
    private int  anio;
    private String marca;
    private String modelo;
    private String color;
    private String tipoCombustible;
    private String numeroChasis;

    public Vehiculo(String placa, int  anio, String marca, String modelo,
                     String color, String tipoCombustible, String numeroChasis) {
        this.placa = placa;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.numeroChasis = numeroChasis;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public String getNumeroChasis() { return numeroChasis; }
    public void setNumeroChasis(String numeroChasis) { this.numeroChasis = numeroChasis; }

    public boolean validarVehiculo() {
        return getPlaca() != null && !getPlaca().isBlank() &&
                getMarca() != null && !getMarca().isBlank() &&
                getModelo() != null && !getModelo().isBlank() &&
                getColor() != null && !getColor().isBlank() &&
                getTipoCombustible() != null && !getTipoCombustible().isBlank() &&
                getNumeroChasis() != null && !getNumeroChasis().isBlank() &&
                getAnio() > 0;
    }


    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", anio=" + anio + ", marca=" + marca +
                ", modelo=" + modelo + ", color=" + color +
                ", combustible=" + tipoCombustible + ", chasis=" + numeroChasis + "]";
    }
}
