package com.example.tradehub512.DataBaseHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.tradehub512.datos.SimboloModel;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String ID_SIMBOLO = "id_simbolo";
    public static final String SIMBOLO_SIMBOLO = "simbolo_simbolo";
    public static final String NOMBRE_SIMBOLO = "nombre_simbolo";
    public static final String DESCRIPCION_SIMBOLO = "descripcion_simbolo";
    public static final String SIMBOLO = "Simbolo";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "tradehub.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Declaración SQL para crear la tabla Indicador
        String createTableIndicador = "CREATE TABLE Indicador (" +
                "id_indicador INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_indicador VARCHAR NOT NULL," +
                "descripcion_descripcion VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Tendencia
        String createTableTendencia = "CREATE TABLE Tendencia (" +
                "id_tendencia INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_tendencia VARCHAR NOT NULL," +
                "descripcion_tendencia VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Simbolo
        String createTableSimbolo = "CREATE TABLE " + SIMBOLO + " (" +
                ID_SIMBOLO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                SIMBOLO_SIMBOLO + " VARCHAR NOT NULL," +
                NOMBRE_SIMBOLO + " VARCHAR NOT NULL," +
                DESCRIPCION_SIMBOLO + " VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Usuario
        String createTableUsuario = "CREATE TABLE Usuario (" +
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_usuario VARCHAR NOT NULL," +
                "correo_electronico VARCHAR NOT NULL," +
                "contrasena VARCHAR NOT NULL" +
                ");";

        // Declaración SQL para crear la tabla Publicacion
        String createTablePublicacion = "CREATE TABLE Publicacion (" +
                "id_publicacion INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo_publicacion VARCHAR NOT NULL," +
                "descripcion_piublicacion VARCHAR NOT NULL," +
                "imagen_publicacion BLOB," +
                "publicacion_favorito BOOLEAN NOT NULL," +
                "id_usuario INTEGER NOT NULL," +
                "id_indicador INTEGER NOT NULL," +
                "id_tendencia INTEGER NOT NULL," +
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

    public boolean addOne(SimboloModel simboloModel){
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
}