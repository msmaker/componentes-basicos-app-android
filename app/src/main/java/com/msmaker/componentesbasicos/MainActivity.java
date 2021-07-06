package com.msmaker.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView textResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton sexoMasculino, sexoFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textResultado = findViewById(R.id.textResultado);

        //CheckBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        sexoFeminino = findViewById(R.id.radioButtonFeminino);

    }

    public void radioButton() {
        if (sexoMasculino.isChecked()) {

            textResultado.setText("Masculino");

        } else if (sexoFeminino.isChecked()) {

            textResultado.setText("Feminino");

        }
    }

    public void enviar(View view) {

        radioButton();
        //checkBox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textResultado.setText("Nome: " + nome + " \nEmail: " + email);
        */

    }

    public void checkBox() {

        String texto = "";

        if (checkVerde.isChecked()) {
            // String corSelecionada = checkVerde.getText().toString();
            //texto = corSelecionada;
            texto = "Verde selecionado -";

        }

        if (checkBranco.isChecked()) {
            texto = texto + "Branco selecionado -";
        }

        if (checkVermelho.isChecked()) {
            texto = texto + "Vermelho selecionado -";
        }

        textResultado.setText(texto);
    }


    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}
