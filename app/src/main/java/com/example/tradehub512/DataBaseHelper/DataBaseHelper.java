package com.example.tradehub512.DataBaseHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.tradehub512.datos.SimboloModel;
import com.example.tradehub512.datos.Usuario;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String ID_SIMBOLO = "id_simbolo";
    public static final String SIMBOLO_SIMBOLO = "simbolo_simbolo";
    public static final String NOMBRE_SIMBOLO = "nombre_simbolo";
    public static final String DESCRIPCION_SIMBOLO = "descripcion_simbolo";
    public static final String SIMBOLO = "Simbolo";
    public static final String NOMBRE_USUARIO = "nombre_usuario";
    public static final String ID_USUARIO = "id_usuario";
    public static final String CORREO_ELECTRONICO = "correo_electronico";
    public static final String CONTRASENA = "contrasena";
    public static final String ID_PUBLICACION = "id_publicacion";
    public static final String TITULO_PUBLICACION = "titulo_publicacion";
    public static final String DESCRIPCION_PUBLICACION = "descripcion_piublicacion";
    public static final String IMAGEN_PUBLICACION = "imagen_publicacion";
    public static final String PUBLICACION_FAVORITO = "publicacion_favorito";
    public static final String ID_INDICADOR = "id_indicador";
    public static final String ID_TENDENCIA = "id_tendencia";
    public static final String NOMBRE_TENDENCIA = "nombre_tendencia";
    public static final String DESCRIPCION_TENDENCIA = "descripcion_tendencia";
    public static final String NOMBRE_INDICADOR = "nombre_indicador";
    public static final String DESCRIPCION_DESCRIPCION = "descripcion_descripcion";
    public static final String USUARIO = "Usuario";


    public DataBaseHelper(@Nullable Context context) {
        super(context, "TradeHub.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Declaración SQL para crear la tabla Indicador
        String createTableIndicador = "CREATE TABLE Indicador (" +
                ID_INDICADOR + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                NOMBRE_INDICADOR + " VARCHAR NOT NULL," +
                DESCRIPCION_DESCRIPCION + " VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Tendencia
        String createTableTendencia = "CREATE TABLE Tendencia (" +
                ID_TENDENCIA + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                NOMBRE_TENDENCIA + " VARCHAR NOT NULL," +
                DESCRIPCION_TENDENCIA + " VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Simbolo
        String createTableSimbolo = "CREATE TABLE " + SIMBOLO + " (" +
                ID_SIMBOLO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                SIMBOLO_SIMBOLO + " VARCHAR NOT NULL," +
                NOMBRE_SIMBOLO + " VARCHAR NOT NULL," +
                DESCRIPCION_SIMBOLO + " VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Usuario
        String createTableUsuario = "CREATE TABLE " + USUARIO + " (" +
                ID_USUARIO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                NOMBRE_USUARIO + " VARCHAR NOT NULL," +
                CORREO_ELECTRONICO + " VARCHAR NOT NULL," +
                CONTRASENA + " VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Publicacion
        String createTablePublicacion = "CREATE TABLE Publicacion (" +
                ID_PUBLICACION + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                TITULO_PUBLICACION + " VARCHAR NOT NULL," +
                DESCRIPCION_PUBLICACION + " VARCHAR NOT NULL," +
                IMAGEN_PUBLICACION + " BLOB," +
                PUBLICACION_FAVORITO + " BOOLEAN NOT NULL," +
                ID_USUARIO + " INTEGER NOT NULL," +
                ID_INDICADOR + " INTEGER NOT NULL," +
                ID_TENDENCIA + " INTEGER NOT NULL," +
                ID_SIMBOLO + " INTEGER NOT NULL" +
                ");";

        // Ejecutar cada declaración SQL por separado
        db.execSQL(createTableIndicador);
        db.execSQL(createTableTendencia);
        db.execSQL(createTableSimbolo);
        db.execSQL(createTableUsuario);
        db.execSQL(createTablePublicacion);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOneSimbolo(SimboloModel simboloModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(SIMBOLO_SIMBOLO, simboloModel.getNombreSimbolo());
        cv.put(NOMBRE_SIMBOLO, simboloModel.getNombre());
        cv.put(DESCRIPCION_SIMBOLO,simboloModel.getDescripcionSimbolo());

        long insert = db.insert(SIMBOLO, null, cv);
        if (insert == -1){
            return false;
        }
        else {
            return true;
        }
    }

    //Añadir usuarios a la base de datos
    public boolean addOneUsuario(Usuario usuario){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(NOMBRE_USUARIO, usuario.getNombreUsuario());
        cv.put(CORREO_ELECTRONICO, usuario.getCorreoElectronico());
        cv.put(CONTRASENA,usuario.getContrasena());


        long insert = db.insert(USUARIO, null, cv);
        if (insert == -1){
            return false;
        }
        else {
            return true;
        }
    }
}