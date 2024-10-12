package com.miempresa.datospersonales;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private TextView editTxtNombre, editTxtApellidos, editTxtEmail, editTxtTelefono;
    private ImageButton btnUp, btnDown;
    private SwitchCompat swtLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos de la interfaz
        editTxtNombre = findViewById(R.id.editTxtNombre);
        editTxtApellidos = findViewById(R.id.editTxtApellidos);
        editTxtEmail = findViewById(R.id.editTxtEmail);
        editTxtTelefono = findViewById(R.id.editTxtTelefono);
        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        swtLog = findViewById(R.id.swtLog);

        // Configuración de los listeners de los botones para que mover el foco entre los textview
        btnUp.setOnClickListener(v -> moverArriba());
        btnDown.setOnClickListener(v -> moverAbajo());


    }

    private void moverArriba(){
        if (editTxtNombre.hasFocus()) {
            if(swtLog.isChecked()) Log.d("MainActivity", "Nombre: ");
            editTxtTelefono.requestFocus();
        } else if (editTxtTelefono.hasFocus()) {
            if(swtLog.isChecked()) Log.d("MainActivity", "Teléfono: ");
            editTxtEmail.requestFocus();
        } else if (editTxtEmail.hasFocus()) {
            if(swtLog.isChecked()) Log.d("MainActivity", "eMail: ");
            editTxtApellidos.requestFocus();
        } else {
            if(swtLog.isChecked()) Log.d("MainActivity", "Apellidos: ");
            editTxtNombre.requestFocus();
        }
    }

    private void moverAbajo(){
        if (editTxtNombre.hasFocus()) {
            if(swtLog.isChecked()) Log.d("MainActivity", "Apellidos: ");
            editTxtApellidos.requestFocus();
        } else if (editTxtApellidos.hasFocus()) {
            if(swtLog.isChecked()) Log.d("MainActivity", "eMail: ");
            editTxtEmail.requestFocus();
        } else if (editTxtEmail.hasFocus()) {
            if(swtLog.isChecked()) Log.d("MainActivity", "Teléfono: ");
            editTxtTelefono.requestFocus();
        } else {
            if(swtLog.isChecked()) Log.d("MainActivity", "Nombre: ");
            editTxtNombre.requestFocus();
        }
    }

}