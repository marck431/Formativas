package com.CMF.botones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Math;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables
    Button btn1, btn2;
    EditText e1;
    ConstraintLayout fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Asignacion de variables con los id de la activity */
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        e1 = (EditText) findViewById(R.id.tv2);
        fondo = (ConstraintLayout) findViewById(R.id.fondo);

        //evento onClick que convierte mayuscula o minuscula
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = e1.getText().toString();
                if (esMinuscula(texto)){
                    e1.setText(texto.toUpperCase());
                }
                if(esMayuscula(texto)){
                    e1.setText(texto.toLowerCase());
                };
            }

        });

        // Evento onClick que cambia el fondo aleatorio de la vista
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setBackgroundColor(Color.rgb((int) (Math.random()*255+1), (int) (Math.random()*255+1),(int) (Math.random()*255+1)));
            }
        });
    }
    // Verificar si es mayuscula o minuscula
    private boolean esMinuscula(String s) {
        // Regresa el resultado de comparar la original con sun versión minúscula
        return s.equals(s.toLowerCase());
    };
    private boolean esMayuscula(String s) {
        // Regresa el resultado de comparar la original con sun versión minúscula
        return s.equals(s.toUpperCase());
    };
}
