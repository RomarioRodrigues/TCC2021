package com.example.jokempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;



public class MainActivity extends AppCompatActivity {
    private EditText barraPesquisa;
    boolean pesquisaBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barraPesquisa = findViewById(R.id.barraPesquisa);
    }
    public void barraP (View view)
    {
        if (pesquisaBar == true) {
            barraPesquisa.setVisibility(View.VISIBLE);
            pesquisaBar = false;
        }else {
            barraPesquisa.setVisibility(View.GONE);
            pesquisaBar = true;
         }
    }
    public void irChat (View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intent);
    }
    public void irPerfil (View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }
    public void irInicio(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    }

