package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class segundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        Intent parametro = getIntent();

        String pnombre = parametro.getStringExtra("nombre");
        Toast.makeText(this,pnombre,Toast.LENGTH_LONG).show();
    }
}
