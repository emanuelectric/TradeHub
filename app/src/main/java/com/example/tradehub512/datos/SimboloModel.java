package com.example.tradehub512.datos;

public class SimboloModel {
    public SimboloModel(int id_simbolo, String nombreSimbolo, String nombre, String descripcionSimbolo) {
        this.id_simbolo = id_simbolo;
        this.nombreSimbolo = nombreSimbolo;
        this.nombre = nombre;
        this.descripcionSimbolo = descripcionSimbolo;
    }

    public SimboloModel(){


    }

    private int id_simbolo;

    public int getId_simbolo() {
        return id_simbolo;
    }

    public void setId_simbolo(int id_simbolo) {
        this.id_simbolo = id_simbolo;
    }

    public String getNombreSimbolo() {
        return nombreSimbolo;
    }

    public void setNombreSimbolo(String nombreSimbolo) {
        this.nombreSimbolo = nombreSimbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionSimbolo() {
        return descripcionSimbolo;
    }

    public void setDescripcionSimbolo(String descripcionSimbolo) {
        this.descripcionSimbolo = descripcionSimbolo;
    }

    private String nombreSimbolo;
    private String nombre;
    private String descripcionSimbolo;

    @Override
    public String toString() {
        return "SimboloModel{" +
                "id_simbolo=" + id_simbolo +
                ", nombreSimbolo='" + nombreSimbolo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcionSimbolo='" + descripcionSimbolo + '\'' +
                '}';
    }
}