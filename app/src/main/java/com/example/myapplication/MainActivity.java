package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViewContador;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewContador = findViewById(R.id.textViewContador);


        textViewContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contador++;


                textViewContador.setText("Cliques: " + contador);
            }
        });
    }
}