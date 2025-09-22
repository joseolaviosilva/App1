package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class tabuadaResultado extends AppCompatActivity {

    Button button;
    TextView tvResultado1;
    TextView tvResultado2;
    TextView tvResultado3;
    TextView tvResultado4;
    TextView tvResultado5;
    TextView tvResultado6;
    TextView tvResultado7;
    TextView tvResultado8;
    TextView tvResultado9;
    TextView tvResultado10;




    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tabuada_resultado);



        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double Numero = bundle.getDouble("Numero");

        Double result1 = Numero * 1;
        Double result2 = Numero * 2;
        Double result3 = Numero * 3;
        Double result4 = Numero * 4;
        Double result5 = Numero * 5;
        Double result6 = Numero * 6;
        Double result7 = Numero * 7;
        Double result8 = Numero * 8;
        Double result9 = Numero * 9;
        Double result10 = Numero * 10;


        tvResultado1.setText(Double.toString(result1));
        tvResultado2.setText(Double.toString(result2));
        tvResultado3.setText(Double.toString(result3));
        tvResultado4.setText(Double.toString(result4));
        tvResultado5.setText(Double.toString(result5));
        tvResultado6.setText(Double.toString(result6));
        tvResultado7.setText(Double.toString(result7));
        tvResultado8.setText(Double.toString(result8));
        tvResultado9.setText(Double.toString(result9));
        tvResultado10.setText(Double.toString(result10));

    }
}