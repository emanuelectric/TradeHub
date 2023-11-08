package com.example.tradehub512.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tradehub512.R;
import com.example.tradehub512.datos.Publicacion;

public class PublicacionesPublicarActivity extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;

    private EditText editTextTitulo;
    private Spinner spinnerSimbolo;
    private Spinner spinnerTendencia;
    private Spinner spinnerIndicador;
    private EditText editTextDescripcion;
    private ImageView imageViewSeleccionada;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.publicaciones_publicar_activity);

        editTextTitulo = findViewById(R.id.edittext_titulo);
        spinnerSimbolo = findViewById(R.id.spinner_simbolo);
        spinnerTendencia = findViewById(R.id.spinner_tendencia);
        spinnerIndicador = findViewById(R.id.spinner_indicador);
        editTextDescripcion = findViewById(R.id.edittext_descripcion);
        imageViewSeleccionada = findViewById(R.id.imageview_seleccionadaPublicar);
    }

    // Método para abrir la galería
    public void abrirGaleria(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    // Método para manejar el resultado de la selección de la imagen
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            imageViewSeleccionada.setImageURI(selectedImage);
        }
    }

    // Método para publicar la publicación
    public void publicar(View view) {
        String titulo = editTextTitulo.getText().toString();
        int idSimbolo = spinnerSimbolo.getSelectedItemPosition(); // Obtener el ID del símbolo seleccionado
        int idTendencia = spinnerTendencia.getSelectedItemPosition(); // Obtener el ID de la tendencia seleccionada
        int idIndicador = spinnerIndicador.getSelectedItemPosition(); // Obtener el ID del indicador seleccionado
        String descripcion = editTextDescripcion.getText().toString();
        String imagenAdjunta = ""; // Debes obtener la ruta de la imagen seleccionada aquí

        // Crear una nueva publicación
        Publicacion nuevaPublicacion = new Publicacion(
                0, // El ID se asignará automáticamente en la base de datos
                0, // Cambia esto al ID del usuario actual si es necesario
                idSimbolo,
                idTendencia,
                idIndicador,
                descripcion,
                imagenAdjunta,
                0 // Puedes establecer el favorito como 0 inicialmente o según tus necesidades
        );

        // Guardar la publicación en la base de datos (o donde corresponda)
        // Aquí deberías tener un método para guardar la publicación en tu base de datos

        // Luego, puedes redirigir a la pantalla de detalle de la publicación, por ejemplo:
        Intent intent = new Intent(this, ItemPublicacionDetalleActivity.class);
        intent.putExtra("idPublicacion", nuevaPublicacion.getId());
        startActivity(intent);
    }
}
