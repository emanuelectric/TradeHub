package com.example.tradehub512.datos;

public class Publicacion {
    // Atributos
    private int id;
    private int idUsuario;
    private int idSimbolo;
    private int idTendencia;
    private int idIndicador;
    private String descripcion;
    private String imagenAdjunta;
    private int favorito;

    // Constructor
    public Publicacion(int id, int idUsuario, int idSimbolo, int idTendencia, int idIndicador, String descripcion, String imagenAdjunta, int favorito) {
        this.idUsuario = idUsuario;
        this.idSimbolo = idSimbolo;
        this.idTendencia = idTendencia;
        this.idIndicador = idIndicador;
        this.descripcion = descripcion;
        this.imagenAdjunta = imagenAdjunta;
        this.favorito = favorito;
    }

    // Getter para el ID
    public int getId() {
        return id;
    }

    // Getter para el ID del usuario
    public int getIdUsuario() {
        return idUsuario;
    }

    // Setter para el ID del usuario
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Getter para el ID del símbolo
    public int getIdSimbolo() {
        return idSimbolo;
    }

    // Setter para el ID del símbolo
    public void setIdSimbolo(int idSimbolo) {
        this.idSimbolo = idSimbolo;
    }

    // Getter para el ID de la tendencia
    public int getIdTendencia() {
        return idTendencia;
    }

    // Setter para el ID de la tendencia
    public void setIdTendencia(int idTendencia) {
        this.idTendencia = idTendencia;
    }

    // Getter para el ID del indicador
    public int getIdIndicador() {
        return idIndicador;
    }

    // Setter para el ID del indicador
    public void setIdIndicador(int idIndicador) {
        this.idIndicador = idIndicador;
    }

    // Getter para la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para la descripción
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para la imagen adjunta
    public String getImagenAdjunta() {
        return imagenAdjunta;
    }

    // Setter para la imagen adjunta
    public void setImagenAdjunta(String imagenAdjunta) {
        this.imagenAdjunta = imagenAdjunta;
    }

    // Getter para el favorito
    public int getFavorito() {
        return favorito;
    }

    // Setter para el favorito
    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }
}
