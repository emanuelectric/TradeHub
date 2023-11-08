package com.example.tradehub512.datos;

import java.io.Serializable;
import java.util.ArrayList;

public class Simbolo implements Serializable {
    // Atributos
    private int idSimbolo;
    private String simboloSimbolo;
    private String nombreSimbolo;
    private String descripcionSimbolo;

    // ArrayList para almacenar los símbolos
    private static ArrayList<Simbolo> listaSimbolos = new ArrayList<>();

    // Constructor
    public Simbolo(String simboloSimbolo, String nombreSimbolo, String descripcionSimbolo) {
        this.simboloSimbolo = simboloSimbolo;
        this.nombreSimbolo = nombreSimbolo;
        this.descripcionSimbolo = descripcionSimbolo;
    }

    // Getters & Setters

    // Getter para el ID del Símbolo
    public int getIdSimbolo() {
        return idSimbolo;
    }

    // Setter para el ID del Símbolo
    public void setIdSimbolo(int idSimbolo) {
        this.idSimbolo = idSimbolo;
    }

    // Getter para el símbolo del Símbolo
    public String getSimboloSimbolo() {
        return simboloSimbolo;
    }

    // Setter para el símbolo del Símbolo
    public void setSimboloSimbolo(String simboloSimbolo) {
        this.simboloSimbolo = simboloSimbolo;
    }

    // Getter para el nombre del Símbolo
    public String getNombreSimbolo() {
        return nombreSimbolo;
    }

    // Setter para el nombre del Símbolo
    public void setNombreSimbolo(String nombreSimbolo) {
        this.nombreSimbolo = nombreSimbolo;
    }

    // Getter para la descripción del Símbolo
    public String getDescripcionSimbolo() {
        return descripcionSimbolo;
    }

    // Setter para la descripción del Símbolo
    public void setDescripcionSimbolo(String descripcionSimbolo) {
        this.descripcionSimbolo = descripcionSimbolo;
    }

    // Metodos para la Lista de Simbolos

    // Método estático para agregar símbolos a la lista
    public static void agregarSimbolo(Simbolo simbolo) {
        listaSimbolos.add(simbolo);
    }

    // Getter para obtener la lista de símbolos
    public static ArrayList<Simbolo> getListaSimbolos() {
        return listaSimbolos;
    }

}
