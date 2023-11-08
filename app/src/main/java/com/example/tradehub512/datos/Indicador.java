package com.example.tradehub512.datos;

import java.util.ArrayList;

public class Indicador {
    private int idIndicador;
    private String nombreIndicador;
    private String descripcionIndicador;

    // Lista estática de Indicadores
    private static ArrayList<Indicador> listaIndicadores = new ArrayList<>();

    public Indicador(String nombreIndicador, String descripcionIndicador) {
        this.nombreIndicador = nombreIndicador;
        this.descripcionIndicador = descripcionIndicador;
    }

    public int getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(int idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getNombreIndicador() {
        return nombreIndicador;
    }

    public void setNombreIndicador(String nombreIndicador) {
        this.nombreIndicador = nombreIndicador;
    }

    public String getDescripcionIndicador() {
        return descripcionIndicador;
    }

    public void setDescripcionIndicador(String descripcionIndicador) {
        this.descripcionIndicador = descripcionIndicador;
    }

    // Método para agregar un Indicador a la lista
    public static void agregarIndicador(Indicador indicador) {
        listaIndicadores.add(indicador);
    }

    // Método para obtener la lista de Indicadores
    public static ArrayList<Indicador> getListaIndicadores() {
        return listaIndicadores;
    }
}
