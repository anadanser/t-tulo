package com.example.angui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.angui.modelo.Votante;

public class MainActivity extends AppCompatActivity {
    EditText nascimento;
    Button confirmar;
    int anoAtual = 2022;
    Votante pessoa = new Votante();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nascimento = findViewById(R.id.editTextTextPersonName);
        confirmar = findViewById(R.id.button);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] valorComSplit = nascimento.getText().toString().split("/", 3);
                int anoNacimento = Integer.parseInt(valorComSplit[2]);
                pessoa.calcularIdade(anoAtual, anoNacimento);
                if(pessoa.isPodeVotar()) {
                    Intent intent = new Intent(getApplicationContext(), VotarActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), NaoVotarActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}