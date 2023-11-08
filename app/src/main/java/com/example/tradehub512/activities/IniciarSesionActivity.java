package com.example.tradehub512.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tradehub512.R;
// Importar clase Usuario
import com.example.tradehub512.datos.Usuario;

import java.util.List;

public class IniciarSesionActivity extends AppCompatActivity {

    private EditText campoNombreUsuario;
    private EditText campoContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciar_sesion_layout);

        campoNombreUsuario = findViewById(R.id.iniciarSesion_nombreUsuario);
        campoContrasena = findViewById(R.id.iniciarSesion_contrasena);
    }

    public void iniciarSesion(View view) {
        String nombreUsuario = campoNombreUsuario.getText().toString();
        String contrasena = campoContrasena.getText().toString();

        // Obtener la lista de usuarios
        List<Usuario> listaUsuarios = Usuario.getListaUsuarios();

        // Verificar si el usuario y la contraseña coinciden con algún registro
        boolean usuarioEncontrado = false;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                usuarioEncontrado = true;
                break;
            }
        }

        if (usuarioEncontrado) {
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
            // Agregar aquí el código para redirigir a la siguiente pantalla

            // Redirigir al menu principal
            Intent intentMenuPrincipal = new Intent(this, MenuPrincipalActivity.class);

            startActivity(intentMenuPrincipal);

        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
