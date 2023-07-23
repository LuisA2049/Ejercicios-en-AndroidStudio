package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public EditText txtNumeros;
public Button btnMas;
public Button btnCero;
public Button btnMenos;

int numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumeros=(EditText) findViewById(R.id.txtNumeros);
        btnMas=(Button) findViewById(R.id.btnMas);
        btnCero=(Button) findViewById(R.id.btnCero);
        btnMenos=(Button) findViewById(R.id.btnMenos);

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero += 1;

            txtNumeros.setText(Integer.toString(numero));
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = 0;
                txtNumeros.setText(Integer.toString(numero));
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero -= 1;
                txtNumeros.setText(Integer.toString(numero ));
            }
        });



    }
}