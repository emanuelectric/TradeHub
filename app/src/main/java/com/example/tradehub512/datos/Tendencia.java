package com.example.tradehub512.datos;

public class Tendencia {
    // Atributos
    private int idTendencia;
    private String nombreTendencia;
    private String descripcionTendencia;

    // Constructor
    public Tendencia(String nombreTendencia, String descripcionTendencia) {
        this.nombreTendencia = nombreTendencia;
        this.descripcionTendencia = descripcionTendencia;
    }

    // Getter para el ID de Tendencia
    public int getIdTendencia() {
        return idTendencia;
    }

    // Setter para el ID de Tendencia
    public void setIdTendencia(int idTendencia) {
        this.idTendencia = idTendencia;
    }

    // Getter para el nombre de Tendencia
    public String getNombreTendencia() {
        return nombreTendencia;
    }

    // Setter para el nombre de Tendencia
    public void setNombreTendencia(String nombreTendencia) {
        this.nombreTendencia = nombreTendencia;
    }

    // Getter para la descripción de Tendencia
    public String getDescripcionTendencia() {
        return descripcionTendencia;
    }

    // Setter para la descripción de Tendencia
    public void setDescripcionTendencia(String descripcionTendencia) {
        this.descripcionTendencia = descripcionTendencia;
    }
}
