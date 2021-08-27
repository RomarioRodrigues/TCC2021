package com.example.jokempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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
    public void irTexto (View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(intent);
    }
}