package com.codeline.logoinicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);
        getSupportActionBar().hide();

    }
}