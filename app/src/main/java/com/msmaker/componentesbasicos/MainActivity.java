package com.msmaker.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        resultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view) {
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        resultado.setText("Nome: " + nome + " \nEmail: " + email);
    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}
