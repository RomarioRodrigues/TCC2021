package com.example.jokempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void irLogin (View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);
    }
}