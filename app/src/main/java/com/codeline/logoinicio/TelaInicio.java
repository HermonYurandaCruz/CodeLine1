package com.codeline.logoinicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaInicio extends AppCompatActivity {
private TextView tv_telaInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);
        getSupportActionBar().hide();


        //abrir tela cadastro
        IniciarCadasgtro();
        tv_telaInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TelaInicio.this,TelaCadastro.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarCadasgtro() {tv_telaInicio=findViewById(R.id.Tv_novaConta);}

    ///abrir tela login
    public void AbrirTelaLogin(View view){
        Intent intent=new Intent(TelaInicio.this,TelaLogin.class);
        startActivity(intent);


    }

}