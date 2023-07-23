package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

private Context cn=this;
public Button btnSig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSig=(Button) findViewById(R.id.btnSig);

        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent open = new Intent(cn, MainActivity2.class);
                startActivity(open);

            }
        });


    }
}