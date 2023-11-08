package com.example.tradehub512.datos;

import java.util.ArrayList;
public class Usuario {
    // Atributos
    private int idUsuario;
    private String nombreUsuario;
    private String correoElectronico;
    private String contrasena;

    // Constructor
    public Usuario(String nombreUsuario, String correoElectronico, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    // Getter para el ID de Usuario
    public int getIdUsuario() {
        return idUsuario;
    }

    // Setter para el ID de Usuario
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Getter para el nombre de Usuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Setter para el nombre de Usuario
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Getter para el correo electrónico
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    // Setter para el correo electrónico
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Getter para la contraseña
    public String getContrasena() {
        return contrasena;
    }

    // Setter para la contraseña
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Agregar Usuario
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    // Publicaciones Favs
    private ArrayList<Publicacion> publicacionesFavoritas = new ArrayList<>();

    public ArrayList<Publicacion> getPublicacionesFavoritas() {
        return publicacionesFavoritas;
    }

    public void agregarPublicacionFavorita(Publicacion publicacion) {
        publicacionesFavoritas.add(publicacion);
    }

    public void quitarPublicacionFavorita(Publicacion publicacion) {
        publicacionesFavoritas.remove(publicacion);
    }

    // Verificar si el usuario ya está registrado

    public static boolean esNombreUsuarioRegistrado(String nombreUsuario) {
        for (Usuario usuario : Usuario.getListaUsuarios()) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }

    public static boolean esCorreoRegistrado(String correoElectronico) {
        for (Usuario usuario : Usuario.getListaUsuarios()) {
            if (usuario.getCorreoElectronico().equals(correoElectronico)) {
                return true;
            }
        }
        return false;
    }

    // Agregar usuarios de prueba
    static {
        Usuario usuario1 = new Usuario("duki", "usuario1@example.com", "123");
        listaUsuarios.add(usuario1);
    }
}
