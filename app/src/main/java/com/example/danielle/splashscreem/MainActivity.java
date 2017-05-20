package com.example.danielle.splashscreem;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilNome;
    private TextInputLayout tilIdade;
    private Spinner spTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tilNome = (TextInputLayout) findViewById(R.id.tilNome);
        tilIdade = (TextInputLayout) findViewById(R.id.tilIdade);
        spTimes = (Spinner) findViewById(R.id.spTimes);
    }

    //é a partir da view que sai o evento
    public void cadastrar(View v) {

        //de que classe, para qual classe e que horas (startActivity)
        Intent intencaoConfirmar = new Intent(this, ConfirmacaoActivity.class);

        //campos que vou enviar para a outra classe
        intencaoConfirmar.putExtra("NOME", tilNome.getEditText().getText().toString());
        intencaoConfirmar.putExtra("IDADE", tilIdade.getEditText().getText().toString());
        intencaoConfirmar.putExtra("TIME", spTimes.getSelectedItem().toString());

        startActivity(intencaoConfirmar);

    }

}
